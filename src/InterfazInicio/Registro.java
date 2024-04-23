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

public class Registro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldUsuario;
    private JTextField textFieldApellido1;
    private JTextField textFieldApellido2;
    private JPasswordField passwordField;
    private JTextField textFieldCorreo;
    private JTextField textFieldFechaNacimiento;

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

        JLabel lblUsuario = new JLabel("Nombre de usuario");
        lblUsuario.setForeground(Color.GREEN);
        lblUsuario.setFont(new Font("Miriam Libre", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 0;
        contentPane.add(lblUsuario, gbc);

        textFieldUsuario = new JTextField();
        textFieldUsuario.setForeground(Color.BLACK);
        textFieldUsuario.setColumns(20); // Aumentamos el número de columnas para que el campo sea más largo
        textFieldUsuario.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
        gbc.gridx = 1;
        gbc.gridy = 0;
        contentPane.add(textFieldUsuario, gbc);

        JLabel lblApellido1 = new JLabel("Apellido1");
        lblApellido1.setForeground(Color.GREEN);
        lblApellido1.setFont(new Font("Miriam Libre", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 1;
        contentPane.add(lblApellido1, gbc);

        textFieldApellido1 = new JTextField();
        textFieldApellido1.setForeground(Color.BLACK);
        textFieldApellido1.setColumns(20); // Aumentamos el número de columnas para que el campo sea más largo
        textFieldApellido1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
        gbc.gridx = 1;
        gbc.gridy = 1;
        contentPane.add(textFieldApellido1, gbc);

        JLabel lblApellido2 = new JLabel("Apellido2");
        lblApellido2.setForeground(Color.GREEN);
        lblApellido2.setFont(new Font("Miriam Libre", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 2;
        contentPane.add(lblApellido2, gbc);

        textFieldApellido2 = new JTextField();
        textFieldApellido2.setForeground(Color.BLACK);
        textFieldApellido2.setColumns(20); // Aumentamos el número de columnas para que el campo sea más largo
        textFieldApellido2.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
        gbc.gridx = 1;
        gbc.gridy = 2;
        contentPane.add(textFieldApellido2, gbc);

        JLabel lblContraseña = new JLabel("Contraseña");
        lblContraseña.setForeground(Color.GREEN);
        lblContraseña.setFont(new Font("Miriam Libre", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 3;
        contentPane.add(lblContraseña, gbc);

        passwordField = new JPasswordField();
        gbc.gridx = 1;
        gbc.gridy = 3;
        contentPane.add(passwordField, gbc);

        JLabel lblCorreo = new JLabel("Correo");
        lblCorreo.setForeground(Color.GREEN);
        lblCorreo.setFont(new Font("Miriam Libre", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 4;
        contentPane.add(lblCorreo, gbc);

        textFieldCorreo = new JTextField();
        textFieldCorreo.setForeground(Color.BLACK);
        textFieldCorreo.setColumns(30); // Aumentamos el número de columnas para que el campo sea más largo
        textFieldCorreo.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
        gbc.gridx = 1;
        gbc.gridy = 4;
        contentPane.add(textFieldCorreo, gbc);

        JButton btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.setForeground(Color.BLACK);
        btnRegistrarse.setBackground(Color.WHITE);
        btnRegistrarse.setFont(new Font("Miriam Libre", Font.BOLD, 18));
        btnRegistrarse.setPreferredSize(new Dimension(150, 30));
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        contentPane.add(btnRegistrarse, gbc);

        JButton btnIniciarSesión = new JButton("Iniciar Sesión");
        btnIniciarSesión.setForeground(Color.BLACK);
        btnIniciarSesión.setBackground(Color.WHITE);
        btnIniciarSesión.setFont(new Font("Miriam Libre", Font.BOLD, 12));
        btnIniciarSesión.setPreferredSize(new Dimension(125, 25));
        GridBagConstraints gbc_btnIniciarSesión = new GridBagConstraints();
        gbc_btnIniciarSesión.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        contentPane.add(btnIniciarSesión, gbc);
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
    }
}

