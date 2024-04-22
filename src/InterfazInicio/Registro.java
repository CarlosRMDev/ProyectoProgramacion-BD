package InterfazInicio;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BaseDatos.ConexionMySQL;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.Date;

public class Registro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldUsuario;
    private JTextField textFieldApellido1;
    private JTextField textFieldApellido2;
    private JPasswordField passwordField;
    private JTextField textFieldCorreo;
    private JTextField textFieldFechaNacimiento;
    
    // Creación de la ventana de registro

    public static void main(String[] args) {
    	ConexionMySQL conexion = new ConexionMySQL("root", "test", "ProyectoBD");
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

    //Vamos a crear cada uno de los bloques necesarios para realizar el registro.
    //Tenemos que unir todos los bloques de registro con nuestra base de datos.
    public Registro() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Esto es para que la X sea para cerrar el programa
        setExtendedState(JFrame.MAXIMIZED_BOTH); //Para que aparezca en pantalla completa
        setBounds(100, 100, 526, 375);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        //Texto de Usuario
        textFieldUsuario = new JTextField();
        textFieldUsuario.setBounds(188, 68, 130, 26);
        contentPane.add(textFieldUsuario);
        textFieldUsuario.setColumns(10);

        //Ventana de Usuario
        JLabel lblUsuario = new JLabel("Nombre de usuario");
        lblUsuario.setBounds(80, 73, 120, 16);
        contentPane.add(lblUsuario);

        //Texto de Apellido1
        textFieldApellido1 = new JTextField();
        textFieldApellido1.setBounds(188, 106, 130, 26);
        contentPane.add(textFieldApellido1);
        textFieldApellido1.setColumns(20);

        //Ventana de Apellido1
        JLabel lblApellido1 = new JLabel("Apellido1");
        lblApellido1.setBounds(130, 111, 76, 16);
        contentPane.add(lblApellido1);

        //Texto de Apellido2
        textFieldApellido2 = new JTextField();
        textFieldApellido2.setBounds(188, 144, 130, 26);
        contentPane.add(textFieldApellido2);
        textFieldApellido2.setColumns(10);

        //Ventana de Apellido2
        JLabel lblApellido2 = new JLabel("Apellido2");
        lblApellido2.setBounds(130, 149, 76, 16);
        contentPane.add(lblApellido2);

        //Texto de Password
        passwordField = new JPasswordField();
        passwordField.setBounds(188, 182, 130, 26);
        contentPane.add(passwordField);

        //Ventana de Password
        JLabel lblContraseña = new JLabel("Contraseña");
        lblContraseña.setBounds(110, 187, 76, 16);
        contentPane.add(lblContraseña);

        //Texto de Correo
        textFieldCorreo = new JTextField();
        textFieldCorreo.setBounds(188, 220, 130, 26);
        contentPane.add(textFieldCorreo);
        textFieldCorreo.setColumns(10);

        //Ventana de Correo
        JLabel lblCorreo = new JLabel("Correo");
        lblCorreo.setBounds(130, 225, 61, 16);
        contentPane.add(lblCorreo);

        //Texto fecha de nacimiento
        textFieldFechaNacimiento = new JTextField();
        textFieldFechaNacimiento.setBounds(188, 258, 130, 26);
        contentPane.add(textFieldFechaNacimiento);
        textFieldFechaNacimiento.setColumns(10);

        //Ventana de fecha de nacimiento 
        JLabel lblFechaNacimiento = new JLabel("Fecha de nacimiento");
        lblFechaNacimiento.setBounds(60, 263, 130, 16);
        contentPane.add(lblFechaNacimiento);

        JButton btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar la lógica para registrarse
            }
        });
        btnRegistrarse.setBounds(157, 296, 117, 29);
        contentPane.add(btnRegistrarse);
    }
}

