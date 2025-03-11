package UserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button extends JFrame implements ActionListener {
  private JButton button1, button2, button3;

  public Button() {
    super("Arranging Buttons");
    setSize(300, 80);
    setLayout(new FlowLayout());

    button1 = new JButton("Dog");
    button2 = new JButton("Cat");
    button3 = new JButton("Bird");
    add(button1);
    add(button2);
    add(button3);

    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    button1.setActionCommand("Fido");
    button2.setActionCommand("Kitty");
    button3.setActionCommand("Tweety");

    JOptionPane.showMessageDialog(null, "The button's action is " + e.getActionCommand());
  }

  public static void main(String[] args) {
    Button demo = new Button();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}
