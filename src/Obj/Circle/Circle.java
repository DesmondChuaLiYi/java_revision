package Obj.Circle;

public class Circle {
  private double radius;
  private String color;
  private final double PI = 3.142;

  // default constructor
  public Circle() {
    radius = 2.5;
    color = "Gold";
  }

  // parameterized constructor
  public Circle(double r) {
    radius = r;
  }

  public Circle(double r, String c) {
    radius = r;
    color = c;
  }

  // setter methods
  public void setRadius(double r) {
    radius = r;
  }
  public void setColor(String c) {
    color = c;
  }

  // getter methods
  public double getRadius() {
    return radius;
  }
  public double getArea() {
    return PI * Math.pow(getRadius(), 2);
  }
  public double getPI()  {
    return PI;
  }
  public String getColor() {
    return color;
  }
}
