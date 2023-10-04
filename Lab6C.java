// Class: CSE 1321L
//Section: J04
//Term: Spring 2023
//Instructor: Naga
//Name: Santiago Pineda
//Lab#: 6C
import java.util.Scanner;
public class Lab6C {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int command;
        int AccountAmount = 1000;
        char EndCommand = 0;
        int DepAmount;
        int WidAmount;


        System.out.println("Welcome!");
        System.out.println("You have $" + AccountAmount + " in your account.\n");

        do{

            System.out.println("\nMenu");
            System.out.println("0 - Make a deposit");
            System.out.println("1 - Make a withdrawal");
            System.out.println("2 - Display account value\n");
            System.out.print("Please make a selection: ");
            command = sc.nextInt();


            if (command <= 2) {
                if (command == 0) {
                    System.out.print("How much would you like to deposit? : ");
                    DepAmount = sc.nextInt();
                    AccountAmount = AccountAmount + DepAmount;
                    System.out.println("Your current balance is $" + AccountAmount);
                }

                if (command == 1) {
                    System.out.print("How much would you like to withdraw? : ");
                    WidAmount = sc.nextInt();
                    AccountAmount = AccountAmount - WidAmount;
                    System.out.println("Your current balance is $" + AccountAmount);
                }

                if (command == 2) {
                    System.out.println("Your current balance is $" + AccountAmount);
                }
            }
            else{
                System.out.println("Invalid Entry, please try again.");
            }
            System.out.print("Would you like to return to the main menu (Y/N)? : ");
            EndCommand = sc.next().charAt(0);
        } while (EndCommand == 'Y' || EndCommand == 'y');
        System.out.println("\nThank you for banking with us!");
    }
}