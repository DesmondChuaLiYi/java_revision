package FileAndStream;

import java.util.*;
import java.io.*;
import java.util.Random;

public class FileStream1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Example 1
    /*// File writer
    Formatter newFile;

    int i = 0;
    try {
      newFile = new Formatter("JavaText.txt");
      System.out.println("Text file created successfully!");

      while (i < 1) {
        System.out.print("Enter id, first name and last name: ");

        String id, fname, lname;
        id = input.nextLine();
        fname = input.nextLine();
        lname = input.nextLine();

        newFile.format("%s %s %s %n", id, fname, lname);
        ++i;
      }
      newFile.close();
    }
    catch(Exception e) {
      System.out.println("(write) An error occured!");
    }

    // File reader
    Scanner readFile;

    try {
      readFile = new Scanner(new File("JavaText.txt"));

      while (readFile.hasNext()) {
        String readId = readFile.next();
        String fname = readFile.next();
        String lname = readFile.next();

        System.out.printf("%s %s %s %n", readId, fname, lname);
      }
    }
    catch (Exception e) {
      System.out.println("(Read) File not found!");
    }*/

    // Example 2 - Find total
    /*int[] numbers = {2, 4, 6, 8, 10, 12, 14};
    Formatter write;

    try {
      write = new Formatter("Numbers.txt");
      System.out.println("You have created Numbers.txt file");

      for (int i = 0; i < numbers.length; ++i) {
        write.format("%d ", numbers[i]);
      }
      write.close();
    }
    catch (Exception e) {
      System.out.println("(Read) An error has occured!");
    }

    Scanner readNumber;
    int total = 0;

    try {
     readNumber = new Scanner(new File("Numbers.txt"));

     while (readNumber.hasNext()) {
       int num = readNumber.nextInt();
       total += num;
     }
      System.out.println("Total is " + total);
    }
    catch (Exception e) {
      System.out.println("(Read) File not found!");
    }*/

    // Example 3 - Calculate even and odd numbers
    /*Random rand = new Random();
    int number;
    Formatter writeRand;

    try {
      writeRand = new Formatter("RandomNumber.txt");
      for (int i = 0; i < 10; ++i) {
        number = 1 + rand.nextInt(20);
        writeRand.format("%d ", number);
      }
      writeRand.close();
    }
    catch (Exception e) {
      System.out.println("(Write) An error has occured!");
    }

    Scanner readNumber;
    int countEven = 0, countOdd = 0;

    try {
      readNumber = new Scanner(new File("RandomNumber.txt"));
      while (readNumber.hasNext()) {
        int num = readNumber.nextInt();
        num = (num % 2 == 0 ? countEven++ : countOdd++);
      }
      readNumber.close();
      System.out.println("There are " + countEven + " even numbers generated.");
      System.out.println("There are " + countOdd + " odd numbers generated.");
    }
    catch (Exception e) {
      System.out.println("(Read) File not found!");
    }*/

    // Example 4 - Find match
    /*Random rand = new Random();
    int number;
    Formatter writeRand;

    try {
      writeRand = new Formatter("RandomNumber.txt");
      for (int i = 0; i < 10; ++i) {
        number = 1 + rand.nextInt(20);
        writeRand.format("%d ", number);
      }
      writeRand.close();
    }
    catch (Exception e) {
      System.out.println("(Write) An error has occured!");
    }

    Scanner readNumber;
    int countEven = 0, countOdd = 0;
    boolean matchFound = false;

    System.out.print("Enter a number (1-20): ");
    int n = input.nextInt();

    try {
      readNumber = new Scanner(new File("RandomNumber.txt"));
      while (readNumber.hasNext()) {
        int num = readNumber.nextInt();
        if (n == num) {
          matchFound = true;
          break;
        }
      }
      readNumber.close();
      System.out.println(matchFound ? "Match found!" : "Match not found!");
    }
    catch (Exception e) {
      System.out.println("(Read) File not found!");
    }*/

    // Example 5 - Appending instead of rewriting the file
    Random rand = new Random();
    int number;
    FileWriter fileWriter;
    Formatter writeRand;

    try {
      fileWriter = new FileWriter("RandomNumber.txt", true);
      writeRand = new Formatter(fileWriter);
      for (int i = 0; i < 10; ++i) {
        number = 1 + rand.nextInt(20);
        writeRand.format("%2d ", number);
      }
      writeRand.format("%n");
      writeRand.close();
    }
    catch (Exception e) {
      System.out.println("(Write) An error has occured!");
    }

    Scanner readNumber;
    int countEven = 0, countOdd = 0;
    boolean matchFound = false;

    System.out.print("Enter a number (1-20): ");
    int n = input.nextInt();

    try {
      readNumber = new Scanner(new File("RandomNumber.txt"));
      while (readNumber.hasNext()) {
        int num = readNumber.nextInt();
        if (n == num) {
          matchFound = true;
          break;
        }
      }
      readNumber.close();
      System.out.println(matchFound ? "Match found!" : "Match not found!");
    }
    catch (Exception e) {
      System.out.println("(Read) File not found!");
    }
  }
}
