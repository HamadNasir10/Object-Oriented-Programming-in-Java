//Name=Hamad Nasir
//Roll Number=120312
//Section=BSCS-6C
//Lab-3 Task-1

package rectangle;

/**
 *
 * @author Hamad nasir
 */
public class Rectangle {    
    private static double height;
    private static double width;

    public Rectangle() {
        height=1;
        width=1;
    }

    public Rectangle(double h, double w) {
        height = h;
        width = w;
    }

    public double FindPerim() {
        return height*2 + width*2;
    }   
}

