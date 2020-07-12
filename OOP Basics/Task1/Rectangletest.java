//Name=Hamad Nasir
//Roll Number=120312
//Section=BSCS-6C
//Lab-3 Task-1

package rectangle;

/**
 *
 * @author Hamad nasir
 */
import java.util.Scanner;

public class Rectangletest {
   
    public static void main(String[] args) {
       
            Scanner scanL = new Scanner (System.in);
            System.out.print("Please enter the length of the rectangle: ");
            double H = scanL.nextDouble();
            
            Scanner scanW = new Scanner (System.in);
            System.out.print("Please enter the length of the rectangle: ");
            double W = scanW.nextDouble();

             double RectanglePermiter;
            Rectangle perimRectangle = new Rectangle();
            RectanglePermiter = perimRectangle.FindPerim();
            System.out.println("The permimiter of the unit rectangle is " + RectanglePermiter);
    }
}