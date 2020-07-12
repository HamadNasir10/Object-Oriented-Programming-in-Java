
//Name:   Hamad Nasir
//Reg: number:   120312
//Lab_1   Task_2
//Objective to give spaces of three between entered sequence numbers

package task_2;


import java.util.Scanner;
 
public class Task_2 {
    public static void main (String [] args) {
         
        Scanner value = new Scanner (System.in);
         
        int number; //number entered by the user
        int number1; //first digit of number
        int number2; //second digit of number
        int number3; //third digit of number
        int number4; //fourth digit of number
        int number5; //fifth digit of number
         
        System.out.println (); //displays a blank line
         
        System.out.print ("Enter An Integer Number Consisting of Five Digits: ");
        number = value.nextInt();
         
        number5 = number % 10;
        number4 = (number % 100)/10;
        number3 = (number % 1000)/100;
        number2 = (number % 10000)/1000;
        number1 = (number % 100000)/10000;
         
        System.out.println ();
         
        System.out.printf ("%d   %d   %d   %d   %d\n", number1, number2, number3, 
                number4, number5);
         
    }
}