// Class: CSE 1321L
//Section: J04
//Term: Spring 2023
//Instructor: Naga
//Name: Santiago Pineda
//Lab#: 5C
import java.util.Scanner;
public class Lab5C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int ValueX = sc.nextInt();
        System.out.print("Enter y: ");
        int ValueY= sc.nextInt();

        if(ValueX == 0 && ValueY == 0)
    {
        System.out.println("This point is the origin.");                        // if statement for the origin
    }
        if (ValueX == 0 && ValueY>0 || ValueX == 0 && ValueY < 0)
        {System.out.println("This point is on the y axis.");}                  // if statement for the y axis

        if (ValueX > 0 && ValueY == 0 || ValueX < 0 && ValueY == 0)
        {System.out.println("This point is on the x axis. ");}                 // if statement for the x axis

        if (ValueX < 0 && ValueY > 0)
        {System.out.println("This point is in the second quadrant.");}         // if statement for the quadrant 2

        if (ValueX > 0 && ValueY > 0 )
        {System.out.println("This point is in the first quadrant.");}           // if statement for the quadrant 1

        if (ValueX < 0 && ValueY < 0)
        {System.out.println("This point is in the third quadrant.");}              // if statement for the third quadrant

        if (ValueX > 0 && ValueY < 0)
        {System.out.println("This point is in the fourth quadrant.");}             // if statement for the fourth quadrant
        }
        }
