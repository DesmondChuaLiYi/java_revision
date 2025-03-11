package Graphics;

import javax.swing.*;
import java.awt.*;

public class Lines extends JFrame {
  public Lines() {
    super("Using Lines");
    setSize(400, 400);
  }

  public void paint(Graphics g) {
    //Lines
    g.setColor(Color.RED);
    g.drawLine(10, 180, 350, 180);

    g.setColor(Color.BLUE);
    g.drawRect(10, 40, 80, 55);
    g.fillRect(100, 40, 90, 55);

    g.setColor(Color.CYAN);
    g.fillRoundRect(195, 40, 90, 55, 50, 50);
    g.drawRoundRect(290, 40, 90, 55, 20, 20);

    g.setColor(Color.YELLOW);
    g.draw3DRect(10, 100, 80, 55, true);
    g.fill3DRect(100, 100, 90, 55, true);

    g.setColor(Color.PINK);
    g.drawOval(195, 100, 90, 55);
    g.fillOval(290, 100, 90, 55);
  }

  public static void main(String[] args) {
    Lines demo = new Lines();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}
