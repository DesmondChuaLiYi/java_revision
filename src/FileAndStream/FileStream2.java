package FileAndStream;

import java.util.*;
import java.io.*;
import java.util.Random;

public class FileStream2 {
  public static void main(String[] args) {
    writeFile();
    readFile();
  }

  public static void writeFile() {
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
      System.out.println("(Write) An error has occurred!");
    }
  }


  public static void readFile() {
    Scanner input = new Scanner(System.in);
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
