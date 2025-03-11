package Obj.Teacher_Student;

// Inherit attributes from Student class
public class PartTimeStudent extends Student {
  public String occupation;
  public PartTimeStudent(String o) {
    occupation = o;
  }

  public PartTimeStudent(String i, String n, int y, char g, String o) {
    // To call the super constructor
    super(i, n, y, g);
    occupation = o;
  }

  public void printDetails() {
    System.out.println("Part Time Student Details: ");
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Year of Birth: " + yearBirth);
    System.out.println("Gender: " + gender);
    System.out.println("Occupation: " + occupation);
  }
}
