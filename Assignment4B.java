import java.util.Scanner;
public class Assignment4B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SquareSize;
        int BorderSize;
        int ColorSquare;
        int ColorBorder;

        do {
            System.out.print("Enter the size of the square: ");
            SquareSize = sc.nextInt();
            if (SquareSize < 0) {
                System.out.println("Invalid input!");
            }
        } while (SquareSize < 0);

        /// the above asks the user for the size of the square and saves it in Int, SquareSize
        // if the Square size is less than 0, it will print out the error message and restart the loop again

        do {
            System.out.print("Enter the size of the border: ");
            BorderSize = sc.nextInt();
            if (BorderSize < 0) {
                System.out.println("Invalid input!");
            }
        } while (BorderSize < 0);

        /// the above asks the user for the size of the square border and saves it in Int, BorderSize
        // if the Square border size is less than 0, it will print out the error message and restart the loop again

        do {
            System.out.print("Enter the color of the square: ");
            ColorSquare = sc.nextInt();
            if (ColorSquare < 0 || ColorSquare > 1) {
                System.out.println("Invalid input!");
            }
        } while (ColorSquare < 0 || ColorSquare > 1);

        // the above ask the user for the color of the square and stores it in the int, ColorSquare
        // if the ColorSquare is less than 0 it will print out the error message and restart the loop
        do {
            System.out.print("Enter the color of the border: ");
            ColorBorder = sc.nextInt();
            if (ColorBorder < 0 || ColorBorder > 1) {
                System.out.println("Invalid input!");
            }
        } while (ColorBorder < 0 || ColorBorder > 1);


        int NewBorder = BorderSize * 2 + SquareSize;

        for (int i = 0; i < BorderSize; i++) {
            for (int j = 1; j < NewBorder; j++) {
                System.out.print(ColorBorder);
                System.out.print(" ");
            }
            System.out.println(ColorBorder);
        }
        // the above is loop for the top border


        for (int i =0; i < SquareSize; i++) {
                for (int j=0; j < BorderSize; j++)
                {
                    System.out.print(ColorBorder);
                    System.out.print(" ");
                }

                for (int j = 0; j < SquareSize; j++) {
                    System.out.print(ColorSquare);
                    System.out.print(" ");
                }

                for (int j = 0; j < BorderSize; j++) {
                    System.out.print(ColorBorder);
                    System.out.print(" ");
                }
                System.out.println();
            }
        // the above loop for the middle part
        for (int i = 0; i < BorderSize; i++) {
            for (int j = 1; j < NewBorder; j++) {
                System.out.print(ColorBorder);
                System.out.print(" ");
            }

            System.out.println(ColorBorder);
        }
        // the above is loop for the bottom part







    }
}