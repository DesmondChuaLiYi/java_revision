package LabPractical1;

import java.util.Scanner;
import java.util.Random;

public class Question3 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    // Initialising variables
    double row_total = 0.0;
    double avg = 0.0;
    int total = 0;

    // For loop to insert randomly generated numbers into the 2D array
    int[][] array = new int[3][5];
    for (int i=0; i<array.length; ++i) {
      for (int j=0; j<array[i].length; ++j) {
        array[i][j] = random.nextInt(1, 50);
        total += array[i][j];
      }
    }

    // For loop to display the array with randomly generated numbers
    System.out.println("Generated random numbers:");
    for (int i=0; i<array.length; ++i) {
      for (int j=0; j<array[i].length; ++j) {
        System.out.printf("%2d ", array[i][j]);
      }
      System.out.println();
    }

    // For loop to find the average of each rows
    for (int i=0; i<array.length; ++i) {
      for (int j=0; j<array[i].length; ++j) {
        row_total += array[i][j];
      }
      avg = row_total / array[i].length;
      System.out.println("Average value for row " + (i+1) + ": " + avg);

      // Clear the row total
      row_total = 0;
    }

    System.out.println("The total of all generated number is " + total);
  }
}
