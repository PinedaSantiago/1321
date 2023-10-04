import java.util.Scanner;
public class Assignment2C {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);




    System.out.println("[Distance Calculator]");
    System.out.print("How many meters? ");
        float meters = sc.nextFloat();
        float distance = (float) (meters * .0000000026);
    System.out.print( "\n"  + meters + " meter(s) is... \n" );
    System.out.print("..." + distance + " distance from the Moon \n");
        int AnimalCrackerDistance = (int) (meters * 40);
    System.out.print("..." + AnimalCrackerDistance + " Animal Crackers long\n" );


    









    }
}
