package Strings;

import java.util.Scanner;

public class Strings {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Example 1
    /*String name = new String();
    System.out.print("Please enter your name: ");
    name = input.next();

    char[] letters = {'H', 'e', 'l', 'l', 'o'};
    String greeting = new String(letters);
    String fruit = "Guava";
    System.out.println("The length of name is " + name.length());

    System.out.println("Name: " + name);
    System.out.println("Greeting: " + greeting);
    System.out.println("Fruit: " + fruit);*/

    // String concatenation, method 1 (use +):
    /*String first = "Java";
    String second = first + " Programming";
    System.out.println(second);*/

    // Method 2 (using concat())
    /*String first1 = "Computer ";
    String second1 = first1.concat("Ethics");
    System.out.println(second1);*/

    // String comparison
    /*String car = "Jaguar";
    String fav = "Ferrari";
    System.out.println(car.equals(fav));*/

    // Transform string into other formats
    /*String age = "15";
    int data = Integer.parseInt(age);
    int calculation = data * 2;
    System.out.println(calculation);*/

    // Extract one singular value from String
    /*char grade;
    grade = "ABCDF".charAt(2);
    System.out.println(grade);*/

    // Extract characters from String
    // Method 1: getChars()
    /*String myStory = "To tell or not to tell";
    char[] extract = new char[5];
    myStory.getChars(3, 8, extract, 0);
    System.out.println(extract);*/

    // Method 2: substring()
    /*String s = "Hello";
    System.out.println(s.substring(0, 2));

    String terms = "SachinTendulkar";
    System.out.println(terms.substring(0, 6));
    System.out.println(terms.substring(6));*/

    // Stringbuffer
    StringBuffer sb = new StringBuffer("i Java");
    char letter;
    letter = sb.charAt(3);

    System.out.println("Buffer = " + sb);
    System.out.println("Length = " + sb.length());
    System.out.println("Capacity = " + sb.capacity());

    System.out.println(letter);
    sb.setCharAt(0, 'I');
    System.out.println(sb);

    sb.insert(2, "like ");
    System.out.println(sb);

    sb.insert(1, " really");
    System.out.println(sb);

    System.out.println(sb.reverse());

    // Stringbuffer example
    /*StringBuffer name = new StringBuffer();
    System.out.print("Please enter your name: ");
    name.append(input.next());

    String display;
    int age = 22;
    display = new StringBuffer("My name is ").append(name).append(". I'm ").append(age).append(" years old.").toString();
    System.out.println(display);*/
  }
}
