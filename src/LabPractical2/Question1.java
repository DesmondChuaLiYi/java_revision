package LabPractical2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Question1 extends JFrame implements ActionListener {
  private JLabel label1, label2;
  private JTextField txt1, txt2;
  private int sum = 0;

  public Question1() {
    super("Accumulator");
    setLayout(new FlowLayout());
    setSize(300, 150);

    label1 = new JLabel("Enter an integer");
    add(label1);
    txt1 = new JTextField(null, 10);
    add(txt1);

    label2 = new JLabel("Acccumulated sum is");
    add(label2);
    txt2 = new JTextField(null, 10);
    txt2.setEditable(false);
    add(txt2);

    txt1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    sum += Integer.parseInt(txt1.getText());
    txt2.setText(String.valueOf(sum));
  }

  public static void main(String[] args) {
    Question1 demo = new Question1();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}