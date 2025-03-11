package Assignment.Question1;

import java.util.Scanner;

public class TestDriverProgram {
  public static void main(String[] args) {
    // Scanner object
    Scanner input = new Scanner(System.in);

    // Electric blanket object
    ElectricBlanket blanket = new ElectricBlanket();

    // Blanket size
    System.out.print("Enter blanket size: \n(Single/Twin/Queen/King) ");
    blanket.setSize(input.nextLine());

    // Blanket color
    System.out.print("Enter blanket's color: ");
    blanket.setColor(input.nextLine());

    // Blanket material
    System.out.print("Enter blanket's material: ");
    blanket.setMaterial(input.nextLine());

    // Number of heat settings
    System.out.print("Number of heat setting: \n(1-5) ");
    blanket.setHeatSetting(input.nextInt());

    // Automatic shutoff feature
    char option;
    do {
      System.out.print("Do you want an automatic shut off feature? \n(Y/N) ");
      option = Character.toUpperCase(input.next().charAt(0));
    } while (option != 'Y' && option != 'N');

    boolean op = (option == 'Y' ? true : false);
    blanket.setAuto(op);

    // Adds 5.75 to the total price if automatic shutoff feature is included
    double addition = (op ? 5.75 : 0);
    double price = blanket.getPrice() + addition;
    blanket.setPrice(price);

    System.out.println(blanket.toString());
  }
}