// Class: CSE 1321L
//Section: J04
//Term: Spring 2023
//Instructor: Naga
//Name: Santiago Pineda
//Lab#: 4C
import java.util.Scanner;
public class Lab4C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);                // imports scanner and creates a skeleton


    System.out.println("Welcome!");
        System.out.print("Please input a number: ");
        float Number = sc.nextFloat();

        System.out.println("\nWhat would you like to do to this number:");
        System.out.println("0) Get the additive inverse of the number");
        System.out.println("1) Get the reciprocal of the number");
        System.out.println("2) Square the number");
        System.out.println("3) Cube the number");
        System.out.println("4) Exit the program\n");
        float Command = sc.nextFloat();

        float condition0 = (Number / -1);
        float condition1= (1/ Number);
        float condition2= (Number * Number);
        float condition3= (Number * Number * Number);



        switch ((int) Command) {
            case 0:
            System.out.print("\nThe additive inverse of " + Number + " is " + condition0);
                break;
            case 1:
            System.out.print("\nThe reciprocal of " + Number + " is " +condition1);
                break;
            case 2:
                System.out.print("\nThe square of " + Number + " is " + condition2);
                break;
            case 3:
                System.out.print("\nThe cube of " + Number + " is " + condition3);
                break;
            case 4:
                System.out.print("\nThank you, goodbye!");
                break;
            default: System.out.print("Invalid input, please try again!");
        }



    }
}
