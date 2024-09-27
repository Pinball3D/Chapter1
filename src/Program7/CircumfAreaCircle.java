package Program7;
//Andrew Smiley
//Chapter 1
//Program 7
import java.util.Scanner;
public class CircumfAreaCircle{
    //Create some instance variables
    Scanner keyboard = new Scanner(System.in);
    Double radius;
    Double circumference;
    Double area;
    public void setRadius(){
        System.out.print("The radius of the circle is "); //this prints the prompt with no "ln" to have it on the same line.
        radius = keyboard.nextDouble();
    }
    public void calculateCircumference(){
        circumference = 2 * 3.14 * radius;
    }
    public void calculateArea(){
        area = 3.14 * radius * radius;
    }
    public void print(){
        System.out.println("The circumference of the circle is "+circumference+".");
        System.out.println("The area of the circle is "+area+".");
    }

    public static void main(String [] args){
        CircumfAreaCircle test = new CircumfAreaCircle();
        test.setRadius();
        test.calculateArea();
        test.calculateCircumference();
        test.print();
    }
    /*
    OUTPUT
    The radius of the circle is 7.
    The circumference of the circle is 43.96.
    The area of the circle is 153.86.

     */
}

