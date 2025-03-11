package Obj.Bike;

abstract class Bike {
  abstract void run();
  Bike() {
    System.out.println("Bike is created.");
  }

  public void changeGear() {
    System.out.println("Gear changed.");
  }
}

public class Honda extends Bike {
  public Honda() {
    System.out.println("Honda object is created.");
  }

  void run() {
    System.out.println("Running safely with 100km/h");
  }

  void speed() {
    System.out.println("Speed up to 200 km/h");
  }
}
