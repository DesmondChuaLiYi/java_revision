package Graphics;

import javax.swing.*;
import java.awt.*;

public class Polygons extends JFrame {
  public Polygons() {
    super("Using Polygons");
    setSize(400, 400);
  }

  public void paint(Graphics g) {
    //Polygons

    //Method 1: Specify the points and coordinates - using integer arrays
    int[] xValues = {100, 130, 50, 150, 70, 100};
    int[] yValues = {200, 300, 250, 250, 300, 200};
    Polygon poly1 = new Polygon(xValues, yValues, 6);
    g.drawPolygon(poly1);

    //Method 2:
    int[] xValues2 = {70, 90, 100, 80, 70, 65, 60, 70};
    int[] yValues2 = {100, 100, 110, 110, 130, 110, 90, 100};
    g.drawPolyline(xValues2, yValues2, 8);

    //Method 3:
    Polygon poly2 = new Polygon();
    poly2.addPoint(165, 135);
    poly2.addPoint(175, 150);
    poly2.addPoint(270, 200);
    poly2.addPoint(200, 200);
    poly2.addPoint(130, 180);
    g.fillPolygon(poly2);
  }

  public static void main(String[] args) {
    Polygons demo = new Polygons();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}
