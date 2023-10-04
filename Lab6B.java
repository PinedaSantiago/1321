// Class: CSE 1321L
//Section: J04
//Term: Spring 2023
//Instructor: Naga
//Name: Santiago Pineda
//Lab#: 6B
import java.util.Random;
import java.util.Scanner;
public class Lab6B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ob = new Random();

        System.out.print("Enter a number between 1 and 1000: ");
        int Input = sc.nextInt();
        int Random = ob.nextInt(1, 1001);
        int counter = 1;

        while (Random != Input) {

            System.out.println("My guess was " + Random);
            Random = ob.nextInt(1, 1001);
            counter++;
        }
        if (Random == Input) {
            System.out.println("My guess was " + Random + "\n");
            System.out.println("I guessed the number was "+ Random + " and it only took me " + counter + " guesses");
        }
    }
}


