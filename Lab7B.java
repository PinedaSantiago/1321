import java.util.Scanner;

public class Lab7B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a value for the size: ");
        int size = sc.nextInt();

        System.out.println("This is the requested " + size + "x" + size + " right-triangle:");

        for(int i = 0; i < size; i++)
        {
            for (int j=-1; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
