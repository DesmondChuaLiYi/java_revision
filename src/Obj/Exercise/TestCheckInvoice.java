package Obj.Exercise;

public class TestCheckInvoice {
  public static void main(String[] args) {
    System.out.println("Invoice 1:");
    CheckInvoice invoice1 = new CheckInvoice("123", "Cheese cake", 2, 49.5);
    invoice1.printDetails();

    CheckInvoice invoice2 = new CheckInvoice();
    invoice2.setQuantity(2);
    invoice2.setUnitPrice(40);
    System.out.println("\nInvoice 2:");
    System.out.println("Quantity = " + invoice2.getQuantity() +
                       "\nUnit price = " + invoice2.getUnitPrice() +
                       "\nTotal = " + invoice2.getTotal());
  }
}
