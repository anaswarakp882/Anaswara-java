import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseKeyEventDemo extends JFrame
        implements MouseListener, KeyListener {

    JLabel label;

    MouseKeyEventDemo() {
        setTitle("Mouse and Key Event Tracker");
        setSize(500, 300);
        setLayout(new FlowLayout());

        label = new JLabel("Perform a mouse or keyboard action");
        add(label);

        addMouseListener(this);
        addKeyListener(this);

        setFocusable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at: " + e.getX() + ", " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the Window");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the Window");
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new MouseKeyEventDemo();
    }
}