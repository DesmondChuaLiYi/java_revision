package Internship;

import javax.swing.*;
import java.awt.*;

public class G_Arches extends JFrame{
  public G_Arches() {
    super("Using Arches");
    setSize(400, 400);
  }

  public void paint(Graphics g) {
    //Arches
    g.setColor(Color.ORANGE);
    g.fillRect(30, 160, 80, 80);
  }

  public static void main(String[] args) {
    G_Arches demo = new G_Arches();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}
