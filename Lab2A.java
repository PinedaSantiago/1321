// Class: CSE 1321L
//Section: J04
//Term: Spring 2023
//Instructor: Naga
//Name: Santiago Pineda
//Lab#: 2A
import java.util.Scanner;
public class Lab2A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.print("Enter a name: ");
        String Name1= sc.next();
    System.out.print("Enter another name: ");
        String Name2= sc.next();
    System.out.print("Enter a verb: ");
        String Verb= sc.next();
    System.out.print ("Enter an adverb: ");
        String Adverb= sc.next();
    System.out.println ("Once upon a time, there was a person named " + Name1 + " who had a child named ");
        System.out.print(Name2 + ". This child would "+ Verb + " " +  Adverb + " while singing to strangers.");
    }
}
