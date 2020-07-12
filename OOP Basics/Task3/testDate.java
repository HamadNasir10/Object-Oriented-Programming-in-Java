//Name=Hamad Nasir
//Roll Number=120312
//Section=BSCS-6C
//Lab-3 Task-3

package data;

/**
 *
 * @author Hamad nasir
 */
import java.util.Scanner;

public class testDate {

    public static void main(String [] args){
Scanner S = new Scanner(System.in);
System.out.print("Enter year: ");
int year = S.nextInt();
System.out.print("Enter month: ");
int month = S.nextInt();
System.out.print("Enter day: ");
int day = S.nextInt();
Date date = new Date(year, month, day);
System.out.print("You Entered :");
date.display();
}
}
