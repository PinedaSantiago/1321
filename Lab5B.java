// Class: CSE 1321L
//Section: J04
//Term: Spring 2023
//Instructor: Naga
//Name: Santiago Pineda
//Lab#: 5B
import java.util.Scanner;
public class Lab5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int Number = sc.nextInt();
        int Answer = 0;

        if(Number % 2 == 0)
            Answer = 2;
            else if (Number % 3 == 0)
            Answer = 3;
            else if (Number % 5 ==0)
                Answer = 5;


        switch (Answer){
            case 2:
                System.out.println("This number is divisible by 2");
                break;
            case 3:
                System.out.println("This number is divisible by 3");
                break;
            case 5:
                System.out.println("This number is divisible by 5");
                break;
            default:
                System.out.println("This number is undetermined");
                break;

        }

            }
        }
