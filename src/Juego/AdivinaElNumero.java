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

public class AdivinaElNumero extends JFrame {
    private int numeroSecreto;
    private int intentos;
    private JTextField txtNumero;
    private JTextArea txtAreaMensajes;
    private JLabel lblIntentos;

    public AdivinaElNumero() {
        setTitle("Adivina el Número");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Abre la ventana en modo de pantalla completa
        setUndecorated(true); // Quita los bordes de la ventana para una apariencia más limpia
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(250, 220, 100)); // Fondo de la ventana

        JLabel lblTitulo = new JLabel("¡Adivina el número secreto!");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitulo.setForeground(Color.RED);
        add(lblTitulo, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel(new BorderLayout());
        panelCentral.setOpaque(false); // Hace que el panel sea transparente para mostrar el fondo de la ventana
        panelCentral.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100)); // Agrega un margen al panel

        lblIntentos = new JLabel("Intentos: 0");
        lblIntentos.setFont(new Font("Arial", Font.PLAIN, 20));
        panelCentral.add(lblIntentos, BorderLayout.NORTH);

        txtAreaMensajes = new JTextArea();
        txtAreaMensajes.setEditable(false);
        txtAreaMensajes.setFont(new Font("Arial", Font.PLAIN, 20));
        JScrollPane scrollPane = new JScrollPane(txtAreaMensajes);
        scrollPane.getViewport().setOpaque(false); // Hace que el área de texto sea transparente
        scrollPane.setOpaque(false); // Hace que el panel del área de desplazamiento sea transparente
        panelCentral.add(scrollPane, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel(new FlowLayout());
        panelInferior.setOpaque(false); // Hace que el panel sea transparente

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

        iniciarJuego();
    }

    private void iniciarJuego() {
        numeroSecreto = (int) (Math.random() * 100) + 1;
        intentos = 0;
        actualizarIntentos();
        txtAreaMensajes.setText("¡Bienvenido al juego!\nIntenta adivinar el número secreto.");
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
