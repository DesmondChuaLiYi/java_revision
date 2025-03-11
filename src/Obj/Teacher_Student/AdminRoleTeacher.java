package Obj.Teacher_Student;

public class AdminRoleTeacher extends Teacher {
  // Instance variable
  private String position;

  // Setter method
  public void setPosition(String p) {
    position = p;
  }

  // Getter method
  public String getPosition() {
    return position;
  }

  // Overriding method
  public void does() {
    System.out.println("Teacher with admin role works full day");
    System.out.println("Extra position is " + position);
  }
}
