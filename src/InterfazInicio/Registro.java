package InterfazInicio;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Principal.Funciones;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

public class Registro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldUsuario;
    private JTextField textFieldApellido1;
    private JTextField textFieldApellido2;
    private JPasswordField passwordField;
    private JTextField textFieldCorreo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registro frame = new Registro();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Registro() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBounds(100, 100, 526, 375);
        
        // Configuración del panel principal con GridBagLayout
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.DARK_GRAY);
        setContentPane(contentPane);
        contentPane.setLayout(new GridBagLayout());

        // Configuración de los componentes de registro
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridx = 1;
        gbc.gridy = 0;
        
                JLabel lblUsuario = new JLabel("Nombre de usuario");
                lblUsuario.setForeground(Color.GREEN);
                lblUsuario.setFont(new Font("Miriam Libre", Font.BOLD, 14));
                GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
                gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
                gbc_lblUsuario.gridx = 0;
                gbc_lblUsuario.gridy = 0;
                contentPane.add(lblUsuario, gbc_lblUsuario);
        gbc.gridx = 0;
        gbc.gridy = 1;
                
                JLabel lblApellido1 = new JLabel("1-Apellido");
                lblApellido1.setForeground(Color.GREEN);
                lblApellido1.setFont(new Font("Miriam Libre", Font.BOLD, 14));
                GridBagConstraints gbc_lblApellido1 = new GridBagConstraints();
                gbc_lblApellido1.insets = new Insets(0, 0, 5, 5);
                gbc_lblApellido1.gridx = 2;
                gbc_lblApellido1.gridy = 0;
                contentPane.add(lblApellido1, gbc_lblApellido1);
                
                        JLabel lblApellido2 = new JLabel("2-Apellido");
                        lblApellido2.setForeground(Color.GREEN);
                        lblApellido2.setFont(new Font("Miriam Libre", Font.BOLD, 14));
                        GridBagConstraints gbc_lblApellido2 = new GridBagConstraints();
                        gbc_lblApellido2.insets = new Insets(0, 0, 5, 5);
                        gbc_lblApellido2.gridx = 4;
                        gbc_lblApellido2.gridy = 0;
                        contentPane.add(lblApellido2, gbc_lblApellido2);
                
                        JLabel lblContraseña = new JLabel("Contraseña");
                        lblContraseña.setForeground(Color.GREEN);
                        lblContraseña.setFont(new Font("Miriam Libre", Font.BOLD, 14));
                        GridBagConstraints gbc_lblContraseña = new GridBagConstraints();
                        gbc_lblContraseña.insets = new Insets(0, 0, 5, 5);
                        gbc_lblContraseña.gridx = 6;
                        gbc_lblContraseña.gridy = 0;
                        contentPane.add(lblContraseña, gbc_lblContraseña);
                
                        JLabel lblCorreo = new JLabel("Correo");
                        lblCorreo.setForeground(Color.GREEN);
                        lblCorreo.setFont(new Font("Miriam Libre", Font.BOLD, 14));
                        GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
                        gbc_lblCorreo.insets = new Insets(0, 0, 5, 0);
                        gbc_lblCorreo.gridx = 8;
                        gbc_lblCorreo.gridy = 0;
                        contentPane.add(lblCorreo, gbc_lblCorreo);
        
                textFieldUsuario = new JTextField();
                textFieldUsuario.setForeground(Color.BLACK);
                textFieldUsuario.setColumns(20); // Aumentamos el número de columnas para que el campo sea más largo
                textFieldUsuario.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
                GridBagConstraints gbc_textFieldUsuario = new GridBagConstraints();
                gbc_textFieldUsuario.insets = new Insets(0, 0, 5, 5);
                gbc_textFieldUsuario.gridx = 0;
                gbc_textFieldUsuario.gridy = 1;
                contentPane.add(textFieldUsuario, gbc_textFieldUsuario);
                
                String Usuario = textFieldUsuario.getText();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.gridy = 2;
        
                textFieldApellido1 = new JTextField();
                textFieldApellido1.setForeground(Color.BLACK);
                textFieldApellido1.setColumns(20); // Aumentamos el número de columnas para que el campo sea más largo
                textFieldApellido1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
                GridBagConstraints gbc_textFieldApellido1 = new GridBagConstraints();
                gbc_textFieldApellido1.insets = new Insets(0, 0, 5, 5);
                gbc_textFieldApellido1.gridx = 2;
                gbc_textFieldApellido1.gridy = 1;
                contentPane.add(textFieldApellido1, gbc_textFieldApellido1);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridy = 3;
        
                textFieldApellido2 = new JTextField();
                textFieldApellido2.setForeground(Color.BLACK);
                textFieldApellido2.setColumns(20); // Aumentamos el número de columnas para que el campo sea más largo
                textFieldApellido2.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
                GridBagConstraints gbc_textFieldApellido2 = new GridBagConstraints();
                gbc_textFieldApellido2.insets = new Insets(0, 0, 5, 5);
                gbc_textFieldApellido2.gridx = 4;
                gbc_textFieldApellido2.gridy = 1;
                contentPane.add(textFieldApellido2, gbc_textFieldApellido2);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridy = 4;
        
                passwordField = new JPasswordField();
                GridBagConstraints gbc_passwordField = new GridBagConstraints();
                passwordField.setColumns(30);
                gbc_passwordField.insets = new Insets(0, 0, 5, 5);
                gbc_passwordField.gridx = 6;
                gbc_passwordField.gridy = 1;
                contentPane.add(passwordField, gbc_passwordField);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        
                textFieldCorreo = new JTextField();
                textFieldCorreo.setForeground(Color.BLACK);
                textFieldCorreo.setColumns(30); // Aumentamos el número de columnas para que el campo sea más largo
                textFieldCorreo.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
                GridBagConstraints gbc_textFieldCorreo = new GridBagConstraints();
                gbc_textFieldCorreo.insets = new Insets(0, 0, 5, 0);
                gbc_textFieldCorreo.gridx = 8;
                gbc_textFieldCorreo.gridy = 1;
                contentPane.add(textFieldCorreo, gbc_textFieldCorreo);
        String Nombre = null;
        String Apellido1 = null;
        String Apellido2 = null;
        String correo = null;
        String Contraseña = null;
        String compContr = null;
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
                                                                
                                                                        JButton btnRegistrarse = new JButton("Registrarse");
                                                                        btnRegistrarse.setForeground(Color.BLACK);
                                                                        btnRegistrarse.setBackground(Color.WHITE);
                                                                        btnRegistrarse.setFont(new Font("Miriam Libre", Font.BOLD, 18));
                                                                        btnRegistrarse.setPreferredSize(new Dimension(150, 30));
                                                                        GridBagConstraints gbc_btnRegistrarse = new GridBagConstraints();
                                                                        gbc_btnRegistrarse.insets = new Insets(0, 0, 0, 5);
                                                                        gbc_btnRegistrarse.gridx = 4;
                                                                        gbc_btnRegistrarse.gridy = 11;
                                                                        contentPane.add(btnRegistrarse, gbc_btnRegistrarse);
                                                                        
                                                                                JButton btnIniciarSesión = new JButton("Iniciar Sesión");
                                                                                btnIniciarSesión.setForeground(Color.BLACK);
                                                                                btnIniciarSesión.setBackground(Color.WHITE);
                                                                                btnIniciarSesión.setFont(new Font("Miriam Libre", Font.BOLD, 12));
                                                                                btnIniciarSesión.setPreferredSize(new Dimension(125, 25));
                                                                                GridBagConstraints gbc_btnIniciarSesión = new GridBagConstraints();
                                                                                gbc_btnIniciarSesión.gridx = 6;
                                                                                gbc_btnIniciarSesión.gridy = 11;
                                                                                gbc_btnIniciarSesión.insets = new Insets(10, 10, 10, 10);
                                                                                contentPane.add(btnIniciarSesión, gbc_btnIniciarSesión);
                                                                                // ActionListener para el botón "Iniciar Sesión"
                                                                                   btnIniciarSesión.addActionListener(new ActionListener() {
                                                                                       public void actionPerformed(ActionEvent e) {
                                                                                           // Cierra la ventana de Registro
                                                                                           dispose();
                                                                                           // Abre la ventana de Inicio De Sesión
                                                                                           InicioSesion inicioSesion = new InicioSesion();
                                                                                           inicioSesion.setVisible(true);
                                                                                       }
                                                                                   });
                                                                        
                                                                        //Botón de registro, acción
                                                                        btnRegistrarse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Funciones.AnadirNombre(Nombre);
				Funciones.AnadirApellido1(Apellido1);
				Funciones.AnadirApellido2(Apellido2);
				Funciones.AnadirCorreo(correo);
				Funciones.AnadirNombreUsuario(Usuario);
				
				if(Funciones.ConfirmarContrasena(Contraseña, compContr)) {
					Funciones.AnadirContrasena(Contraseña);
				}
				
			}
		});
    }
}

