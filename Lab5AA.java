// Class: CSE 1321L
//Section: J04
//Term: Spring 2023
//Instructor: Naga
//Name: Santiago
//Lab#: 5A
import java.util.Scanner;
public class Lab5AA {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);                            //setup

        System.out.print("Do you have a driving permit (Y/N)? ");
        char Permit = sc.next().charAt(0);                                 // asks if they have a permit

        if (Permit =='y' || Permit=='Y')
        {
            System.out.print("Do you have a commercial driving license (Y/N)? ");
            char Commercial = sc.next().charAt(0);
            if (Commercial == 'y' || Commercial== 'Y')
                System.out.print("Congratulations! You can purchase a vehicle, let's start talking options!");

            else
            {
                System.out.print("Commercial driving license is a prerequisite to purchase a vehicle!");
            }
        }
        else
        {
            System.out.print("Driving permit is a prerequisite to purchase a vehicle! ");
        }
    }
}
