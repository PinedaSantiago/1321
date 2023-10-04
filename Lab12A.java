
import java.util.Scanner;

public class Lab12A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n;
        boolean tf;
        String mat=" ";


        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        n = sc.nextInt();
        System.out.print("Is your chair rolling (true/false): ");
        tf = sc.nextBoolean();
        System.out.print("What is your chair made of: ");
        mat = sc.next();
        System.out.println();


        Chair Chair = new Chair(n, tf,mat);


        if (Chair.rolling){
            System.out.println("Your chair has " + Chair.numberOfLegs + " legs, is rolling, and is made" +
                    " of " + Chair.material+"." );
        }
        else             System.out.println("Your chair has " + Chair.numberOfLegs + " legs, is not rolling, and is made" +
                " of " + Chair.material+"." );


        System.out.println();
        System.out.println("This program is going to change that. ");
        System.out.println();

        Chair.numberOfLegs = 4;
        Chair.rolling = false;
        Chair.material = "wood";

        System.out.print("Your chair has " + Chair.numberOfLegs + " legs, is not rolling, and is made" +
                " of " + Chair.material+"." );
    }

}
