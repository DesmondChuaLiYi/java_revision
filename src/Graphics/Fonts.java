package Graphics;

import javax.swing.*;
import java.awt.*;

public class Fonts extends JFrame {
  public Fonts() {
    super("Using Fonts");
    setSize(400, 400);
  }

  public void paint(Graphics g) {
    // Fonts
    g.setColor(Color.BLUE);
    g.setFont(new Font("Serif", Font.BOLD, 18));
    g.drawString(" " + g.getFont().getName() + " " + g.getFont().getSize(), 20, 120);

    g.setColor(Color.CYAN);
    g.setFont(new Font("Jokerman", Font.BOLD + Font.ITALIC, 24));
    g.drawString("Have fun on Friday!", 20, 150);
    g.drawString(g.getFont().getName(), 20, 190);
    g.drawString(" " + g.getFont().getSize(), 150, 190);
  }

  public static void main(String[] args) {
    Fonts demo = new Fonts();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}
