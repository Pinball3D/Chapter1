package Program6;
//Andrew Smiley
//Program 6
//Chapter 1
import java.util.Scanner;
public class PerimeterAreaRec{
    Scanner keyboard = new Scanner(System.in);
    private int length;
    private int width;
    private int perimeter;
    private int area;

    public void setLengthWidth() {
        // prompt and set the user data to the private variables
        System.out.print("The length of the rectangle is ");
        length = keyboard.nextInt();
        System.out.print("The width of the rectangle is ");
        width = keyboard.nextInt();
    }
    public void calculatePerimeter() {
        perimeter = (2 * length) + (2 * width);
    }
    public void calculateArea() {
        area = length * width; // this calculates the area by using * to multiply the length and width
    }
    public void print() {
        System.out.println("The perimeter of the rectangle is "+perimeter+".");
        System.out.println("The area of the rectangle is "+area+".");
    }
    public static void main(String args[]) {
        PerimeterAreaRec test = new PerimeterAreaRec();
        test.setLengthWidth();
        test.calculatePerimeter();
        test.calculateArea();
        test.print();
    }
    /*
    OUTPUT:
    The length of the rectangle is 2
    The width of the rectangle is 3
    The perimeter of the rectangle is 10.
    The area of the rectangle is 6.
     */
}

