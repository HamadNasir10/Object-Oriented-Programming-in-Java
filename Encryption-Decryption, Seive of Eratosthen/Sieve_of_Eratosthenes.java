/*

Name: Hamad Nasir
Roll Number: 120312
Section: BSCS-6C
Assignment No.1
                              *QUESTION NO. 2*
 */

package sieve_of_eratosthenes;
/**
 *
 * @author Hamad nasir
 */
public class Sieve_of_Eratosthenes {
public static void main(String[] args) {
   
   int size=1000;
   boolean[] is_prime=new boolean[size];  //initialize elements array 
   is_prime[0]=false; //here [0] is showing first element as 1 is not prime so it is false
   
   System.out.printf("Prime number between 2 and 999 are: \n");
   
   for(int a=1;a<size;a++){ 
   is_prime[a]=true; // here it is assumed that all the elements are prime
   }  
   
   
   for(int i=2 ;i<=size; i++){
       if(is_prime[i-1]==true){  //here it is representing second element 2 which is prime
           System.out.println(i); // prints out all prime elements of array
           
           for(int j=i*i; j<=size; j+=i){ //consider all the aubsequent multiples of i false 
               is_prime[j-1]=false;
              } //end for
            } //end if
        }  //end for 
    }
    
}
