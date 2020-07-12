//Name=Hamad Nasir
//Roll Number=120312
//Lab_2 Task_2

package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        int kilometers;
        int liters;
        float mileage;
        int tracks;
        int counter=1;
        float sum=0;
        
        System.out.println("Enter the number of tracks.");
        tracks=input.nextInt();
        
        while(counter<=tracks){
        counter++;
        
        System.out.println("Enter the kilometers.");
        kilometers=input.nextInt();
        
        System.out.println("Enter the liters.");
        liters=input.nextInt();
        
        mileage =(float) kilometers/liters;
        
        System.out.printf("The mileage is %.2f.\n", mileage );
        sum= sum+mileage ;
        }
        System.out.printf("The sum of mileage of %d tracks is %.2f.\n",tracks, sum );
    }
}
