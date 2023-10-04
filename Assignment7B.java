import java.util.Scanner;

public class Assignment7B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int width, height, redVal, greenVal, blueVal, choice;


        System.out.println("[Color Art Program]");
        System.out.print("Enter an image width: ");
        width = sc.nextInt();
        System.out.print("Enter an image height: ");
        height = sc.nextInt();
        System.out.print("Enter the fill color’s red value: ");
        redVal = sc.nextInt();
        System.out.print("Enter the fill color’s green value: ");
        greenVal = sc.nextInt();
        System.out.print("Enter the fill color’s blue value: ");
        blueVal = sc.nextInt();


        Pixel [][] myArray= new Pixel[height][width];    // created the array for the objects
        for(int i=0;i < myArray.length; i++)
        {
            for (int j=0;j < myArray[i].length;j++)
            {
                Pixel p =new Pixel(redVal,greenVal,blueVal);    // filled in the array with the objects
                myArray[i][j]=p;
            }
        }

        do {
            System.out.println();
            System.out.println("What will you do?");
            System.out.println("""
                    1) Fill in a pixel
                    2) Fill in a line
                    3) Print the image
                    4) Quit""");
            System.out.print("Choice? ");
            choice = sc.nextInt();

            if (choice == 1){
                System.out.println();
                System.out.print("Row: ");
                int changeRow =  sc.nextInt();
                System.out.print("Column: ");
                int changeColumn = sc.nextInt();
                System.out.print("New Red Color: ");
                int cRed = sc.nextInt();
                System.out.print("New Green Color: ");
                int cGreen = sc.nextInt();
                System.out.print("New Blue Color: ");                               // takes in the input to change a single object RGB
                int cBlue = sc.nextInt();

                myArray[changeRow][changeColumn].changeRGB(cRed,cGreen,cBlue);
            }

            if (choice ==2) {
                System.out.println();
                System.out.print("Row: ");
                int crStart = sc.nextInt();
                System.out.print("Column: ");
                int ccStart = sc.nextInt();
                System.out.print("New Red Color: ");
                int lfRed = sc.nextInt();
                System.out.print("New Green Color: ");
                int lfGreen = sc.nextInt();
                System.out.print("New Blue Color: ");
                int lfBlue = sc.nextInt();
                System.out.print("Direction: ");
                String direction = sc.next();
                System.out.print("Length: ");
                int Length = sc.nextInt();

                if (direction.equals("right")) {
                    for (int i = 0; i < Length; i++) {
                        myArray[crStart][ccStart].changeRGB(lfRed,lfGreen,lfBlue);
                        ccStart++;
                    }
                }
                if (direction.equals("left")){
                    for (int i = 0; i < Length; i++) {
                        myArray[crStart][ccStart].changeRGB(lfRed,lfGreen,lfBlue);
                        ccStart--;
                    }
                }
                if (direction.equals("up")){
                    for (int i = 0; i < Length; i++) {
                        myArray[crStart][ccStart].changeRGB(lfRed,lfGreen,lfBlue);
                        crStart--;
                    }
                }
                if (direction.equals("down")){
                    for (int i = 0; i < Length; i++) {
                        myArray[crStart][ccStart].changeRGB(lfRed,lfGreen,lfBlue);
                        crStart++;
                    }
                }
            }


            if (choice == 3 ){
                System.out.println();
                System.out.println("PPM Image Contents\n" +
                        "P3");
                System.out.println(width + " " + height);
                System.out.print("255");
                for (int i =0 ; i < myArray.length; i++){
                    System.out.println();
                    for (int j =0; j < myArray[i].length; j++){
                        myArray[i][j].PrintRGB();
                    }
                }
                System.out.println();
            }
        }while(choice != 4);
    }
}
