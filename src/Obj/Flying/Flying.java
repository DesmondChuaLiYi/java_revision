package Obj.Flying;

interface Flyer {
  public void takeoff();
  public void land();
  public void fly();
}

class Airplane implements Flyer {
  public void takeoff() {
    System.out.println("Hang on, airplane is ready to fly.");
  }
  public void land() {
    System.out.println("Hold on, airplane is ready to land.");
  }
  public void fly() {
    System.out.println("Relay, we are flying!");
  }
}

class Bird implements Flyer {
  public void takeoff() {
    System.out.println("Wings ready, Tweety to take off.");
  }
  public void land() {
    System.out.println("Tweety is ready to land.");
  }
  public void fly() {
    System.out.println("Tweety is flying!");
  }
}

public class Flying {
  public static void main(String[] args) {
    Flying airport = new Flying();
    Airplane plane = new Airplane();
    Bird Tweety = new Bird();

    System.out.println("Let Tweety lands.");
    airport.getPermissionToLand(Tweety);
    System.out.println("Let the airplane lands.");
    airport.getPermissionToLand(plane);
  }
  void getPermissionToLand(Flyer f) {
    f.land();
  }
}
