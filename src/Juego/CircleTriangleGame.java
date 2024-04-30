package Juego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class CircleTriangleGame extends JFrame {
    private int circleCenterX, circleCenterY, circleRadius;
    private int triangleAngle;
    private boolean triangleClicked;

    public CircleTriangleGame() {
        setTitle("Circle Triangle Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        circleRadius = 200;
        circleCenterX = getWidth() / 2;
        circleCenterY = getHeight() / 2;
        triangleAngle = 0;
        triangleClicked = false;

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                drawCircle(g2d);
                drawTriangle(g2d);
                drawLine(g2d);
            }
        };

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (isInsideTriangle(e.getX(), e.getY())) {
                    triangleClicked = true;
                    panel.repaint();
                }
            }
        });

        add(panel);
        setVisible(true);
        animateTriangle(panel);
    }

    private void drawCircle(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.draw(new Ellipse2D.Double(circleCenterX - circleRadius, circleCenterY - circleRadius, circleRadius * 2, circleRadius * 2));
    }

    private void drawTriangle(Graphics2D g2d) {
        int[] xPoints = calculateXPoints();
        int[] yPoints = calculateYPoints();
        Polygon triangle = new Polygon(xPoints, yPoints, 3);
        g2d.setColor(Color.RED);
        g2d.fill(triangle);
    }

    private int[] calculateXPoints() {
        double angle1 = Math.toRadians(triangleAngle);
        double angle2 = Math.toRadians(triangleAngle + 120);
        double angle3 = Math.toRadians(triangleAngle + 240);
        int x1 = (int) (circleCenterX + circleRadius * Math.cos(angle1));
        int x2 = (int) (circleCenterX + circleRadius * Math.cos(angle2));
        int x3 = (int) (circleCenterX + circleRadius * Math.cos(angle3));
        return new int[]{x1, x2, x3};
    }

    private int[] calculateYPoints() {
        double angle1 = Math.toRadians(triangleAngle);
        double angle2 = Math.toRadians(triangleAngle + 120);
        double angle3 = Math.toRadians(triangleAngle + 240);
        int y1 = (int) (circleCenterY - circleRadius * Math.sin(angle1));
        int y2 = (int) (circleCenterY - circleRadius * Math.sin(angle2));
        int y3 = (int) (circleCenterY - circleRadius * Math.sin(angle3));
        return new int[]{y1, y2, y3};
    }

    private void drawLine(Graphics2D g2d) {
        if (triangleClicked) {
            int[] xPoints = calculateXPoints();
            int[] yPoints = calculateYPoints();
            g2d.setColor(Color.BLUE);
            g2d.drawLine(xPoints[0], yPoints[0], xPoints[1], yPoints[1]);
        }
    }

    private boolean isInsideTriangle(int x, int y) {
        int[] xPoints = calculateXPoints();
        int[] yPoints = calculateYPoints();
        Polygon triangle = new Polygon(xPoints, yPoints, 3);
        return triangle.contains(x, y);
    }

    private void animateTriangle(JPanel panel) {
        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                triangleAngle++;
                if (triangleAngle >= 360)
                    triangleAngle = 0;
                panel.repaint();
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CircleTriangleGame();
        });
    }
}

