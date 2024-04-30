package Juego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleGame extends JFrame {
    private int circleX;
    private int circleY;
    private int circleRadius = 50;
    private int score = 0;
    private long startTime;
    private Timer timer;

    public CircleGame() {
        setTitle("Circle Game");
        setUndecorated(true); // Elimina la decoración de la ventana para pantalla completa
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Establece la ventana en modo de pantalla completa
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();

                if (isInsideCircle(mouseX, mouseY)) {
                    score++;
                    timer.restart(); // Reinicia el temporizador si el usuario hace clic
                } else {
                    showResultDialog(); // Muestra la ventana de resultado si el usuario falla
                }

                generateRandomCirclePosition();
                repaint(); // Actualiza la ventana
            }
        });

        // Genera una posición inicial aleatoria para el círculo
        generateRandomCirclePosition();
        startTime = System.currentTimeMillis(); // Inicia el temporizador al inicio del juego

        // Inicializa el temporizador para verificar la inactividad del usuario
        timer = new Timer(15000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showResultDialog(); // Muestra la ventana de resultado si el usuario no hace clic en 15 segundos
            }
        });
        timer.start();
    }

    private boolean isInsideCircle(int x, int y) {
        int distanceSquared = (x - circleX) * (x - circleX) + (y - circleY) * (y - circleY);
        return distanceSquared <= circleRadius * circleRadius;
    }

    private void generateRandomCirclePosition() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Genera coordenadas aleatorias dentro de toda la pantalla
        circleX = (int) (Math.random() * (screenWidth - circleRadius * 2)) + circleRadius;
        circleY = (int) (Math.random() * (screenHeight - circleRadius * 2)) + circleRadius;
    }

    private String calculateTime() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = (currentTime - startTime) / 1000; // Convertir a segundos
        long minutes = elapsedTime / 60;
        long seconds = elapsedTime % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    private void showResultDialog() {
        JOptionPane.showMessageDialog(null, "¡Has fallado! Puntuación total: " + score + " - Tiempo transcurrido: " + calculateTime(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        score = 0; // Reinicia la puntuación
        startTime = System.currentTimeMillis(); // Reinicia el tiempo
        generateRandomCirclePosition();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(circleX - circleRadius, circleY - circleRadius, circleRadius * 2, circleRadius * 2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CircleGame game = new CircleGame();
            game.setVisible(true);
        });
    }
}