package UserInterface;

import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {
  private JButton button1, button2, button3, button4, button5;
  private JPanel p1, p2, p3, p4, p5;

  public Border() {
    super("Border Layout");
    setSize(400, 300);
    setLayout(new BorderLayout());

    button1 = new JButton("North Button");
    button2 = new JButton("South Button");
    button3 = new JButton("East Button");
    button4 = new JButton("West Button");
    button5 = new JButton("Center Button");

    p1 = new JPanel();
    p2 = new JPanel();
    p3 = new JPanel();
    p4 = new JPanel();
    p5 = new JPanel();

    p1.add(button1);
    p2.add(button2);
    p3.add(button3);
    p4.add(button4);
    p5.add(button5);

    add(p1, BorderLayout.NORTH);
    add(p2, BorderLayout.SOUTH);
    add(p3, BorderLayout.EAST);
    add(p4, BorderLayout.WEST);
    add(p5, BorderLayout.CENTER);

    // Pack the components evenly
    pack();
  }

  public static void main(String[] args) {
    Border demo = new Border();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}
