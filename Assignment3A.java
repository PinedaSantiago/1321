import java.util.Scanner;
public class Assignment3A {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("[Cretaceous Park GIS]");
        System.out.print("X Coordinate: ");
        float XCordinate = sc.nextFloat();
        System.out.print("Y Coordinate: ");
        float YCordinate= sc.nextFloat();


        if (XCordinate >= 0 && YCordinate >= 0 && 5 > XCordinate && YCordinate < 2 )
        {
            System.out.print("\nYou are at Triceratops Grasslands.");
        }

        else if (XCordinate >= 0 && YCordinate >=  0 && XCordinate < 2 && YCordinate <= 8 )
        {
            System.out.print("\nYou are at Triceratops Grasslands");
        }
        else if (XCordinate > 4 && XCordinate < 5 && YCordinate <=8 )
        {
            System.out.print("\nYou are at Triceratops Grasslands");
        }
        else if (YCordinate > 6 && YCordinate <= 8 && XCordinate < 6  )
        {
            System.out.print("\nYou are at Triceratops Grasslands");
        }
        else if (XCordinate < 6 && XCordinate > 4 && YCordinate > 2 && YCordinate < 5)
        {
            System.out.print("\nYou are at Triceratops Grasslands");
        }
        else if (XCordinate > 4 && YCordinate > 4 && YCordinate < 5)
        {
            System.out.print("\nYou are at Triceratops Grasslands");
        }



        else if  (XCordinate >= 2 && YCordinate >=2 && XCordinate <= 4 && YCordinate <= 6)
        {
            System.out.println("\nYou are at T. Rex Lake");
        }


        else if ( YCordinate <= 2 && XCordinate >= 5 && XCordinate<=8 )
        {
            System.out.print("\nYou are at Pterodactyl Aviary");
        }


        else if (XCordinate >= 6 && XCordinate <= 8 && YCordinate > 2 && YCordinate < 4 )
        {
            System.out.print("\nYou are at the Visitor's Center");
        }


        else if (XCordinate >= 5 && XCordinate <= 8 && YCordinate >= 5 && YCordinate <= 8)
        {
            System.out.print("\nYou are at Deinonychus Pen");
        }



        else
        {
            System.out.print("\nWARNING: You have left the boundaries of the park.\n" +
                    "Please return immediately.");
        }
        }

    }



