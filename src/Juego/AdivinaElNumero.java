package Juego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import java.awt.EventQueue;
import javax.swing.*;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import InterfazInicio.Inter_juego;
import Principal.Funciones;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdivinaElNumero extends JFrame {
    private int numeroSecreto;
    private int intentos;
    private JTextField txtNumero;
    private JTextArea txtAreaMensajes;
    private JLabel lblIntentos;

    public AdivinaElNumero() {
        setTitle("Adivina el Número");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(250, 220, 100));

        JPanel panelTitulo = new JPanel(new GridLayout(3, 1));
        panelTitulo.setOpaque(false);
        
        JLabel lblTitulo = new JLabel("¡Adivina el número secreto!");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 40));
        lblTitulo.setForeground(Color.RED);
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        panelTitulo.add(lblTitulo);

        JLabel lblBienvenido = new JLabel("!Bienvenido al juego!");
        lblBienvenido.setFont(new Font("Arial", Font.PLAIN, 30));
        lblBienvenido.setForeground(Color.BLUE);
        lblBienvenido.setHorizontalAlignment(JLabel.CENTER);
        panelTitulo.add(lblBienvenido);

        lblIntentos = new JLabel("Intentos: 0");
        lblIntentos.setFont(new Font("Arial", Font.PLAIN, 30));
        lblIntentos.setHorizontalAlignment(JLabel.CENTER);
        panelTitulo.add(lblIntentos);

        add(panelTitulo, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel(new BorderLayout());
        panelCentral.setOpaque(false);
        panelCentral.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));

        txtAreaMensajes = new JTextArea();
        txtAreaMensajes.setEditable(false);
        txtAreaMensajes.setFont(new Font("Arial", Font.PLAIN, 20));
        JScrollPane scrollPane = new JScrollPane(txtAreaMensajes);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setOpaque(false);
        panelCentral.add(scrollPane, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel(new FlowLayout());
        panelInferior.setOpaque(false);

        txtNumero = new JTextField(10);
        txtNumero.setFont(new Font("Arial", Font.PLAIN, 20));
        panelInferior.add(txtNumero);

        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setFont(new Font("Arial", Font.BOLD, 20));
        btnVerificar.setBackground(Color.GREEN);
        btnVerificar.setForeground(Color.WHITE);
        btnVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarNumero();
            }
        });
        panelInferior.add(btnVerificar);

        panelCentral.add(panelInferior, BorderLayout.SOUTH);

        add(panelCentral, BorderLayout.CENTER);

        // Botón para volver al menú principal
        JButton btnMenuPrincipal = new JButton("Menú Principal");
        btnMenuPrincipal.setFont(new Font("Arial", Font.BOLD, 12));
        btnMenuPrincipal.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
 		        // Crear una instancia de la clase OtroArchivo
 		    	Inter_juego inter = new Inter_juego();
 		        
 		        // Hacer visible la ventana del otro archivo
 		        inter.setVisible(true);
 		        
 		        // Cerrar la ventana actual si es necesario
 		        dispose();
 		    }
 		});
        
        JPanel panelBotonMenu = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelBotonMenu.setOpaque(false);
        panelBotonMenu.add(btnMenuPrincipal);
        add(panelBotonMenu, BorderLayout.SOUTH);

        iniciarJuego();
    }

    private void iniciarJuego() {
        numeroSecreto = (int) (Math.random() * 100) + 1;
        intentos = 0;
        actualizarIntentos();
        txtAreaMensajes.setText("Intenta adivinar el número secreto.");
    }

    private void verificarNumero() {
        try {
            int numero = Integer.parseInt(txtNumero.getText());
            if (numero < 1 || numero > 100) {
                txtAreaMensajes.append("\nPor favor ingresa un número válido del 1 al 100.");
            } else {
                intentos++;
                actualizarIntentos();
                if (numero == numeroSecreto) {
                    txtAreaMensajes.append("\n¡Felicidades! ¡Has adivinado el número secreto!");
                    txtAreaMensajes.append("\nEl número secreto era: " + numeroSecreto + ".");
                    txtNumero.setEnabled(false);
                    Funciones.ContadorPartidas1();
                    Funciones.RecordIntentos(intentos);
                } else if (numero < numeroSecreto) {
                    txtAreaMensajes.append("\nEl número secreto es mayor que " + numero + ".");
                } else {
                    txtAreaMensajes.append("\nEl número secreto es menor que " + numero + ".");
                }
            }
        } catch (NumberFormatException ex) {
            txtAreaMensajes.append("\nPor favor ingresa un número válido.");
        }
        txtNumero.setText("");
        txtNumero.requestFocus();
    }

    private void actualizarIntentos() {
        lblIntentos.setText("Intentos: " + intentos);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AdivinaElNumero().setVisible(true);
            }
        });
    }
}

