/*
Class: CSE 1321L
Section: J04
Term: Spring 2023
Instructor: Naga
Name: Santiago
Lab#: 3A
*/
import java.util.Scanner;
class Lab3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Owed;
        float Apr;
        float MinPayDue;
        float MonPerRate;
        System.out.print("Amount owed: $ ");
        Owed= sc.nextInt();
        System.out.print("APR: ");
        Apr= sc.nextFloat();
// the above takes in the inputs of money owed and the APR
        MinPayDue=  Owed * Apr / 1200 ;
        MonPerRate= Apr / 12;
// the above does the calculations needs to respond to the user
        System.out.printf("Monthly percentage rate: %.3f \n", MonPerRate);
        System.out.printf("Minimum payment: $%.2f", MinPayDue);
// used outside source to get decimals correctly
    }
}