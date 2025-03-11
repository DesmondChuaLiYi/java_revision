package FileAndStream;

import java.util.*;
import java.io.*;

public class FileStream3 {
  public static void main(String[] args) {
    writeFile();
    readFile();
  }

  public static void writeFile() {
    Scanner input = new Scanner(System.in);
    int number;
    FileWriter fileWriter;
    Formatter writeRand;

    try {
      fileWriter = new FileWriter("AnyNumbers.txt", true);
      writeRand = new Formatter(fileWriter);
      System.out.println("AnyNumbers.txt created successfully!");

      System.out.print("\nEnter any number: ");
      number = input.nextInt();
      writeRand.format("%2d %n", number);
      writeRand.close();
    }
    catch (Exception e) {
      System.out.println("(Write) An error has occured!");
    }
  }

  public static void readFile() {
    int data, sumOfDigit, countOfDigit;
    Scanner readNumber;

    try {
      readNumber = new Scanner(new File("AnyNumbers.txt"));
      while(readNumber.hasNext()) {
        data = readNumber.nextInt();
        System.out.printf("%d has ", data);
        sumOfDigit = 0;
        countOfDigit = 0;
        while (data > 0) {
          sumOfDigit += data % 10;
          data /= 10;
          countOfDigit++;
        }
        System.out.printf("%d digit with sum of %d %n", countOfDigit, sumOfDigit);
      }
      readNumber.close();
    }
    catch (Exception e) {
      System.out.println("(Read) File not found!");
    }
  }
}
