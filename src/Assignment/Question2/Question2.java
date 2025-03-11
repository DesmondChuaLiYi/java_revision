package Assignment.Question2;

// Ignore this part
import Assignment.Question1.Blanket;
import Assignment.Question1.ElectricBlanket;

import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Blanket object
    Blanket blanket;

    /* Polymorphism is utilized by using the reference type Blanket to refer to objects of different classes,
        such as Blanket and ElectricBlanket.
        This allows to treat objects of these classes interchangeably, as they share a common superclass.
        By using the Blanket reference, we can access the common properties and methods defined in the Blanket class.
        */

    // Declare a reference of type Blanket

    // Prompt user to choose Blanket or ElectricBlanket
    System.out.println("Enter type of blanket:\n(1 = Blanket / 2 = ElectricBlanket) ");
    int choice = input.nextInt();
    input.nextLine();

    // Read user's choice

    // Create the appropriate blanket object based on user choice
    if (choice == 1) {
      blanket = new Blanket(); // Creating a Blanket object
    } else if (choice == 2) {
      blanket = new ElectricBlanket(); // Creating an ElectricBlanket object
    } else {
      System.out.println("Invalid choice");
      return;
    }

    /* Polymorphism is utilized when creating the appropriate object based on user input.
        The Blanket reference blanket is assigned either a Blanket object or an ElectricBlanket
        object based on the user's choice.
        This allows us to create different types of objects using the same reference type.
        */

    // Set blanket properties
    System.out.print("Enter blanket size: \n(Single/Twin/Queen/King) ");
    blanket.setSize(input.nextLine());

    System.out.print("Enter blanket's color: ");
    blanket.setColor(input.nextLine());

    System.out.print("Enter blanket's material: ");
    blanket.setMaterial(input.nextLine());

    // Additional properties for ElectricBlanket
    if (blanket instanceof ElectricBlanket) {
      // Using instanceof to check if blanket is an instance of ElectricBlanket
      ElectricBlanket electricBlanket = (ElectricBlanket) blanket;

      // Casting blanket to ElectricBlanket to access specific properties

      /* Polymorphism can demonstrate through down-casting
            when checking if blanket is an instance of ElectricBlanket.
            By using instanceof, we determine if the object referred to by blanket is an ElectricBlanket object.
            If it is, we perform a downcast from Blanket to ElectricBlanket
            to access the additional properties and methods specific to the ElectricBlanket class,
            such as setHeatSetting() and setAuto().
             */

      // Set number of heat settings
      System.out.print("Number of heat settings: \n(1-5) ");
      electricBlanket.setHeatSetting(input.nextInt());

      // Set automatic shutoff feature
      char option;
      do {
        System.out.print("Do you want an automatic shut off feature? \n(Y/N) ");
        option = Character.toUpperCase(input.next().charAt(0));
      } while (option != 'Y' && option != 'N');

      electricBlanket.setAuto(option == 'Y');
    }

    // Calculate price for ElectricBlanket
    if (blanket instanceof ElectricBlanket) {
      ElectricBlanket electricBlanket = (ElectricBlanket) blanket;

      double addition = (electricBlanket.getAuto() ? 5.75 : 0);
      double price = electricBlanket.getPrice() + addition;
      electricBlanket.setPrice(price);
    }

    // Display blanket information
    System.out.println(blanket.toString());

    /* Polymorphism is utilized when we override the toString() method
        in both the Blanket and ElectricBlanket classes.
        The overridden toString() method in the respective subclasses
        provides a specific implementation of the method,
        which is invoked dynamically based on the actual object type.
        When blanket.toString() is called,
        the appropriate toString() method is executed based on the actual object
        referred to by the blanket reference.
         */
  }
}
