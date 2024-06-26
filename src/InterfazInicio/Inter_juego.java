package InterfazInicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.AdivinaElNumero;
import Juego.CircleGame;
import Juego.PreguntasYRespuestas;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.Frame;

public class Inter_juego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inter_juego frame = new Inter_juego();
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
	public Inter_juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setBackground(Color.white);
		
		JButton btnNewButton = 
		new JButton(InicioSesion.textFieldUsuario.getText().toUpperCase());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Crear una instancia de la clase OtroArchivo
		    	Perfil perf = new Perfil();
		        
		        // Hacer visible la ventana del otro archivo
		        perf.setVisible(true);
		        
		        // Cerrar la ventana actual si es necesario
		        dispose();
			}
		});
		btnNewButton.setFont(new Font("DejaVu Math TeX Gyre", Font.PLAIN, 11));
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setIcon(new ImageIcon("Imagenes/icono (1).png"));
		btnNewButton.setBounds(500, 55, 199, 46);
		contentPane.add(btnNewButton);
	
		
		JButton boton_juego3 = new JButton("");
		boton_juego3.setIcon(new ImageIcon("Imagenes/juego3 real.png"));
		boton_juego3.setBounds(638, 683, 617, 128);
		contentPane.add(boton_juego3);
		boton_juego3.addActionListener((ActionListener) new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Crear una instancia de la clase OtroArchivo
		    	PreguntasYRespuestas preg = new PreguntasYRespuestas();
		        
		        // Hacer visible la ventana del otro archivo
		        preg.setVisible(true);
		        
		        // Cerrar la ventana actual si es necesario
		        dispose();
		    }
		    
		});
		
		JButton boton_juego2 = new JButton("");
		boton_juego2.setIcon(new ImageIcon("Imagenes/juego2.png"));
		boton_juego2.setBounds(645, 519, 610, 121);
		contentPane.add(boton_juego2);
		boton_juego2.addActionListener((ActionListener) new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Crear una instancia de la clase OtroArchivo
		    	AdivinaElNumero numero = new AdivinaElNumero();
		        
		        // Hacer visible la ventana del otro archivo
		        numero.setVisible(true);
		        
		        // Cerrar la ventana actual si es necesario
		        dispose();
		    }
		});
		
		JButton boton_juego1 = new JButton("");
		boton_juego1.setIcon(new ImageIcon("Imagenes/juego1.png"));
		boton_juego1.setBounds(645, 345, 617, 128);
		contentPane.add(boton_juego1);
		boton_juego1.addActionListener((ActionListener) new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Crear una instancia de la clase OtroArchivo
		    	CircleGame circulo = new CircleGame();
		        
		        // Hacer visible la ventana del otro archivo
		        circulo.setVisible(true);
		        
		        // Cerrar la ventana actual si es necesario
		        dispose();
		    }
		});

		
		JLabel lblNewLabel = new JLabel("MENÚ DE JUEGOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Miriam Libre", Font.PLAIN, 23));
		lblNewLabel.setForeground(new Color(51, 255, 0));
		lblNewLabel.setBackground(Color.lightGray);
		lblNewLabel.setBounds(823, 128, 221, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Marco");
		lblNewLabel_1.setIcon(new ImageIcon("Imagenes/MARCO INTERFAZ REAL.jpg"));
		lblNewLabel_1.setBounds(777, 122, 310, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel Label_Fondo = new JLabel("");
		Label_Fondo.setIcon(new ImageIcon("Imagenes/digital-art-pixel-art-pixels-landscape-nature-couple-1350127-wallhere.com.jpg"));
		Label_Fondo.setBounds(0, 0, 1933, 1064);
		contentPane.add(Label_Fondo);
	}
}
