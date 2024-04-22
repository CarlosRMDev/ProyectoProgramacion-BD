package InterfazInicio;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Component;

public class InicioSesion extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldUsuario;
    private JPasswordField passwordField;
    private JTextField textFieldNombre;
    private JTextField textFieldApellido1;
    private JTextField textFieldApellido2;
    private JTextField textFieldCorreo;
    private JTextField textFieldFechaNacimiento;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InicioSesion frame = new InicioSesion();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public InicioSesion() {
    	// Configuración de la ventana
    
    	setBounds(100, 100, 450, 300);
    	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        

    	// Configuración del panel principal
    	contentPane = new JPanel();
    	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    	contentPane.setBackground(Color.DARK_GRAY); // Color de fondo
    	setContentPane(contentPane);
    	contentPane.setLayout(null);

    	// Configuración de la etiqueta "Usuario"
    	JLabel lblUsuario = new JLabel("Usuario");
    	lblUsuario.setBounds(78, 49, 55, 19);
    	lblUsuario.setForeground(Color.GREEN); // Color del texto
    	lblUsuario.setFont(new Font("Miriam Libre", Font.BOLD, 14));
    	contentPane.add(lblUsuario);

    	// Configuración del campo de texto del usuario
    	textFieldUsuario = new JTextField();
    	textFieldUsuario.setBounds(144, 46, 230, 24);
    	textFieldUsuario.setForeground(Color.BLACK);
    	textFieldUsuario.setColumns(10);
    	textFieldUsuario.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
    	contentPane.add(textFieldUsuario);

    	// Configuración de la etiqueta "Contraseña"
    	JLabel lblContraseña = new JLabel("Contraseña");
    	lblContraseña.setBounds(60, 97, 79, 19);
    	lblContraseña.setForeground(Color.GREEN); // Color del texto
    	lblContraseña.setFont(new Font("Miriam Libre", Font.BOLD, 14));
    	contentPane.add(lblContraseña);
    	
    	    	// Configuración del botón "Registrarse"
    	    	JButton btnRegistrarse = new JButton("Registrarse");
    	    	btnRegistrarse.setBounds(194, 225, 125, 25);
    	    	btnRegistrarse.setAlignmentY(Component.BOTTOM_ALIGNMENT);
    	    	btnRegistrarse.setForeground(Color.BLACK);
    	    	btnRegistrarse.setBackground(Color.WHITE);
    	    	btnRegistrarse.setFont(new Font("Miriam Libre", Font.BOLD, 12)); // Aumenta el tamaño de la fuente
    	    	btnRegistrarse.setPreferredSize(new Dimension(125, 25)); // Aumenta el tamaño del botón
    	    	btnRegistrarse.addActionListener(e -> {
    	    	    dispose();
    	    	    Registro registro = new Registro();
    	    	    registro.setVisible(true);

    	    	});
    	    	contentPane.add(btnRegistrarse);

    	// Configuración del campo de texto de la contraseña
    	passwordField = new JPasswordField();
    	passwordField.setBounds(144, 101, 230, 24);
    	passwordField.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
    	contentPane.add(passwordField);
    	
    	    	// Configuración del botón "Iniciar Sesión"
    	    	JButton btnIniciarSesion = new JButton("Iniciar Sesión");
    	    	btnIniciarSesion.setBounds(144, 174, 230, 40);
    	    	btnIniciarSesion.setForeground(Color.BLACK); // Color del texto
    	    	btnIniciarSesion.setBackground(Color.WHITE); // Color de fondo
    	    	btnIniciarSesion.setFont(new Font("Miriam Libre", Font.BOLD, 24)); // Fuente 
    	    	btnIniciarSesion.setPreferredSize(new Dimension(230, 40));
    	    	btnIniciarSesion.addActionListener(e -> {
    	    	    // Aquí puedes agregar la lógica para iniciar sesión
    	    	});
    	    	contentPane.add(btnIniciarSesion);
    }
}