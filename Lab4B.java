// Class: CSE 1321L
//Section: J04
//Term: Spring 2023
//Instructor: Naga
//Name: Santiago Pineda
//Lab#: 4B
import java.util.Scanner;
public class Lab4B {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);            // imports scanner and sets skeleton

    System.out.print("Enter the day: ");
    String DayOfTheWeek = sc.next();

    switch (DayOfTheWeek){
        case "Monday":
        case "monday":
        case "Wednesday":
        case "wednesday":
            System.out.println("I have class today!");
            break;
        case "Friday":
        case "friday":
            System.out.print("It’s Friday! Friday! Gotta get down on Friday!");
            break;
        default:
            System.out.print("I should use this time to do my homework.");
    }


    }
}
