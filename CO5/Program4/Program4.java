/* Using 2D graphics commands in an Applet, construct a house. On mouse click event,
change the color of the door from blue to red. */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Program4 extends Applet implements MouseListener {
    private Color doorColor;

    public void init() {
        doorColor = Color.BLUE;
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);

        g.setColor(Color.GRAY);
        g.fillRect(100, 200, 200, 200);

        int[] xPoints = {100, 200, 300};
        int[] yPoints = {200, 100, 200};
        g.setColor(Color.RED);
        g.fillPolygon(xPoints, yPoints, 3);

        g.setColor(doorColor);
        g.fillRect(160, 300, 80, 100);
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getX() >= 160 && e.getX() <= 240 && e.getY() >= 300 && e.getY() <= 400) {
            doorColor = doorColor.equals(Color.BLUE) ? Color.RED : Color.BLUE;
            repaint();
        }
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}

