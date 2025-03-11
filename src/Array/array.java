package Array;

import java.util.Scanner;

public class array {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Arrays and random number generator
    /*Random randomSize = new Random();

    int[] shoeSize = new int[5];

    for (int i = 0; i < shoeSize.length; ++i) {
      shoeSize[i] = randomSize.nextInt(4, 12);
    }

    System.out.println("\nDisplaying shoe sizes:");

    int largest = shoeSize[0];
    int smallest = shoeSize[0];

    for (int size : shoeSize) {
      System.out.println("US Shoe Size: " + size);

      largest = Math.max(largest, size);
      smallest = Math.min(smallest, size);
    }

    System.out.println("\nThe largest shoe size generated is " + largest);
    System.out.println("The smallest shoe size generated is " + smallest);*/

    // String array
    /*String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    for (int i = 0; i < months.length; ++i) {
      System.out.println(months[i] + " has " + days[i] + " days.");
    }*/

    // String array with .equalsIgnoreCase()
    /*String dreamCar;
    String[] car = {"Mazda", "Toyota", "BMW", "Nissan", "Perodua", "Mitsubishi", "Ford"};
    System.out.print("Enter your dream car: ");
    dreamCar = input.nextLine();

    for (int i = 0; i < car.length; ++i) {
      if (dreamCar.equalsIgnoreCase(car[i])) {
        System.out.println("Congrats, you will get your dream car - " + car[i]);
      }
    }*/

    // Copying elements from array to array
    /*int[] array1 = new int[5];
    int[] array2 = new int[5];
    for (int i = 0; i < array1.length; ++i) {
      System.out.print("Enter a number: ");
      array1[i] = input.nextInt();
    }

    System.arraycopy(array1, 0, array2, 0, 5);
    for (int i : array1) {
      System.out.print(i + " ");
    }

    System.out.println();

    for (int i : array2) {
      System.out.print(i + " ");
    }*/

    // Multidimensional array
    /*int[][] twoD = new int[3][4];
    for (int i = 0; i < twoD.length; ++i) {
      for (int j = 0; j < twoD[i].length; ++j) {
        System.out.print("[" + i + "][" + j + "] Enter a number: ");
        twoD[i][j] = input.nextInt();
      }
    }

    for (int[] rowTwoD : twoD) {
      for (int element : rowTwoD) {
        System.out.printf(" %02d", element);
      }
      System.out.println();
    }*/

    // Multidimensional array example
    /*int[][] steps = new int[2][7];
    int weeklySteps, totalSteps = 0;

    System.out.println("Enter steps taken each day for two weeks time");
    for (int i = 0; i < steps.length; ++i) {
      weeklySteps = 0;
      for (int j = 0; j < steps[i].length; ++j) {
        System.out.print("Week " + (i + 1) + " Day " + (j + 1) + "\nEnter steps taken today: ");
        steps[i][j] = input.nextInt();
        weeklySteps += steps[i][j];
      }
      System.out.println("\nTotal weekly steps: " + weeklySteps);
      totalSteps += weeklySteps;
    }
    System.out.println("Average steps taken: " + (totalSteps / 2));*/

    // 2D array rows with different lengths
    int[][] array = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}};

    for (int[] rowArray : array) {
      for (int element : rowArray) {
        System.out.print(element + " ");
      }
      System.out.println();
    }

    System.out.println("Length of row 1 : " + array[0].length);
    System.out.println("Length of row 2 : " + array[1].length);
    System.out.println("Length of row 3 : " + array[2].length);

    findMin(array);
  }

  public static void findMin(int[][] data) {
    int min = data[0][0];
    for (int i = 0; i < data.length; ++i) {
      for (int j = 0; j < data[i].length; ++j) {
        min = Math.min(min, data[i][j]);
      }
    }
    System.out.println("The smallest value is " + min);
  }
}