//Name:Hamad Nasir
//Class:BSCS-6C
//Roll Number:120312
//Lab_1 Activity_2

package activitytwo;

public class ActivityTwo {
    
    public static void main(String[] args) {
        
int sum;
int x;
x = 1; // initialize x to 1 for counting
sum = 0; // initialize sum to 0 for totaling
System.out.printf( "Going to calculate the sum" );
while ( x <= 10 ) // while x is less than or equal to 10
{   
sum += x; // add x to sum
x++;  //Increment the value of x
} // end while
System.out.printf( "The sum is: %d\n", sum );
    }
    
}
