/* Develop a program to handle Key events. */

import java.awt.*;
import java.awt.event.*;

public class Program8 extends Frame implements KeyListener {

    public Program8() {
        setTitle("Key Event Handling Program");
        setSize(400, 400);
        setLayout(null);

        addKeyListener(this);

        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key Pressed: " + KeyEvent.getKeyText(keyCode));
    }

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key Released: " + KeyEvent.getKeyText(keyCode));
    }

    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        System.out.println("Key Typed: " + keyChar);
    }

    public static void main(String[] args) {
        new Program8();
    }
}
