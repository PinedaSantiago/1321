import java.util.Scanner;

public class Lab7C {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Please enter a value for the size: ");
        int size = sc.nextInt();
        System.out.println("This is the requested " + size + "x" + size + " right-triangle: ");

        for(int i=0; i < size; i++)
        {
            for(int j=0;j < size; j++ )
            {
               if (j>=size-i-1)
               {
                   System.out.print("*");
               }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}
