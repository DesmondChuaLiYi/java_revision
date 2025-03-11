package Obj.Teacher_Student;

import java.util.Scanner;

public class Student {
  // Instance variable
  protected String id;
  protected String name;
  protected int yearBirth;
  protected char gender;

  // Default constructor
  public Student() {

  }

  // Parameterized constructor
  public Student(String id, String name, int yearBirth, char gender) {
    this.id = id;
    this.name = name;
    this.yearBirth = yearBirth;
    this.gender = gender;
  }

  public Student(String n, int year, char g) {
    name = n;
    yearBirth = year;
    gender = g;
  }

  // Setter methods
  public void setName(String n) {
    name = n;
  }
  public void setId(String i) {
    id = i;
  }
  public void setYearBirth(int year) {
    yearBirth = year;
  }
  public void setGender(char g) {
    gender = g;
  }

  // Getter methods
  public String getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public int getYearBirth() {
    return yearBirth;
  }
  public char getGender() {
    return gender;
  }

  // Member methods
  public void printDetails() {
    System.out.println(name + " " + id + " " + yearBirth + " " + gender);
  }

  public int printAge(int current) {
    return current - yearBirth;
  }

  public String toString() {
    return name + " " + id + " " + yearBirth + " " + gender;
  }
}
