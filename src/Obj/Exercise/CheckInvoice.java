package Obj.Exercise;

public class CheckInvoice {
  private String Invoiceid;
  private String description;
  private int quantity;
  private double unitPrice;

  // Default constructor
  public CheckInvoice() {

  }

  // Parameterized constructor
  public CheckInvoice(String Invoiceid, String description, int quantity, double unitPrice) {
    this.Invoiceid = Invoiceid;
    this.description = description;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  // Setter methods
  public void setQuantity(int q) {
    quantity = q;
  }
  public void setUnitPrice(double u) {
    unitPrice = u;
  }

  // Getter methods
  public String getInvoiceid() {
    return Invoiceid;
  }
  public String getDescription() {
    return description;
  }
  public int getQuantity() {
    return quantity;
  }
  public double getUnitPrice() {
    return unitPrice;
  }
  public double getTotal() {
    return unitPrice * quantity;
  }

  public void printDetails() {
    System.out.println(Invoiceid + " " + description + " " + quantity + " " + unitPrice + " " + getTotal());
  }
}
