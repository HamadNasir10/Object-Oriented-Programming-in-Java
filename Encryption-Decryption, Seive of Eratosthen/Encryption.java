/*

Name: Hamad Nasir
Roll Number: 120312
Section: BSCS-6C
Assignment No.1
                              *QUESTION NO. 1*
 */

package encryption;

/**
 *
 * @author Hamad nasir
 */
import java.util.Scanner;
 
class Encryption {
    public static void main(String[] args) {
     
    // variable initialization
    int first_digit;
    int second_digit;
    int third_digit;
    int fourth_digit;
    int number;

    //inputs 4 digit integer    
    Scanner input=new Scanner(System.in);
    System.out.printf("Enter the 4 digit integer: \n");
    number=input.nextInt();
    
    //algorithm for encryption
        first_digit = number / 1000;
	second_digit = (number / 100) % 10;
	third_digit = (number / 10) % 10;
	fourth_digit = number % 10;

        //adding 7 to the digits and getting the remainder after dividing the new value by 10.
	first_digit = (first_digit + 7) % 10;
	second_digit = (second_digit + 7) % 10;
	third_digit = (third_digit + 7) % 10;
	fourth_digit = (fourth_digit + 7) % 10;

	int temp;	// temporary int to hold values
	temp = first_digit;
	first_digit = third_digit;  //swapping first digit with third
	third_digit = temp;

	temp = second_digit;  
	second_digit = fourth_digit;  //swapping second digit with the fourth
	fourth_digit = temp;

        //prints the encrypted integers
        System.out.println("The encrypted 4 digit integer is: ");
        System.out.print(first_digit);
        System.out.print(second_digit);
        System.out.print(third_digit);
        System.out.println(fourth_digit);
        
    }
    
}
