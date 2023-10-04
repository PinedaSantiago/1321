import java.util.Scanner;
/* Class: CSE 1321L
Section: J04
Term: Spring 2023
Instructor: Naga
Name: Santiago Pineda
Lab#: 2C */
public class Lab2C {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.print("Enter a width: ");
        int width = sc.nextInt();
    System.out.print("Enter a height: ");
        int height= sc.nextInt();
    System.out.println("The area is "+ height * width);
    System.out.print("The perimeter is ") ;
    System.out.print(2*height+ 2*width);

    }

}
