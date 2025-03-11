package Obj.Teacher_Student;

// Inheritance
public class Teacher {
  protected String destination = "Teacher";
  protected String schoolName = "SMK St. Luke";
  public String getDestination() {
    return destination;
  }
  public String getSchoolName() {
    return schoolName;
  }
  public void does() {
    System.out.println("Main role: Teaching!");
  }
}
