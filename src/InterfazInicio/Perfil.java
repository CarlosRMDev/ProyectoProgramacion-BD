package InterfazInicio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.PreguntasYRespuestas;

import java.awt.Font;
import javax.swing.SwingConstants;

public class Perfil extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perfil frame = new Perfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Perfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setBackground(Color.white);
		
		//Nombre Usuario
		JButton btnNewButton = new JButton("Hola");//InicioSesion.textFieldUsuario.getText().toUpperCase()
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Crear una instancia de la clase OtroArchivo
		    	Inter_juego inter = new Inter_juego();
		        
		        // Hacer visible la ventana del otro archivo
		        inter.setVisible(true);
		        
		        // Cerrar la ventana actual si es necesario
		        dispose();
			}
		});
		btnNewButton.setFont(new Font("DejaVu Math TeX Gyre", Font.PLAIN, 11));
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setIcon(new ImageIcon("Imagenes/icono (1).png"));
		btnNewButton.setBounds(1620, 55, 199, 46);
		contentPane.add(btnNewButton);
		
		//DATOS JUEGO 1
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(267, 267, 354, 611);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel AimBot = new JLabel("AimBot Ball");
		AimBot.setForeground(Color.WHITE);
		AimBot.setFont(new Font("Arial Black", Font.PLAIN, 31));
		AimBot.setHorizontalAlignment(SwingConstants.CENTER);
		AimBot.setBackground(Color.WHITE);
		AimBot.setBounds(70, 43, 214, 38);
		panel.add(AimBot);
		
		//DATOS JUEGO 2
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(811, 267, 354, 611);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel B00M = new JLabel("B00M");
		B00M.setHorizontalAlignment(SwingConstants.CENTER);
		B00M.setForeground(Color.WHITE);
		B00M.setFont(new Font("Arial Black", Font.PLAIN, 31));
		B00M.setBackground(Color.WHITE);
		B00M.setBounds(70, 43, 214, 38);
		panel_1.add(B00M);
		
		//DATOS JUEGO 3
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(1355, 267, 354, 611);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel AcTrivial = new JLabel("AcTrivial");
		AcTrivial.setBounds(70, 43, 214, 38);
		AcTrivial.setHorizontalAlignment(SwingConstants.CENTER);
		AcTrivial.setForeground(Color.WHITE);
		AcTrivial.setFont(new Font("Arial Black", Font.PLAIN, 31));
		AcTrivial.setBackground(Color.WHITE);
		panel_2.add(AcTrivial);
		
		//FONDO
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 1933, 1064);
		contentPane.add(Fondo);
		Fondo.setIcon(new ImageIcon("Imagenes/digital-art-pixel-art-pixels-landscape-nature-couple-1350127-wallhere.com.jpg"));
	}
}
