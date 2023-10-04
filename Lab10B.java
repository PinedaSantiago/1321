import java.util.Scanner;

public class Lab10B {
    public static boolean isValid(double width, double height){
        boolean passed = false;
        if (width + height > 30){
            passed = true;
        }
        return passed;
    }

    public static double areaCalc(double width, double height){
        double area = width * height;
        return area;
    }

    public static double perimeterCalc(double width, double height){
        double perimeter = (width + height) * 2.0;
        return perimeter;
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter width: ");
            double width = sc.nextDouble();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();
            boolean passed = isValid(width, height);
            if (!passed){
                System.out.println("This is an invalid rectangle");
                System.out.println();
            }
            if (passed) {
                System.out.println("This is a valid rectangle");
                double area = areaCalc(width, height);
                System.out.println("The area: " + area);
                double perimeter = perimeterCalc(width, height);
                System.out.println("The perimeter: " + perimeter);
                System.out.println();
            }
            System.out.print("Do you want to enter another width and height (Y/N)? : ");
            choice = sc.next();
            System.out.println();

        }while(choice.equals("Y"));
        System.out.println("Program ends");

    }
}
