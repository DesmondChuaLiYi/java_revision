package Methods;

import java.util.Scanner;

// Flavour 1 - no return type, no parameters
public class Flavour1 {
  public static void main(String[] args) {
    largest();
  }

  public static void largest() {
    Scanner input = new Scanner(System.in);

    int a, b, c;
    System.out.print("Enter 3 integers: ");
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

    int large = a;
    large = Math.max(b, large);
    large = Math.max(c, large);

    System.out.println("The largest integer is " + large);
  }
}
