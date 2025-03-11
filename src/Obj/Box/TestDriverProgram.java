package Obj.Box;

public class TestDriverProgram {
  public static void main(String[] args) {
    JumboBox object = new JumboBox(2.5, 3, 4.3, 5.8);
    System.out.println(object.toString());

    Countable c1 = new Countable();
    Countable c2 = new Countable();
    Countable c3 = new Countable();
  }
}