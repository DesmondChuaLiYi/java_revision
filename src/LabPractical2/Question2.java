package LabPractical2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Question2 extends JFrame implements ActionListener {
  // Initializing JFrame attributes
  private JLabel label1, label2, label3, label4, label5;
  private JTextField txt;
  private JRadioButton fromEuros, fromUsd, fromPound, toEuros, toUsd, toPound;
  private JButton convert;
  private JPanel p1, p2, p3, p4, p5, p6, p7;

  // Currency conversion rates
  protected double eurToUsd = 1.11;
  protected double eurToPound = 0.87;
  protected double usdToEur = 0.9;
  protected double usdToPound = 0.78;
  protected double poundToEur = 1.15;
  protected double poundToUsd = 1.29;

  // Constructor
  public Question2() {
    super("Currency Converter");
    setLayout(new FlowLayout());
    setSize(330, 300);

    label1 = new JLabel("Enter amount:");
    p1 = new JPanel();
    p1.add(label1);

    txt = new JTextField("Amount here!", 25);
    p2 = new JPanel();
    p2.add(txt);

    // From section
    label2 = new JLabel("From: ");
    fromEuros = new JRadioButton("Euros");
    fromUsd = new JRadioButton("US Dollar");
    fromPound = new JRadioButton("British Pound");

    // Button group for From section
    ButtonGroup bg1 = new ButtonGroup();
    bg1.add(fromEuros);
    bg1.add(fromUsd);
    bg1.add(fromPound);
    p3 = new JPanel();
    p3.add(label2);
    p3.add(fromEuros);
    p3.add(fromUsd);
    p3.add(fromPound);

    // To section
    label3 = new JLabel("To: ");
    toEuros = new JRadioButton("Euros");
    toUsd = new JRadioButton("US Dollar");
    toPound = new JRadioButton("British Pound");

    // Button group for To section
    ButtonGroup bg2 = new ButtonGroup();
    bg2.add(toEuros);
    bg2.add(toUsd);
    bg2.add(toPound);
    p4 = new JPanel();
    p4.add(label3);
    p4.add(toEuros);
    p4.add(toUsd);
    p4.add(toPound);

    // Result
    label4 = new JLabel("Result:");
    label5 = new JLabel("Conversion result will show here.");
    p5 = new JPanel();
    p5.add(label4);
    p6 = new JPanel();
    p6.add(label5);

    // Convert button
    convert = new JButton("Convert");
    p7 = new JPanel();
    p7.add(convert);

    // Adding the panel elements into JFrame
    add(p1); // Enter amount label
    add(p2); // User input textfield
    add(p3); // Radio buttons (from)
    add(p4); // Radio buttons (to)
    add(p5); // Result label
    add(p6); // Result display
    add(p7); // Convert button

    // Adding action listeners to the radio buttons & convert button
    fromEuros.addActionListener(this);
    fromUsd.addActionListener(this);
    fromPound.addActionListener(this);
    toEuros.addActionListener(this);
    toUsd.addActionListener(this);
    toPound.addActionListener(this);
    convert.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    // Check the selected state of the radio buttons
    boolean isFromEurosSelected = fromEuros.isSelected();
    boolean isFromUSDSelected = fromUsd.isSelected();
    boolean isFromPoundSelected = fromPound.isSelected();

    boolean isToEurosSelected = toEuros.isSelected();
    boolean isToUSDSelected = toUsd.isSelected();
    boolean isToPoundSelected = toPound.isSelected();

    // Enable or disable the radio buttons based on the user selection (meaning user can't have duplicate types)
    toEuros.setEnabled(!isFromEurosSelected);
    toUsd.setEnabled(!isFromUSDSelected);
    toPound.setEnabled(!isFromPoundSelected);

    fromEuros.setEnabled(!isToEurosSelected);
    fromUsd.setEnabled(!isToUSDSelected);
    fromPound.setEnabled(!isToPoundSelected);

    // Conversion formula
    double amount;
    double answer;

    if (e.getSource() == convert) {
      // Euros to US Dollars
      if (fromEuros.isSelected() && toUsd.isSelected()) {
        amount = Double.parseDouble(txt.getText());
        answer = amount * eurToUsd;

        label5.setText(amount + " Euros can be exchanged to " + String.format("%.3f", answer) + " US Dollars.");
      }
      // Euros to Pounds
      else if (fromEuros.isSelected() && toPound.isSelected()) {
        amount = Double.parseDouble(txt.getText());
        answer = amount * eurToPound;

        label5.setText(amount + " Euros can be exchanged to " + String.format("%.3f", answer) + " Pounds.");
      }
      // US Dollars to Euros
      else if (fromUsd.isSelected() && toEuros.isSelected()) {
        amount = Double.parseDouble(txt.getText());
        answer = amount * usdToEur;

        label5.setText(amount + " US Dollars can be exchanged to " + String.format("%.3f", answer) + " Euros.");
      }
      // US Dollars to Pounds
      else if (fromUsd.isSelected() && toPound.isSelected()) {
        amount = Double.parseDouble(txt.getText());
        answer = amount * usdToPound;

        label5.setText(amount + " US Dollars can be exchanged to " + String.format("%.3f", answer) + " Pounds.");
      }
      // Pounds to Euros
      else if (fromPound.isSelected() && toEuros.isSelected()) {
        amount = Double.parseDouble(txt.getText());
        answer = amount * poundToEur;

        label5.setText(amount + " Pounds can be exchanged to " + String.format("%.3f", answer) + " Euros.");
      }
      // Pounds to US Dollars
      else if (fromPound.isSelected() && toUsd.isSelected()) {
        amount = Double.parseDouble(txt.getText());
        answer = amount * poundToUsd;

        label5.setText(amount + " Pounds can be exchanged to " + String.format("%.3f", answer) + " US Dollars.");
      } else {
        label5.setText("Please select a currency to convert to!");
      }
    }
  }

  public static void main(String[] args) {
    Question2 demo = new Question2();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}