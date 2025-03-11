package Obj.Box;

public class Calculate {
  final int anyNumber = 40;

  public static int cube(int x) {
    return (int) Math.pow(x, 3);
  }

  public static void main(String[] args) {
    Calculate object = new Calculate();
    int result;
    result = cube(5);
    System.out.println(result);
  }
}
