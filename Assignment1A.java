/*
Class: CSE 1321L
Section: J04
Term: Spring2023
Instructor: Murphy
Name: Santiago Pineda
Assignment#: 1A
*/
import java.util.Scanner;
public class Assignment1A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int red,green,blue;
        System.out.print("Enter a red value (0-255):");
            red= sc.nextInt();
            int invertRed = 255-red;
        System.out.print("Enter a green value (0-255):");
            green= sc.nextInt();
            int invertGreen = 255-green;
        System.out.print("Enter a blue value (0-255):");
            blue = sc.nextInt();
            int  invertBlue = 255-blue;
            //the above prints out the request //
                // then take input /
            // also creates invert color
        System.out.print("The inverted color is red=");
            System.out.print(invertRed);
        System.out.print(",");
        System.out.print(" green=");
            System.out.print(invertGreen);
        System.out.print(",");
        System.out.print(" blue= ");
            System.out.println(invertBlue);
        //the above took the input, inverted it and repeated it back to them
        // also added commas
        float red2, green2 , blue2 ;
        System.out.print("With floating points, that would be red=");

        red2= (invertRed / 255f );
            System.out.print(red2);
        System.out.print   (", ") ;
        System.out.print("green=");
        green2= (invertGreen / 255f);
            System.out.print(green2);
        System.out.println(",");

        System.out.print("blue=");
        blue2 = (invertBlue / 255f) ;
         System.out.print( blue2 );

    }
}

