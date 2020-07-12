//Name=Hamad Nasir
//Roll Number=120312
//Lab_2 Task_1

package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        float weight;
        float height;
        float body_mass_index;
        
        System.out.println("Enter the weight in kilograms.");
        weight=input.nextInt();
        
        System.out.println("Enter the height in metres.");
        height=input.nextInt();
        
        body_mass_index = weight/(height*height);
        
        System.out.printf("Your body mass index is %.2f.\n", body_mass_index );
        
        if( body_mass_index<18.5 )
            System.out.println("You are underweight.");
        
        if( body_mass_index>=18.5 && body_mass_index<=24.5 )
            System.out.println("You are normal.");
        
        if( body_mass_index>=25 && body_mass_index<=29.9)
            System.out.println("You are overweight.");
        
        if( body_mass_index>=30)    
            System.out.println("You are obese.");
        
    }
    
}
