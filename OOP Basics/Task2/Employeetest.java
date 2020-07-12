//Name=Hamad Nasir
//Roll Number=120312
//Section=BSCS-6C
//Lab-3 Task-2

package employee;

/**
 *
 * @author Hamad nasir
 */
import java.util.Scanner;
public class Employeetest {
public static void main(String[] args){
Scanner S = new Scanner(System.in);

System.out.println("Enter the first name: ");
String fname = S.next();

System.out.println("Enter the last name: ");
String lname = S.next();

System.out.println("Enter the Salary: ");
double sal = S.nextDouble();

Employee e =new Employee(fname,lname ,sal );
System.out.println("the yearly salary of "+e.getFirstName()+" "+e.getLastName()+" :");

System.out.println(e.getMonthlySalary()*12);
double newsalary= e.getMonthlySalary()*0.1+e.getMonthlySalary();
e.setMonthlySalary(newsalary);

System.out.println("the new yearly salary of "+
e.getFirstName()+" "+e.getLastName()+" :");

System.out.println(e.getMonthlySalary()*12);
e.getMonthlySalary();
}
}