
import java.util.Scanner;

public class Lab8B {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of rows: ");
        int rows= sc.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = sc.nextInt();
        int total= rows * columns;

        System.out.println();

        System.out.println("I have " + rows + " rows and " + columns + " columns. I need to fill-up " + total + " spaces.\n" );
        System.out.println("The " + rows + "x" + columns + " array:");
        int[][] Array = new int[rows][columns];


        int RisingNum= 1;
        for (int i=0; i< Array.length ; i++){
            for (int j=0; j< Array[i].length; j++){
            Array[i][j] = RisingNum++;
            }
        }

        for (int i=0; i< Array.length ; i++){
            for (int j=0; j< Array[i].length; j++){

                System.out.print(Array[i][j] + "|");
            }
            System.out.println();
        }
    }
}
