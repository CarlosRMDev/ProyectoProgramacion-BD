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
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

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
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setExtendedState(JFrame.MAXIMIZED_BOTH); // Pantalla completa
    	setBounds(100, 100, 450, 300);

    	// Configuración del panel principal
    	contentPane = new JPanel();
    	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    	contentPane.setBackground(Color.DARK_GRAY); // Color de fondo
    	setContentPane(contentPane);
    	GridBagLayout gbl_contentPane = new GridBagLayout();
    	contentPane.setLayout(gbl_contentPane);

    	// Configuración de la etiqueta "Usuario"
    	JLabel lblUsuario = new JLabel("Usuario");
    	lblUsuario.setForeground(Color.GREEN); // Color del texto
    	lblUsuario.setFont(new Font("Miriam Libre", Font.BOLD, 14)); // Fuente gaming
    	GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
    	gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
    	gbc_lblUsuario.gridx = 0;
    	gbc_lblUsuario.gridy = 0;
    	contentPane.add(lblUsuario, gbc_lblUsuario);

    	// Configuración del campo de texto del usuario
    	textFieldUsuario = new JTextField();
    	textFieldUsuario.setForeground(Color.BLACK);
    	textFieldUsuario.setColumns(10);
    	textFieldUsuario.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); 
    	GridBagConstraints gbc_textFieldUsuario = new GridBagConstraints();
    	gbc_textFieldUsuario.insets = new Insets(0, 0, 5, 0);
    	gbc_textFieldUsuario.fill = GridBagConstraints.HORIZONTAL;
    	gbc_textFieldUsuario.gridx = 1;
    	gbc_textFieldUsuario.gridy = 0;
    	contentPane.add(textFieldUsuario, gbc_textFieldUsuario);

    	// Configuración de la etiqueta "Contraseña"
    	JLabel lblContraseña = new JLabel("Contraseña");
    	lblContraseña.setForeground(Color.GREEN); // Color del texto
    	lblContraseña.setFont(new Font("Miriam Libre", Font.BOLD, 14));
    	GridBagConstraints gbc_lblContraseña = new GridBagConstraints();
    	gbc_lblContraseña.insets = new Insets(0, 0, 5, 5);
    	gbc_lblContraseña.gridx = 0;
    	gbc_lblContraseña.gridy = 1;
    	contentPane.add(lblContraseña, gbc_lblContraseña);

    	// Configuración del campo de texto de la contraseña
    	passwordField = new JPasswordField();
    	passwordField.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
    	GridBagConstraints gbc_passwordField = new GridBagConstraints();
    	gbc_passwordField.insets = new Insets(0, 0, 5, 0);
    	gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
    	gbc_passwordField.gridx = 1;
    	gbc_passwordField.gridy = 1;
    	contentPane.add(passwordField, gbc_passwordField);

    	// Configuración del botón "Iniciar Sesión"
    	JButton btnIniciarSesion = new JButton("Iniciar Sesión");
    	btnIniciarSesion.setForeground(Color.BLACK); // Color del texto
    	btnIniciarSesion.setBackground(Color.WHITE); // Color de fondo
    	btnIniciarSesion.setFont(new Font("Miriam Libre", Font.BOLD, 24)); // Fuente gaming
    	btnIniciarSesion.setPreferredSize(getPreferredSize());
    	btnIniciarSesion.addActionListener(e -> {
    	    // Aquí puedes agregar la lógica para iniciar sesión
    	});
    	GridBagConstraints gbc_btnIniciarSesion = new GridBagConstraints();
    	gbc_btnIniciarSesion.insets = new Insets(0, 0, 5, 0);
    	gbc_btnIniciarSesion.gridx = 1;
    	gbc_btnIniciarSesion.gridy = 2;
    	contentPane.add(btnIniciarSesion, gbc_btnIniciarSesion);

    	// Configuración del botón "Registrarse"
    	JButton btnRegistrarse = new JButton("Registrarse");
    	btnRegistrarse.setForeground(Color.BLACK);
    	btnRegistrarse.setBackground(Color.WHITE);
    	btnRegistrarse.setFont(new Font("Miriam Libre", Font.BOLD, 12)); // Aumenta el tamaño de la fuente
    	btnRegistrarse.setPreferredSize(new Dimension(200, 50)); // Aumenta el tamaño del botón
    	btnRegistrarse.addActionListener(e -> {
    	    dispose();
    	    Registro registro = new Registro();
    	    registro.setVisible(true);

    	});
    	GridBagConstraints gbc_btnRegistrarse = new GridBagConstraints();
    	gbc_btnRegistrarse.gridx = 1;
    	gbc_btnRegistrarse.gridy = 3;
    	contentPane.add(btnRegistrarse, gbc_btnRegistrarse);
    }
}