package Graphics;

import javax.swing.*;
import java.awt.*;

public class Arches extends JFrame {
  public Arches() {
    super("Using Arches");
    setSize(400, 400);
  }

  public void paint(Graphics g) {
    //Arches
    g.setColor(Color.ORANGE);
    g.drawRect(15, 35, 80, 80);
    g.setColor(Color.BLUE);
    g.drawArc(15, 35, 80, 80, 0, 360);

    g.setColor(Color.PINK);
    g.drawRect(100, 35, 80, 80);
    g.setColor(Color.RED);
    g.drawArc(100, 35, 80, 80, 0, 110); // Positive degree is counter-clockwise
    g.setColor(Color.CYAN);
    g.fillArc(100, 35, 80, 80, 270, -90); // Negative degree means clockwise

    g.setColor(Color.MAGENTA);
    g.drawRect(185, 35, 80, 80);
    g.setColor(Color.YELLOW);
    g.fillArc(185, 35, 80, 80, 0, -270);
  }

  public static void main(String[] args) {
    Arches demo = new Arches();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}
