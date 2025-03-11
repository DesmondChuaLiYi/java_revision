package Graphics;

import javax.swing.*;
import java.awt.*;

public class Colors extends JFrame {
  public Colors() {
    super("Using colors");
    setSize(400, 400);
  }

  public void paint(Graphics g) {
    // Colors
    // - Makes the displayed colors in JFrame non-transparent
    // (only when you have a transparent background)
    super.paint(g);

    // Setting the color using RGB values
    // Red
    g.setColor(new Color(255, 0, 0));

    // Draw a rectangle
    g.fillRect(25, 50, 100, 20);

    // Display a message
    g.drawString("Current RGB: " + g.getColor(), 130, 65);


    // Set color using names
    // Blue
    g.setColor(Color.blue);

    // Draw rectangle
    g.fillRect(25, 75, 100, 20);

    // Display a message
    g.drawString("Current RGB: " + g.getColor(), 130, 90);


    // Set color using the Color method
    // Magenta
    Color c = Color.MAGENTA;
    g.setColor(c);

    // Draw a rectangle
    g.fillRect(25, 100, 100, 20);

    // Display a message
    g.drawString("Current RGB: " + c.getRed() + " " + c.getGreen() + " " +
            c.getBlue(), 130, 115);
  }

  public static void main(String[] args) {
    Colors demo = new Colors();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}
