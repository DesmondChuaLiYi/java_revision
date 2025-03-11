package Obj.Box;

public class Box {
  private double width, length, height;

  // parameterized constructor
  public Box(double wid, double len, double hei) {
    width = wid;
    length = len;
    height = hei;
  }

  public double calArea(double w, double h) {
    return w * h;
  }

  public double calVolume(double w, double h, double l) {
    return w * h * l;
  }

  public String toString() {
    return "Width = " + width +
            "\nLength = " + length +
            "\nHeight = " + height +
            "\nArea = " + calArea(width, height) +
            "\nVolume = " + calVolume(width, height, length);
  }
}
