package Program5;

//Name - Andrew Smiley
//Chapter 1
//Program 5
import java.util.Scanner;
public class Input {
    public static void main () {
        //I got me some scanner
        Scanner keyboard = new Scanner(System.in);

        //here are my variables
        int intOne, intTwo;
        double doubleOne, doubleTwo;
        float floatOne, floatTwo;
        short shortOne, shortTwo;

        System.out.print("Enter an integer: ");
        intOne = keyboard.nextInt();
        System.out.print("Enter an integer: ");
        intTwo = keyboard.nextInt(); //this line gets the next int

        System.out.print("Enter a double: ");
        doubleOne = keyboard.nextDouble();
        System.out.print("Enter a double: "); //this line gets the next double
        doubleTwo = keyboard.nextDouble();

        System.out.print("Enter a float: ");
        floatOne = keyboard.nextFloat();
        System.out.print("Enter a float: "); //this line gets the next float
        floatTwo = keyboard.nextFloat();

        System.out.print("Enter a short: ");
        shortOne = keyboard.nextShort();
        System.out.print("Enter a short: "); //this line gets the next short
        shortTwo = keyboard.nextShort();

        //output
        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );
        System.out.println("double one = " + doubleOne );
        System.out.println("double two = " + doubleTwo );
        System.out.println("float one = " + floatOne );
        System.out.println("float two = " + floatTwo );
        System.out.println("short one = " + shortOne );
        System.out.println("short two = " + shortTwo );


    }
}

