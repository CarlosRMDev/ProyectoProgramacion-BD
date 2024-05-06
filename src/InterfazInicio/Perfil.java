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
import Principal.Funciones;

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
		JButton btnNewButton = new JButton(InicioSesion.textFieldUsuario.getText().toUpperCase());
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
		btnNewButton.setBounds(500, 55, 199, 46);
		contentPane.add(btnNewButton);
		
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
		
		JLabel lblRecordIntentos = new JLabel("Record Intentos: " + Funciones.SelectRecordIntentos());
		lblRecordIntentos.setForeground(Color.WHITE);
		lblRecordIntentos.setFont(new Font("Arial", Font.PLAIN, 18));
		lblRecordIntentos.setBounds(36, 129, 275, 30);
		panel_1.add(lblRecordIntentos);
		
		JLabel lblPartidasJugadas = new JLabel("Partidas Jugadas: " + Funciones.SelectContador1());
		lblPartidasJugadas.setForeground(Color.WHITE);
		lblPartidasJugadas.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPartidasJugadas.setBounds(36, 247, 275, 30);
		panel_1.add(lblPartidasJugadas);
		
		JLabel lblUltimaPuntuacion_1 = new JLabel("Última Puntuación: " + Funciones.SelectUltIntentos());
		lblUltimaPuntuacion_1.setForeground(Color.WHITE);
		lblUltimaPuntuacion_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblUltimaPuntuacion_1.setBounds(36, 365, 275, 30);
		panel_1.add(lblUltimaPuntuacion_1);
		
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
		
		JLabel lblNotaMxima = new JLabel("Nota Máxima: " + Funciones.SelectNotaMaxima());
		lblNotaMxima.setForeground(Color.WHITE);
		lblNotaMxima.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNotaMxima.setBounds(35, 128, 275, 30);
		panel_2.add(lblNotaMxima);
		
		JLabel lblNmeroDeIntentos = new JLabel("Número de intentos: " + Funciones.SelectContador2());
		lblNmeroDeIntentos.setForeground(Color.WHITE);
		lblNmeroDeIntentos.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNmeroDeIntentos.setBounds(35, 246, 275, 30);
		panel_2.add(lblNmeroDeIntentos);
		
		// DATOS JUEGO 1 - AimBot Ball
		JPanel panelz = new JPanel();
		panelz.setBackground(new Color(0, 0, 0));
		panelz.setBounds(267, 267, 354, 611);
						
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
						
					// Label Puntos Máximos
					JLabel lblPuntosMax = new JLabel("Puntos Máximos: " + Funciones.SelectPuntosMax());
					lblPuntosMax.setForeground(Color.WHITE);
					lblPuntosMax.setFont(new Font("Arial", Font.PLAIN, 18));
					lblPuntosMax.setBounds(50, 131, 275, 30);
					panel.add(lblPuntosMax);
					
					//Para poner BRONCE / PLATA / ORO
					/*
					 * Podemos hacer un if utilizando el dato que recogemos de la base de datos para introducir
					 * tres label en la misma posición delante de la puntuación máxima, hacerlos set visible false
					 * y con los if, else if manejamos cuando aparece uno u otro, y hacemos un ranking de divisiones
					 * Lo hacemos sólo en el del círculo porque no hay más tiempo
					 * 
					 * if (Funciones.SelectContador() <= 95){
					 * noseque.setVisible(true);
					 * }
					 * else if (Funciones.SelectContador() > 95 && Funciones.SelectContador() < 250{
					 * noseque2.setVisible(true);
					 * noseque.setVisible(false);
					 * 
					 * }
					 */
								
					// Label Número de Partidas
					JLabel lblNumPartidas = new JLabel("Número de Partidas: " + Funciones.SelectContador());
					lblNumPartidas.setForeground(Color.WHITE);
					lblNumPartidas.setFont(new Font("Arial", Font.PLAIN, 18));
					lblNumPartidas.setBounds(50, 367, 275, 30);
					panel.add(lblNumPartidas);
					
					// Label Última Puntuación
					JLabel lblUltimaPuntuacion = new JLabel("Última Puntuación: " + Funciones.SelectUltPunt());
					lblUltimaPuntuacion.setForeground(Color.WHITE);
					lblUltimaPuntuacion.setFont(new Font("Arial", Font.PLAIN, 18));
					lblUltimaPuntuacion.setBounds(50, 249, 275, 30);
					panel.add(lblUltimaPuntuacion);
					contentPane.add(panel);
														
					//FONDO
					JLabel Fondo = new JLabel("");
					Fondo.setBounds(0, 0, 1933, 1064);
					contentPane.add(Fondo);
					Fondo.setIcon(new ImageIcon("Imagenes/digital-art-pixel-art-pixels-landscape-nature-couple-1350127-wallhere.com.jpg"));
							
		panelz.setLayout(null);




	}
}
