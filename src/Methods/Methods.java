package Methods;

import java.util.Scanner;

public class Methods {
  // Flavour 1 : return nothing with empty parameter
  // Flavour 2 : return nothing with parameter
  // Flavour 3 : return result with parameter

  public static void main(String[] args) {
    // Recursion
    displayMessage(1);

    Scanner input = new Scanner(System.in);
    int i, j;
    System.out.print("Enter 2 integers: ");
    i = input.nextInt();
    j = input.nextInt();

    // Method call
    System.out.println("The sum is : " + sumIntegers(i, j));

    double x = 28, y = 4;

    // Return the square root of y
    System.out.println("Square root of y is : " + Math.sqrt(y));
    // Returns 28 power of 4, i.e. 28 x 28 x 28 x 28
    System.out.println("Powers of x and y is : " + Math.pow(x, y));

    double a = 30;
    // Return the trigonometric sine of a
    System.out.println("Sine value of a is " + Math.sin(a));
    System.out.println("Cosine value of a is " + Math.cos(a));
    System.out.println("Tangent value of a is " + Math.tan(a));

    Methods call = new Methods();
    call.differentIntegers();
  }


  public static int sumIntegers(int i, int j) {
    return i + j;
  }


  // Non-static method
  public void differentIntegers() {
    int a, b;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 2 integers: ");
    a = input.nextInt();
    b = input.nextInt();
    System.out.println("The difference is " + (a - b));
  }


  // Recursion
  public static void displayMessage(int num) {
    if (num <= 10) {
      System.out.print(" " + num);

      // General case
      displayMessage(num + 1);
    } else {
      // Stopping rule base case
      System.out.println();
    }
  }
}