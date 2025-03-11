package Obj.Bank;

abstract class Bank {
  abstract double getRateOfInterest();
}

class MayBank extends Bank {
  double getRateOfInterest() {
    return 8.5;
  }
}

class CIMB extends Bank {
  double getRateOfInterest() {
    return 7.8;
  }
}

public class TestBank {
  public static void main(String[] args) {
    Bank object1 = new MayBank();
    System.out.println("MayBank: " + object1.getRateOfInterest());

    MayBank object2 = new MayBank();
    System.out.println("MayBank: " + object2.getRateOfInterest());

    CIMB object3 = new CIMB();
    System.out.println("CIMB: " + object3.getRateOfInterest());

    CIMB object4 = new CIMB();
    System.out.println("CIMB: " + object4.getRateOfInterest());
  }
}
