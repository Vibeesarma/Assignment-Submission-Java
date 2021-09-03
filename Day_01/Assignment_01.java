
import java.util.*;

class Student{

    public static void main(String[] args){
      int roll;
     String name;
     float marks;

    System.out.print("Enter the roll number of the Student:");
    Scanner sc = new Scanner(System.in);
    roll=sc.nextInt();
    System.out.print("Enter the Name of the Student :");
    name=sc.nextLine();
    System.out.print("Enter the marks of the Student");
    marks =sc.nextFloat();

    System.out.println("student roll number is " + roll);
    System.out.println("Student name is "+name);
    System.out.println("student marks is "+marks);

  }

}