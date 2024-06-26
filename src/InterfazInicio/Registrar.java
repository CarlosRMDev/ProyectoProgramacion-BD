package InterfazInicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Principal.Funciones;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.TextField;

public class Registrar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField txtNombre;
	public static JTextField txtApellido1;
	public static JTextField txtApellido2;
	public static JTextField txtUsuario;
	public static JTextField txtCorreo;
	public static JPasswordField passwordField;
	public static JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrar frame = new Registrar();
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
	public Registrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 469);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Primero creamos todos los label, son las etiquetas con los nombres de los campos para el registro. 
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.GREEN);
		lblNombre.setBounds(134, 99, 126, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido1 = new JLabel("Primer Apellido");
		lblApellido1.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblApellido1.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido1.setForeground(Color.GREEN);
		lblApellido1.setBounds(134, 124, 126, 14);
		contentPane.add(lblApellido1);
		
		JLabel lblApellido2 = new JLabel("Segundo Apellido");
		lblApellido2.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblApellido2.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido2.setForeground(Color.GREEN);
		lblApellido2.setBounds(134, 149, 126, 14);
		contentPane.add(lblApellido2);
		
		JLabel lblUsuario = new JLabel("Nombre de Usuario");
		lblUsuario.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setForeground(Color.GREEN);
		lblUsuario.setBounds(134, 174, 126, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasena = new JLabel("Contraseña");
		lblContrasena.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasena.setForeground(Color.GREEN);
		lblContrasena.setBounds(134, 199, 126, 14);
		contentPane.add(lblContrasena);
		
		JLabel lblConfContr = new JLabel("Confirmar contraseña");
		lblConfContr.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblConfContr.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfContr.setForeground(Color.GREEN);
		lblConfContr.setBounds(134, 224, 142, 14);
		contentPane.add(lblConfContr);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreo.setForeground(Color.GREEN);
		lblCorreo.setBounds(134, 249, 126, 14);
		contentPane.add(lblCorreo);
		
		//Añadimos los txtfield que son para ingresar texto en el panel.
		
		txtNombre = new JTextField();
		
		//añadimos en cada uno de ellos un keyListener que es un evento, lo utilizamos para no permitir que se escriban mas de los caracteres 
		//que la base de datos acepta. Nombre 15, Apellidos 1 y 2 20, Usuario 15, Contraseña 15, Correo 45.
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtNombre.getText().length() >= 15) {
					e.consume();
				}
			}
		});
		txtNombre.setBounds(286, 96, 173, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido1 = new JTextField();
		txtApellido1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtApellido1.getText().length() >= 20) {
					e.consume();
				}
			}
		});
		txtApellido1.setBounds(286, 121, 173, 20);
		contentPane.add(txtApellido1);
		txtApellido1.setColumns(10);
		
		txtApellido2 = new JTextField();
		txtApellido2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtApellido2.getText().length() >=20) {
					e.consume();
				}
			}
		});
		txtApellido2.setBounds(286, 146, 173, 20);
		contentPane.add(txtApellido2);
		txtApellido2.setColumns(10);
		
		txtUsuario = new JTextField();
		txtUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtUsuario.getText().length() >=15) {
					e.consume();
				}
			}
		});
		txtUsuario.setBounds(286, 171, 173, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtCorreo.getText().length() >= 45) {
					e.consume();
				}
			}
		});
		txtCorreo.setBounds(286, 246, 173, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (passwordField.getPassword().length >=15) {
					e.consume();
				}
			}
		});
		passwordField.setBounds(286, 196, 173, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (passwordField_1.getPassword().length >=15) {
					e.consume();
				}
			}
		});
		passwordField_1.setBounds(286, 221, 173, 20);
		contentPane.add(passwordField_1);
		
		JButton btnRegistro = new JButton("Registrarse");
		btnRegistro.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (Funciones.Registro()) {
					Funciones.CrearStatsAim();
					Funciones.CrearStatsNum();
					Funciones.CrearStatsTri();
					InicioSesion inicio = new InicioSesion();
					inicio.setVisible(true);
					dispose();
				}
				else {
					InterfazInicio.Registrar.txtUsuario.setText("");
					InterfazInicio.Registrar.txtNombre.setText("");
					InterfazInicio.Registrar.txtApellido1.setText("");
					InterfazInicio.Registrar.txtApellido2.setText("");
					InterfazInicio.Registrar.txtCorreo.setText("");
					InterfazInicio.Registrar.passwordField.setText("");
					InterfazInicio.Registrar.passwordField_1.setText("");
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
				}
			}
		});
		btnRegistro.setBounds(203, 289, 199, 43);
		contentPane.add(btnRegistro);
		
		JLabel lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setBackground(Color.BLACK);
		lblRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistro.setForeground(Color.GREEN);
		lblRegistro.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblRegistro.setBounds(232, 24, 126, 14);
		contentPane.add(lblRegistro);
	}
}
