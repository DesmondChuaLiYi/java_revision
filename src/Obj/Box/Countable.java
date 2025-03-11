package Obj.Box;

public class Countable {
  static int count = 0;

  public Countable() {
    count++;
    System.out.println(count);
  }
}
