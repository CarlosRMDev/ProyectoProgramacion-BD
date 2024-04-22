package InterfazInicio;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textFieldUsuario = new JTextField();
        textFieldUsuario.setBounds(188, 68, 130, 26);
        contentPane.add(textFieldUsuario);
        textFieldUsuario.setColumns(10);

        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setBounds(130, 73, 61, 16);
        contentPane.add(lblUsuario);

        passwordField = new JPasswordField();
        passwordField.setBounds(188, 106, 130, 26);
        contentPane.add(passwordField);

        JLabel lblContraseña = new JLabel("Contraseña");
        lblContraseña.setBounds(110, 111, 76, 16);
        contentPane.add(lblContraseña);

        JButton btnIniciarSesion = new JButton("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar la lógica para iniciar sesión
            }
        });
        btnIniciarSesion.setBounds(157, 144, 117, 29);
        contentPane.add(btnIniciarSesion);

        JButton btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                Registro registro = new Registro();
                registro.setVisible(true);
                dispose();
               }
        });
        btnRegistrarse.setBounds(157, 185, 117, 29);
        contentPane.add(btnRegistrarse);

    }
}

