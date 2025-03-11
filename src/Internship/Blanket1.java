package Internship;

public class Blanket1 {
  protected String size;
  protected String color;
  protected String material;
  protected double price;

  //Constructor
  public Blanket1() {
    size = "Single";
    color = "white";
    material = "cotton";
    price = 30.0;
  }

  //Setter methods
  public void setSize(String s) {
    size = s;
  }

  public void setColor(String c) {
    color = c;
  }

  public void setMaterial(String m) {
    material = m;

    //Material price
    if (material.equalsIgnoreCase("wool")) {
      price += 20;
    } else if (material.equalsIgnoreCase("cashmere")) {
      price += 45;
    } else {
      price += 30.0;
    }
  }

  public void setPrice(double p) {
    price = p;

    if (size.equalsIgnoreCase("twin")) {
      price += 10;
    } else if (size.equalsIgnoreCase("queen")) {
      price += 25;
    } else if (size.equalsIgnoreCase("king")) {
      price += 40;
    }
  }

  //Getter methods
  public String getSize() {
    return size;
  }

  public String getColor() {
    return color;
  }

  public String getMaterial() {
    return material;
  }

  public double getPrice() {
    return price;
  }

  //toString method
  public String toString() {
    return "\nSize: " + size +
            "\nColor: " + color +
            "\nMaterial: " + material +
            "\nPrice: RM" + price;
  }
}
