package UserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBox extends JFrame implements ActionListener {
  private JComboBox box;
  private JButton button;
  private JLabel label;

  public ComboBox() {
    super("ComboBox Demo");
    setSize(400, 200);
    setLayout(new FlowLayout());

    // Create the list to be inserted into the combo box
    String[] name = {"Eddery", "Desmond", "Angel", "Grace", "Farees"};
    box = new JComboBox(name);
    add(box);

    button = new JButton("Print");
    add(button);

    label = new JLabel("[Name will be displayed here]");
    add(label);

    button.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    String message = box.getSelectedItem().toString();
    label.setText(message);
  }

  public static void main(String[] agrs) {
    ComboBox demo = new ComboBox();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}
