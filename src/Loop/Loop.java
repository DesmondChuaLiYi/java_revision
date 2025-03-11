package Loop;

import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Example 1 - Prints a triangle
    /*int i, j;

    for (i = 0; i < 5; ++i) {
      for (j = 0; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }*/

    // Exercise 1
    /*int i, j;
    int n = 7;

    for (i = 1; i <= n; ++i) {
      for (j = 1; j <= i; ++j) {
        System.out.printf(" %2d", i * j);
      }
      System.out.println();
    }*/

    // Example 2 - Reverse an integer
    int num = 9895;
    System.out.println("Before reverse: " + num);

    int result = 0;
    while (num > 0) {
      result = result * 10 + (num % 10);
      num /= 10;
    }

    System.out.println("After reverse: " + result);
  }
}
