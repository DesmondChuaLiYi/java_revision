package Methods;

import java.util.Scanner;

// Flavour 3 - return result, with parameters
public class Flavour3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a, b, c;
    System.out.print("Enter 3 integers: ");
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

    System.out.println("The largest integer is " + largest(a, b, c));;
  }

  public static int largest(int a, int b, int c) {
    int large = a;
    large = b > large ? b : large;
    large = c > large ? c : large;

    return large;
  }
}
