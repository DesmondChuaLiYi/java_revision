package LabPractical1;

import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Initialising the variable
    int decimal;

    System.out.print("Enter a decimal number: ");
    decimal = input.nextInt();

    System.out.print("Octal: ");
    // Function call to convert decimal to octal
    decimalToOctal(decimal);
  }

  public static void decimalToOctal(int number) {
    int quotient = number / 8;
    int remainder = number % 8;

    if (quotient == 0) {
      // The stopping rule
      System.out.print(remainder);
    } else {
      // The function calls itself
      decimalToOctal(quotient);
      System.out.print(remainder);
    }
  }
}