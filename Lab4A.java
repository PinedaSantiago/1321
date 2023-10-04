// Class: CSE 1321L
////Section: J04
////Term: Spring 2023
////Instructor: Naga
////Name: Santiago Pineda
////Lab#: 4A
import java.util.Scanner;
public class Lab4A {
    public static void main(String[] args){                 // scanner and skeleton
    Scanner sc= new Scanner(System.in);

    float ExamScore;
    System.out.print("Enter the score of your exam: ");     // creates the question and takes in the input from user
    ExamScore = sc.nextFloat();

    if (ExamScore >= 97.5){                                 // lines 10-47 are taking the input of the user and once the
        System.out.print("Letter Grade is: A+");            // statement is true it will print out the proper line
    }
    else if (ExamScore >=94.5 ){
        System.out.print("Letter Grade is: A");
    }
    else if (ExamScore >=93.5 ){
        System.out.print("Letter Grade is: A-");
    }
    else if (ExamScore >=88.5){
        System.out.print("Letter Grade is: B+");
    }
    else if (ExamScore >= 85.5){
        System.out.print("Letter Grade is: B");
    }
    else if (ExamScore >= 82.5){
        System.out.print("Letter Grade is: B-");
    }
    else if (ExamScore >= 81.5){
        System.out.print("Letter Grade is: C+");
    }
    else if (ExamScore >= 76.5){
        System.out.print("Letter Grade is: C");
    }
    else if (ExamScore >= 73.5){
        System.out.print("Letter Grade is: C-");
    }
    else if (ExamScore >= 70.5){
        System.out.print("Letter Grade is: D+");
    }
    else if (ExamScore >= 67.5){
        System.out.print("Letter Grade is: D");
    }
    else if (ExamScore >= 64.5){
        System.out.print("Letter Grade is: D-");
    }
    else if (ExamScore >= 0){
        System.out.print("Letter Grade is: F");
        }

    }
}
