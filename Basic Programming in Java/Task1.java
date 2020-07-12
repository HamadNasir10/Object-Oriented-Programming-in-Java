//Name:Hamad Nasir
//Roll Number:120312
//Lab_1 Task1
//Objectives to hold student information

package task1;
import java.util.Scanner;
public class Task1 
{
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter year of  student");
      String year =scan.next();
      System.out.println("Enter number of courses student is taking");
      int course=scan.nextInt();
      System.out.println("Enter the GPA of the student");
      float GPA=scan.nextFloat();
      
      System.out.printf("Student's year:%s",year);
      System.out.printf("\nNumber of course:%d",course);
      System.out.printf("\nGPA of the student:%.2f",GPA);
      
    }
    
}
