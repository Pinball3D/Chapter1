package Program5;
//Name - Andrew Smiley
//Chapter 1
//Program 5
import java.util.Scanner;
public class Input
{
    public static void main (String[] args)
    {
        //I got me some scanner
        Scanner keyboard = new Scanner(System.in);

        //here are my variables
        int intOne, intTwo;
        double doubleOne, doubleTwo;
        float floatOne, floatTwo;
        short shortOne, shortTwo;

        System.out.print("Enter an integer : ");
        intOne = keyboard.nextInt();
        System.out.print("Enter an integer : ");
        intTwo = keyboard.nextInt();
        System.out.print("Enter an double : ");
        doubleOne = keyboard.nextDouble();
        System.out.print("Enter an double : ");
        doubleTwo = keyboard.nextDouble();
        System.out.print("Enter an float : ");
        floatOne = keyboard.nextFloat();
        System.out.print("Enter an float : ");
        floatTwo = keyboard.nextFloat();
        System.out.print("Enter an short : ");
        shortOne = keyboard.nextShort();
        System.out.print("Enter an short : "); //this prints the prompt for the second short
        shortTwo = keyboard.nextShort();


        //output the integers
        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );
        System.out.println(); //this adds a space between the lines.
        System.out.println("double one = " + doubleOne );
        System.out.println("double two = " + doubleTwo );
        System.out.println();
        System.out.println("float one = " + floatOne );
        System.out.println("float two = " + floatTwo );
        System.out.println();
        System.out.println("short one = " + shortOne );
        System.out.println("short two = " + shortTwo );


    }
}

