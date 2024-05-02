package Juego;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.util.*;

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

	public class PreguntasYRespuestas extends JFrame {
	    private JLabel preguntaLabel;
	    private JRadioButton[] opciones;
	    private JButton responderButton;
	    private int preguntaActual;
	    private int respuestasCorrectas;
	    private int respuestasIncorrectas;
	    private int respuestasTotales;
	    private long tiempoTotal;
	    private int rachaCorrectas;
	    private int mejorRachaCorrectas;
	    private int[] categoriasCorrectas;
	    private int[] categoriasIncorrectas;

	    private String[] preguntas = {
	        "¿Cuál es la capital de Francia?",
	        "¿Cuál es el planeta más grande del sistema solar?",
	        "¿Quién escribió 'Don Quijote de la Mancha'?",
	        "¿En qué año comenzó la Segunda Guerra Mundial?",
	        "¿Quién pintó la 'Mona Lisa'?",
	        "¿Cuál es la montaña más alta del mundo?",
	        "¿Cuál es el océano más grande del mundo?",
	        "¿Cuál es el río más largo del mundo?",
	        "¿Cuál es el país más grande del mundo?",
	        "¿Quién descubrió América?"
	    };

	    private String[][] opcionesRespuestas = {
	        {"Madrid", "París", "Roma"},
	        {"Júpiter", "Saturno", "Neptuno"},
	        {"Miguel de Cervantes", "William Shakespeare", "Gabriel García Márquez"},
	        {"1939", "1941", "1945"},
	        {"Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh"},
	        {"Monte Everest", "Monte Kilimanjaro", "Monte McKinley"},
	        {"Pacífico", "Atlántico", "Índico"},
	        {"Nilo", "Amazonas", "Yangtsé"},
	        {"Rusia", "China", "Canadá"},
	        {"Cristóbal Colón", "Vasco da Gama", "Fernando de Magallanes"}
	    };

	    private int[] respuestasCorrectasIndices = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // Índice de la respuesta correcta para cada pregunta

	    public PreguntasYRespuestas() {
	        setTitle("Preguntas y Respuestas");
	        setExtendedState(JFrame.MAXIMIZED_BOTH); // Abrir en pantalla completa
	        setUndecorated(true); // Eliminar bordes de la ventana
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new GridLayout(5, 1));

	        Font fuentePregunta = new Font("Arial", Font.BOLD, 24); // Fuente más grande para la pregunta
	        Font fuenteOpciones = new Font("Arial", Font.PLAIN, 20); // Fuente más grande para las opciones

	        preguntaLabel = new JLabel();
	        preguntaLabel.setFont(fuentePregunta);
	        preguntaLabel.setHorizontalAlignment(JLabel.CENTER);
	        add(preguntaLabel);

	        opciones = new JRadioButton[3];
	        ButtonGroup grupoOpciones = new ButtonGroup();
	        for (int i = 0; i < opciones.length; i++) {
	            opciones[i] = new JRadioButton();
	            opciones[i].setFont(fuenteOpciones);
	            grupoOpciones.add(opciones[i]);
	            add(opciones[i]);
	        }

	        responderButton = new JButton("Responder");
	        responderButton.setFont(new Font("Arial", Font.BOLD, 20));
	        responderButton.setForeground(Color.WHITE);
	        responderButton.setBackground(new Color(50, 150, 50));
	        responderButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                comprobarRespuesta();
	            }
	        });
	        add(responderButton);

	        preguntaActual = 0;
	        respuestasCorrectas = 0;
	        respuestasIncorrectas = 0;
	        respuestasTotales = 0;
	        tiempoTotal = 0;
	        rachaCorrectas = 0;
	        mejorRachaCorrectas = 0;
	        categoriasCorrectas = new int[opcionesRespuestas.length];
	        categoriasIncorrectas = new int[opcionesRespuestas.length];

	        mostrarPregunta();
	        setVisible(true);
	    }

	    private void mostrarPregunta() {
	        preguntaLabel.setText(preguntas[preguntaActual]);
	        for (int i = 0; i < opciones.length; i++) {
	            opciones[i].setText(opcionesRespuestas[preguntaActual][i]);
	            opciones[i].setSelected(false);
	        }
	    }

	    private void comprobarRespuesta() {
	        long tiempoInicio = System.currentTimeMillis();

	        int respuestaSeleccionada = -1;
	        for (int i = 0; i < opciones.length; i++) {
	            if (opciones[i].isSelected()) {
	                respuestaSeleccionada = i;
	                break;
	            }
	        }

	        long tiempoFin = System.currentTimeMillis();
	        long tiempoPregunta = tiempoFin - tiempoInicio;
	        tiempoTotal += tiempoPregunta;

	        if (respuestaSeleccionada == respuestasCorrectasIndices[preguntaActual]) {
	            respuestasCorrectas++;
	            rachaCorrectas++;
	            mejorRachaCorrectas = Math.max(mejorRachaCorrectas, rachaCorrectas);
	            categoriasCorrectas[preguntaActual]++;
	            JOptionPane.showMessageDialog(this, "¡Respuesta correcta!");
	        } else {
	            respuestasIncorrectas++;
	            rachaCorrectas = 0;
	            categoriasIncorrectas[preguntaActual]++;
	            JOptionPane.showMessageDialog(this, "Respuesta incorrecta. La respuesta correcta es: " +
	                    opcionesRespuestas[preguntaActual][respuestasCorrectasIndices[preguntaActual]]);
	        }
	        preguntaActual++;
	        respuestasTotales++;

	        if (preguntaActual < preguntas.length) {
	            mostrarPregunta();
	        } else {
	            mostrarResultados();
	            dispose();
	        }
	    }

	    private void mostrarResultados() {
	        StringBuilder resultados = new StringBuilder();
	        resultados.append("Número total de preguntas respondidas: ").append(respuestasTotales).append("\n");
	        resultados.append("Número de respuestas correctas: ").append(respuestasCorrectas).append("\n");
	        resultados.append("Número de respuestas incorrectas: ").append(respuestasIncorrectas).append("\n");
	        double porcentajeCorrectas = (double) respuestasCorrectas / respuestasTotales * 100;
	        resultados.append("Porcentaje de respuestas correctas: ").append(String.format("%.2f", porcentajeCorrectas)).append("%\n");
	        resultados.append("Puntuación total acumulada: ").append(respuestasCorrectas * 10).append("\n");
	        double tiempoPromedio = (double) tiempoTotal / preguntas.length / 1000;
	        resultados.append("Tiempo promedio de respuesta por pregunta: ").append(String.format("%.2f", tiempoPromedio)).append(" segundos\n");
	        resultados.append("Mejor racha de respuestas correctas consecutivas: ").append(mejorRachaCorrectas).append("\n");
	        int categoriaMejorRendimiento = obtenerCategoriaMejorRendimiento();
	        int categoriaPeorRendimiento = obtenerCategoriaPeorRendimiento();
	        resultados.append("Categoría con mejor rendimiento: Pregunta ").append(categoriaMejorRendimiento + 1).append("\n");
	        resultados.append("Categoría con peor rendimiento: Pregunta ").append(categoriaPeorRendimiento + 1).append("\n");

	        JOptionPane.showMessageDialog(this, resultados.toString());
	    }

	    private int obtenerCategoriaMejorRendimiento() {
	        int maxCorrectas = categoriasCorrectas[0];
	        int categoriaMejorRendimiento = 0;
	        for (int i = 1; i < categoriasCorrectas.length; i++) {
	            if (categoriasCorrectas[i] > maxCorrectas) {
	                maxCorrectas = categoriasCorrectas[i];
	                categoriaMejorRendimiento = i;
	            }
	        }
	        return categoriaMejorRendimiento;
	    }

	    private int obtenerCategoriaPeorRendimiento() {
	        int maxIncorrectas = categoriasIncorrectas[0];
	        int categoriaPeorRendimiento = 0;
	        for (int i = 1; i < categoriasIncorrectas.length; i++) {
	            if (categoriasIncorrectas[i] > maxIncorrectas) {
	                maxIncorrectas = categoriasIncorrectas[i];
	                categoriaPeorRendimiento = i;
	            }
	        }
	        return categoriaPeorRendimiento;
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new PreguntasYRespuestas();
	            }
	        });
	    }
	}

