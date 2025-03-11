package UserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextField extends JFrame implements ActionListener {
  private JTextField text1, text2, text3;
  private JPasswordField password;

  public TextField() {
    super("Testing JTextField and JPasswordField");
    setLayout(new FlowLayout());
    setSize(350, 100);

    text1 = new JTextField(10);
    add(text1);

    text2 = new JTextField("Enter text here.");
    add(text2);

    text3 = new JTextField("Uneditable text", 20);
    text3.setEditable(false);
    add(text3);

    password = new JPasswordField("Hidden text");
    add(password);

    text1.addActionListener(this);
    text2.addActionListener(this);
    text3.addActionListener(this);
    password.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    String s = "";

    if (e.getSource() == text1) {
      s = "text1: " + e.getActionCommand();
    } else if (e.getSource() == text2) {
      s = "text2: " + e.getActionCommand();
    } else if (e.getSource() == text3) {
      s = "text3: " + e.getActionCommand();
    } else if (e.getSource() == password) {
      s = "password: " + e.getActionCommand();
    }

    JOptionPane.showMessageDialog(this, s);
  }

  public static void main(String[] args) {
    TextField demo = new TextField();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}