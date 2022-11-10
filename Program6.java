/*
 * Learning outcome
 * how to get user input
 */
import java.util.Scanner;

public class Program6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // declaring variables for a student
    String name;
    int id, age;
    double gpa;
    boolean isRegisted;

    // getting inputs for a student
    System.out.print("Enter student name: ");
    name = input.nextLine();

    System.out.print("Enter student id: ");
    id =  input.nextInt();

    System.out.print("Enter student age: ");
    age =  input.nextInt();

    System.out.print("Enter student gpa: ");
    gpa =  input.nextDouble();

    System.out.print("Enter student is isregistered? true/false : ");
    isRegisted =  input.nextBoolean();

    // printing variables
    System.out.println("Student Information");
    System.out.println("--------------------");
    System.out.println("Name: "+name);
    System.out.println("ID: "+id);
    System.out.println("Age: "+age);
    System.out.println("GPA: "+gpa);
    System.out.println("Registered: "+isRegisted);
  }
}
