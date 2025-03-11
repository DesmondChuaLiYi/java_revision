package Methods;

import java.util.Scanner;

// Flavour 2 - no return type, with parameters
public class Flavour2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a, b, c;
    System.out.print("Enter 3 integers: ");
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

    largest(a, b, c);
  }

  public static void largest(int a, int b, int c) {
    int large = a;
    large = b > large ? b : large;
    large = c > large ? c : large;

    System.out.println("The largest integer is " + large);
  }
}