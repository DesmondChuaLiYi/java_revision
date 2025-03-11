package UserInterface.Exercises;

import javax.swing.*;
import java.awt.*;

public class Exercise1 extends JFrame{
  private JLabel Label;
  private JTextField TextField;
  private JButton Button;

  public Exercise1() {
    super("AWT Counter");
    setLayout(new FlowLayout());
    setSize(300, 120);

    Label = new JLabel("Counter");
    add(Label);

    TextField = new JTextField("18", 10);
    add(TextField);

    Button = new JButton("Count");
    add(Button);

    pack();
  }

  public static void main(String[] args) {
    Exercise1 demo = new Exercise1();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}

