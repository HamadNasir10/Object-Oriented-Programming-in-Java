//Name=Hamad Nasir
//Roll Number=120312
//Section=BSCS-6C
//Lab-3 Task-4

package employee;

/**
 *
 * @author Hamad nasir
 */
public class Employee {
private String firstName;
private String lastName;
private double monthlySalary;
public Employee(String f, String l, double m){
firstName = f;
lastName = l;
if(m < 0){ // you can also use setMonthlySalary(m)
monthlySalary =0;
}
else monthlySalary = m;
}
public String getFirstName() {
return firstName;
}
public void setFirstName(String fname) {
firstName = fname;
}
public String getLastName() {
return lastName;
}
public void setLastName(String lname) {
lastName = lname;
}
public double getMonthlySalary() {
return monthlySalary;
}
public void setMonthlySalary(double m) {
if(m < 0){
monthlySalary =0;
}
else monthlySalary = m;
  }
}