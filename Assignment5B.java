
import java.util.Scanner;

public class Assignment5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[KSU Image Manipulation Program]");
        System.out.print("Enter an image width: ");
        int width = sc.nextInt();
        System.out.print("Enter an image height: ");
        int height = sc.nextInt();
        System.out.print("Enter the fill color: ");
        int color = sc.nextInt();
        int[][] myArray = new int[height][width];
        // prints the request and reads in w,h,color, then inputs w&h into the 2D array


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                myArray[i][j] = color;
            }
        }
        // fills in myArray depending on the size of the array width and height


        int choice ;
        do {
            System.out.println();
            System.out.println("What will you do?");
            System.out.println("1) Fill in a pixel");
            System.out.println("2) Fill in a line");
            System.out.println("3) Print the image");
            System.out.println("4) Quit");
            System.out.print("Choice? ");

            choice= sc.nextInt();
            System.out.println();
            // prints out the options and reads in the user choice

            if (choice == 1) {
                int InputRow, InputColumn, InputColor;
                do {
                    System.out.print("Row: ");
                    InputRow= sc.nextInt()-1;
                    System.out.print("Column: ");
                    InputColumn = sc.nextInt()-1;
                    System.out.print("Color: ");
                    InputColor = sc.nextInt();

                    if (InputRow < height && InputColumn < width && InputColor > 0 && InputColor < 255 ){
                        myArray[InputRow][InputColumn]= InputColor;
                    }
                    else System.out.println("Invalid information!");
                }while(InputRow > width || InputColumn > height );

            }

            if (choice == 2) {
                int StartingRow, StartingColumn, StartingColor, StartingLength ;
                String direction;
                boolean passed = true;

                System.out.print("Row: ");
                StartingRow = sc.nextInt();
                System.out.print("Column: ");
                StartingColumn = sc.nextInt();
                System.out.print("New Color: ");
                StartingColor = sc.nextInt();
                System.out.print("Length: ");
                StartingLength = sc.nextInt();
                System.out.print("Direction: ");
                direction = sc.next();

                if (StartingRow >= height || StartingRow <= 0) {
                    passed = false;
                    System.out.println("Invalid information!");
                } else if (StartingColumn > width || StartingColumn <= 0) {
                    passed = false;
                    System.out.println("Invalid information!");
                } else if (StartingColor <= 0 || StartingColor >= 255) {
                    passed = false;
                    System.out.println("Invalid information!");
                } else if (!((direction.equals("up")) || (direction.equals("down")) || (direction.equals("left")) || (direction.equals("right"))))
                {
                    passed = false;
                    System.out.println("Invalid information!");
                }
                // reads and test users values
                if (direction.equals("up")&& passed){
                    for (int i =1; i < StartingLength; i++ ){
                        if (StartingRow-i >= 0){
                            myArray[StartingRow - i][StartingColumn]= StartingColor;
                        }

                    }
                }
                if (direction.equals("down") && passed) {
                    for (int i =1; i < height; i++ ){
                        if (StartingRow + i < height){
                            myArray[StartingRow + i][StartingColumn]= StartingColor;
                        }
                    }
                }
                if (direction.equals("left") && passed) {
                    for (int i = 0; i < StartingLength; i++) {
                            if (StartingColumn - i >= 0){
                                myArray[StartingRow][StartingColumn - i] = StartingColor;
                            }
                        }
                    }

                if (direction.equals("right") && passed) {
                    for(int i=0; i < StartingLength; i++ ){
                        if (StartingColumn + i < width){
                            myArray[StartingRow][StartingColumn + i] = StartingColor;
                        }
                    }
                }
            }




            if (choice == 3) {
                System.out.println("PGM Image Contents");
                System.out.println("P2");
                System.out.print(width + " ");
                System.out.println(height);
                System.out.print("255");
                for (int i = 0; i < height; i++) {
                    System.out.println();
                    for (int j = 0; j < width; j++) {
                        System.out.print(myArray[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }while (choice != 4) ;
        System.out.println("[Exiting KSU Image Manipulation Program]");
        //program end
    }
}