package Obj.Teacher_Student;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestDriver {
  public static void main(String[] args) {
    // Scanner object
    Scanner input = new Scanner(System.in);


    // Student 1
    Student student1 = new Student();
    student1.id = "DSE-123";
    student1.name = "Eddery Ngui";
    student1.yearBirth = 2001;
    student1.gender = 'M';

    student1.printDetails();
    System.out.println(student1.name + " is " + student1.printAge(2023) + " years old.\n");


    // Student 2
    Student student2 = new Student();
    System.out.print("Enter your name: ");
    String dataName = input.nextLine();

    System.out.print("Enter your id: ");
    String dataId = input.nextLine();

    System.out.print("Enter your year of birth: ");
    int dataYB = input.nextInt();

    System.out.print("Enter your gender (M/F): ");
    char dataGender = input.next().charAt(0);

    // Assign values to student 2
    student2.id = dataId;
    student2.name = dataName;
    student2.yearBirth = dataYB;
    student2.gender = dataGender;

    // Print information
    System.out.println();
    student2.printDetails();
    System.out.println(student2.name + " is " + student2.printAge(2023) + " years old.\n");


    // Student 3
    Student student3 = new Student("DSE-333", "Vergil", 1998, 'M');
    student3.printDetails();


    // Student 4
    Student student4 = new Student("Dante", 1998, 'M');
    System.out.println(student4.toString());


    // Part-time student
    PartTimeStudent pt1 = new PartTimeStudent("1110", "Barry Allen", 2003, 'M', "Accountant");
    pt1.printDetails();


    // Teacher
    Teacher Angel = new Teacher();
    System.out.println("Angel is a " + Angel.getDestination());
    System.out.println("She's teaching at " + Angel.getSchoolName());
    Angel.does();


    // Admin role teacher
    AdminRoleTeacher Grace = new AdminRoleTeacher();
    Grace.setPosition("Principle");
    System.out.println("Grace is a " + Grace.getDestination());
    System.out.println("She is teaching at " + Grace.getSchoolName());
    Grace.does();
  }
}
