package Methods;

import java.util.Scanner;

public class Recursion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Factorial 5 is " + factorial(5));

    System.out.println("2 to the power of 5 is " + power(2, 5));

    System.out.print("Series of 5 Fibo numbers: 0 1");
    printFibo(5 - 2);

    System.out.println();
    System.out.println("The 8th Fibo number: " + fib(8));
  }

  public static int factorial(int num) {
    if (num == 0) {
      return 1;
    } else {
      return num * factorial(num - 1);
    }
  }

  public static int power(int num, int exponent) {
    if (exponent == 0) {
      return 1;
    } else {
      return num * power(num, exponent - 1);
    }
  }

  public static void printFibo(int count) {
    int n1 = 0, n2 = 1, n3;
    for (int i = 1; i <= count; ++i) {
      n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }
  }

  public static long fib(long n) {
    if ((n == 0) || (n == 1)) {
      return n;
    } else {
      return fib(n - 1) + fib(n - 2);
    }
  }
}
