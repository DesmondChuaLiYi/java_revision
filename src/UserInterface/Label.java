package UserInterface;

import javax.swing.*;
import java.awt.*;

public class Label extends JFrame {
  private JLabel label1, label2, label3;

  public Label() {
    super("Testing JLabels");
    setLayout(new FlowLayout());
    setSize(350, 200);

    label1 = new JLabel("Label with text");
    add(label1);

    Icon item = new ImageIcon("pic.png");
    label2 = new JLabel("Label with text right alignment", item, SwingConstants.RIGHT);
    label2.setToolTipText("This is label 2");
    add(label2);

    label3 = new JLabel();
    label3.setText("Label with text at top");
    Icon item2 = new ImageIcon("fox.png");
    label3.setIcon(item2);
    label3.setVerticalTextPosition(SwingConstants.TOP);
    label3.setToolTipText("This is label 3!");
    add(label3);
  }

  public static void main(String[] args) {
    Label demo = new Label();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}