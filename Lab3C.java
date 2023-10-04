/*
Class: CSE 1321L
Section: J04
Term: Spring 2023
Instructor: Naga
Name: Santiago Pineda
Lab#: 3A
*/
import java.util.Scanner;
public class Lab3C {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int Quarters , Dimes, Nickles, pennies;

        System.out.print("Enter the number of quarters: ");
        Quarters = sc.nextInt();
        System.out.print("Enter the number of dimes: ");
        Dimes = sc.nextInt();
        System.out.print("Enter the number of nickels: ");
        Nickles = sc.nextInt();
        System.out.print("Enter the number of pennies: ");
        pennies = sc.nextInt();
        // the above ask the user for coin amounts and stores them

        System.out.print("\n");
        System.out.println("You entered " + Quarters + " quarters.");
        System.out.println("You entered " + Dimes + " dimes.");
        System.out.println("You entered " + Nickles + " nickels.");
        System.out.println("You entered " + pennies + " pennies. \n");
        // the above just repeats back to the user what they input

        int cents, cent, dollars ;
        cent = (25 * Quarters) + (10 * Dimes) + (5 * Nickles) + (1 * pennies) ;
        cents = cent % 100 ;
        dollars = cent / 100  ;
    System.out.print("Your total is " + dollars + " dollars and " + cents + " cents.");


    }
}
