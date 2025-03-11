package UserInterface;

import javax.swing.*;
import java.awt.*;

public class Grid_Layout extends JFrame {
  private JButton button;
  private JTextField text;
  private JRadioButton r1, r2, r3;
  private JPanel panel;
  private JList list;

  public Grid_Layout() {
    super("Testing Grid Layout");
    setSize(350, 200);
    setLayout(new GridLayout(2, 2));

    button = new JButton("Click here!");
    add(button);

    text = new JTextField("Edit This!");
    add(text);

    r1 = new JRadioButton("English", true);
    r2 = new JRadioButton("Deutsch");
    r3 = new JRadioButton("Francais");

    ButtonGroup group = new ButtonGroup();
    group.add(r1);
    group.add(r2);
    group.add(r3);

    panel = new JPanel();
    panel.setLayout(new GridLayout(3, 1));
    panel.add(r1);
    panel.add(r2);
    panel.add(r3);
    add(panel);

    String[] names = {"Alfred", "Marcus", "Rachel"};
    list = new JList(names);
    add(list);
  }

  public static void main(String[] args) {
    Grid_Layout demo = new Grid_Layout();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}
