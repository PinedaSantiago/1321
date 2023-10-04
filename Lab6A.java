// Class: CSE 1321L
//Section: J04
//Term: Spring 2023
//Instructor: Naga
//Name: Santiago Pineda
//Lab#: 6A
import java.util.Scanner;
public class Lab6A {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter 10 numbers and this program will display the largest.\n");

        int i;
        int highestNum = 0;
        for (i = 1; i <= 10; i++)
        {
            System.out.print("Please enter number " + i + ": ");
            int input = sc.nextInt();
            if(i == 1){
               highestNum = input ;
            }
            else {
                if(highestNum < input){
                    highestNum = input;
                }
            }
        }
        System.out.println("\nThe largest number was " + highestNum);

    }
}
