/*
Class: CSE 1321L
Section: J04
Term: Spring 2023
Instructor: Naga
Name: Santiago
Lab#: 3A
*/
import java.util.Scanner;
class Lab3B {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);
        float Course1Hours, Course1Grade, Course2Hours, Course2Grade;
        float Course3Hours, Course3Grade, Course4Hours, Course4Grade;
        float TotalPoints ;
        float TotalHours;

        System.out.print("Course 1 hours: ");
        Course1Hours= sc.nextFloat();
        System.out.print("Grade for course 1: ");
        Course1Grade = sc.nextFloat();

        System.out.print("Course 2 hours: ");
        Course2Hours= sc.nextFloat();
        System.out.print("Grade for course 2: ");
        Course2Grade= sc.nextFloat();

        System.out.print("Course 3 hours: ");
        Course3Hours = sc.nextFloat();
        System.out.print("Grade for course 3: ");
        Course3Grade= sc.nextFloat();

        System.out.print("Course 4 hours: ");
        Course4Hours = sc.nextFloat();
        System.out.print("Grade for course 4: ");
        Course4Grade = sc.nextFloat();
        // takes in all input and stuff
        TotalHours = Course1Hours + Course2Hours + Course3Hours +
                Course4Hours;
        System.out.print("Total hours is: " + TotalHours );
        // figures out the total hours ^^
        TotalPoints = (Course1Hours * Course1Grade) + (Course2Hours * Course2Grade) + (Course3Hours * Course3Grade) +
                (Course4Grade * Course4Hours) ;
        System.out.print("\nTotal quality points is: " + TotalPoints );
        // figures out the total
        float GPA;
        GPA = TotalPoints / TotalHours;
        System.out.print("\nYour GPA for this semester is " + GPA);



    }
}
