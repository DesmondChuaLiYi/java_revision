package Obj.Circle;

public class TestCircle {
  public static void main(String[] args) {
    // Object using default constructor
    Circle circle1 = new Circle();
    circle1.setRadius(7);
    System.out.println("Circle 1 (default constructor):");
    System.out.printf("Radius = %.2f cm\nArea = %.2f cm2\n", circle1.getRadius(), circle1.getArea());

    // Object using constructor with argument (values)
    Circle circle2 = new Circle(3.5);
    System.out.println("\nCircle 2 (parameterized constructor):");
    System.out.printf("Radius = %.2f cm\nArea = %.2f cm2\n", circle2.getRadius(), circle2.getArea());

    // Object using constructor with two arguments (radius and color)
    Circle circle3 = new Circle(3.7, "Blue");
    System.out.println("\nCircle 3:");
    System.out.printf("Radius = %.2f cm\nArea = %.2f cm2\nColor = %s\n", circle3.getRadius(), circle3.getArea(), circle3.getColor());
  }
}
