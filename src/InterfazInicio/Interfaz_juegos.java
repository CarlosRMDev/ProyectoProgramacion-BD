package InterfazInicio;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interfaz_juegos extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Interfaz_juegos frame = new Interfaz_juegos();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Interfaz_juegos() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        // Crear un JPanel personalizado con la imagen de fondo
        contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen desde el archivo
                Image imagenFondo = new ImageIcon("C:\\Users\\Usuario1\\Documents\\GitHub\\ProyectoProgramacion-BD\\Nueva carpeta\\prado_background.jpg").getImage();
                // Dibujar la imagen de fondo
                g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
            }
        };
        contentPane.setLayout(null); // Puedes cambiar el layout según sea necesario

        // Agregar los botones al JPanel
        JButton btnJuego1 = new JButton("Juego1");
        btnJuego1.setBounds(100, 150, 200, 50); // Cambia las coordenadas y dimensiones según sea necesario
        contentPane.add(btnJuego1);

        JButton btnJuego2 = new JButton("Juego2");
        btnJuego2.setBounds(100, 250, 200, 50); // Cambia las coordenadas y dimensiones según sea necesario
        contentPane.add(btnJuego2);

        JButton btnJuego3 = new JButton("Juego3");
        btnJuego3.setBounds(100, 350, 200, 50); // Cambia las coordenadas y dimensiones según sea necesario
        contentPane.add(btnJuego3);

        setContentPane(contentPane);
    }
}

