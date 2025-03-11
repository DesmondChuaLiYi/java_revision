package LabPractical1;

import java.util.Scanner;

// Important
/*
Warning: ChatGPT was used!
 */

public class Question1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    // Initialising the variable
    int number;

    System.out.print("Enter an integer: ");
    number = input.nextInt();

    // Calls the reverseNumber function
    System.out.println(reverseNumber(number));
  }

  public static String reverseNumber(int number) {
    // Initialising a String array
    String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    // Initialising a StringBuider
    StringBuilder reversedText = new StringBuilder();

    if (number == 0) {
      // If the number entered is 0, it returns "zero"
      return words[0];
    }

    // While loop to reverse the numbers and add their text form into a string
    while (number != 0) {
      int n = number % 10;
      reversedText.append(words[n]).append(" ");
      number /= 10;
    }

    // Returns the reversed number in text form
    return reversedText.toString();
  }
}