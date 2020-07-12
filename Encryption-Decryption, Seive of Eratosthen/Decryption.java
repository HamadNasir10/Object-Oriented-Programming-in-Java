/*

Name: Hamad Nasir
Roll Number: 120312
Section: BSCS-6C
Assignment No.1
                              *QUESTION NO. 1*
 */

package decryption;
/**
 *
 * @author Hamad nasir
 */
import java.util.Scanner;
public class Decryption {
    
     public static void main(String[] args) {

    //initialize variables 
    int first_digit;
    int second_digit;
    int third_digit;
    int fourth_digit;
    int number;

    //inputs 4 digit integer
    Scanner input=new Scanner(System.in);
    System.out.printf("Enter an encrypted 4 digit integer: \n");
    number=input.nextInt();
 
    //algorithm for decryption 
    second_digit = number % 10;
    first_digit = ( number / 10 ) % 10;
    fourth_digit = ( number / 100 ) % 10;
    third_digit = ( number / 1000 ) % 10;

    if( first_digit < 7 )
    first_digit += 10;

    if( second_digit < 7 )
    second_digit += 10;

    if( third_digit < 7 )
    third_digit += 10;

    if( fourth_digit < 7 )
    fourth_digit += 10;

    //minus of seven from each digit
    first_digit -= 7;
    second_digit -= 7;
    third_digit -= 7;
    fourth_digit -= 7;

    //prints the decrypted 4 digit integer
    System.out.printf("The decrypted 4 digit integer is: \n");
    System.out.print(first_digit);
    System.out.print(second_digit);
    System.out.print(third_digit);
    System.out.println(fourth_digit);     

   }
}