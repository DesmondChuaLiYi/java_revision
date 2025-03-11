package Obj.Box;

public class JumboBox extends Box {
  private double weight;

  // parameterized constructor
  public JumboBox(double wid, double len, double hei, double wei) {
    super(wid, len, hei);
    weight = wei;
  }

  public String toString() {
    return super.toString() + "\nJumboBox" + "\nWeight = " + weight;
  }
}
