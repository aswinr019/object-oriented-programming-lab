/* Develop a program that has a Choice component which contains the names of shapes such
as rectangle, triangle, square and circle. Draw the corresponding shapes for given
parameters as per user’s choice. */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeDrawingProgram extends Frame implements ActionListener {
    private Choice shapeChoice;

    public ShapeDrawingProgram() {
        setTitle("Shape Drawing Program");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setResizable(false);

        shapeChoice = new Choice();
        shapeChoice.add("Rectangle");
        shapeChoice.add("Triangle");
        shapeChoice.add("Square");
        shapeChoice.add("Circle");
        shapeChoice.addActionListener(this);

        add(shapeChoice);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String selectedShape = shapeChoice.getSelectedItem();
        if (selectedShape.equals("Rectangle")) {
            drawRectangle();
        } else if (selectedShape.equals("Triangle")) {
            drawTriangle();
        } else if (selectedShape.equals("Square")) {
            drawSquare();
        } else if (selectedShape.equals("Circle")) {
            drawCircle();
        }
    }

    private void drawRectangle() {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(100, 100, 200, 150);
    }

    private void drawTriangle() {
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        int[] xPoints = {200, 100, 300};
        int[] yPoints = {100, 250, 250};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    private void drawSquare() {
        Graphics g = getGraphics();
        g.setColor(Color.GREEN);
        g.fillRect(100, 100, 150, 150);
    }

    private void drawCircle() {
        Graphics g = getGraphics();
        g.setColor(Color.ORANGE);
        g.fillOval(150, 150, 200, 200);
    }

    public static void main(String[] args) {
        new ShapeDrawingProgram();
    }
}
