package UserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton extends JFrame implements ActionListener {
  private JTextField text;
  private JButton button;
  private JLabel label;
  private JRadioButton r1, r2;
  private JCheckBox c1, c2;

  public RadioButton() {
    super("RadioButtons and CheckBoxes");
    setSize(550, 200);
    setLayout(new FlowLayout());

    text = new JTextField(15);
    button = new JButton("OK");
    label = new JLabel("Greetings!");
    r1 = new JRadioButton("Male");
    r2 = new JRadioButton("Female");

    // Create a RadioButton group for mutually exclusive option
    ButtonGroup group = new ButtonGroup();
    group.add(r1);
    group.add(r2);

    c1 = new JCheckBox("Dancing");
    c2 = new JCheckBox("Singing");

    add(text);
    add(r1);
    add(r2);
    add(c1);
    add(c2);
    add(button);
    add(label);

    button.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    String name = text.getText();

    // Action for gender
    name = r1.isSelected() ? "Mr. " + name : "Ms. " + name;

    // Action for checkboxes
    if (c1.isSelected() && c2.isSelected()) {
      name = name + " is a dancer and a singer.";
    } else if (c1.isSelected()) {
      name = name + " is a dancer.";
    } else {
      name = name + " is a singer.";
    }

    // Display the corresponding text to the label
    label.setText(name);
  }

  public static void main(String[] args) {
    RadioButton demo = new RadioButton();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}
