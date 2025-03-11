package UserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBox extends JFrame implements ActionListener {
  private JCheckBox bold, italic;
  private JTextField text;

  public CheckBox() {
    super("Checkboxes");
    setLayout(new FlowLayout());
    setSize(250, 200);

    text = new JTextField("Watch the font size change", 20);
    text.setFont(new Font("TimesRoman", Font.PLAIN, 14));
    add(text);

    bold = new JCheckBox("Bold");
    italic = new JCheckBox("Italic");
    add(bold);
    add(italic);

    bold.addActionListener(this);
    italic.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    Font font = null;
    if (bold.isSelected() && italic.isSelected()) {
      font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
    } else if (bold.isSelected()) {
      font = new Font("Serif", Font.BOLD, 14);
    } else if (italic.isSelected()) {
      font = new Font("Serif", Font.ITALIC, 14);
    } else {
        font = new Font("Serif", Font.PLAIN, 14);
    }

    text.setFont(font);
  }

  public static void main(String[] args) {
    CheckBox demo = new CheckBox();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}
