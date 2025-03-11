package UserInterface.Exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise2 extends JFrame implements ActionListener {
  private JTextArea textArea;
  private JButton messageButton, studentIDButton;

  public Exercise2() {
    setTitle("Message App");
    setSize(400, 300);
    setLayout(new BorderLayout());

    textArea = new JTextArea(10, 30);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setEditable(false);

    JScrollPane scrollPane = new JScrollPane(textArea);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    messageButton = new JButton("Write Message");
    studentIDButton = new JButton("Write Student ID");

    messageButton.addActionListener(this);
    studentIDButton.addActionListener(this);

    JPanel buttonPanel = new JPanel();
    buttonPanel.add(messageButton);
    buttonPanel.add(studentIDButton);

    add(scrollPane, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == messageButton) {
      String message = "Hello, I am currently displaying a message when the button is pressed.";
      textArea.append(message + "\n");
    } else if (e.getSource() == studentIDButton) {
      String studentID = "2022222493 Chua Li Yi";
      textArea.append(studentID + "\n");
    }
  }

  public static void main(String[] args) {
    Exercise2 app = new Exercise2();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.setVisible(true);
  }
}
