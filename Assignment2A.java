import java.util.Scanner;
public class Assignment2A {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int FirstNumber, SecondNumber, ModNumber, AddANS, SubANS, DivANS, MulANS, ModANS1, ModANS2, ModANS3, ModANS4;
    System.out.print("First number: ") ;
        FirstNumber= sc.nextInt();
    System.out.print("Second number: ");
        SecondNumber= sc.nextInt();
    System.out.print("Number for Modulo Operation: ");
        ModNumber= sc.nextInt();
        // the above takes in the three numbers we need

        AddANS = FirstNumber + SecondNumber;
        ModANS1= AddANS % ModNumber;
    System.out.print(FirstNumber + " + " + SecondNumber + " = " +AddANS + "." );
    System.out.println(" The remainder if divided by " + ModNumber + " is " + ModANS1 + ".");
        // the above take does the math for addition operation

        SubANS = FirstNumber - SecondNumber;
        ModANS2 = SubANS % ModNumber;
        System.out.print(FirstNumber + " - " + SecondNumber + " = " +SubANS + "." );
        System.out.println(" The remainder if divided by " + ModNumber + " is " + ModANS2 + ".");
        // the above does the math for the subtraction operation

        MulANS = FirstNumber * SecondNumber;
        ModANS3= MulANS % ModNumber;
        System.out.print(FirstNumber + " * " + SecondNumber + " = " +MulANS + "." );
        System.out.println(" The remainder if divided by " + ModNumber + " is " + ModANS3 + ".");
        // the above does the math for the multiplication operation

        DivANS = FirstNumber / SecondNumber;
        ModANS4= DivANS % ModNumber;
        System.out.print(FirstNumber + " / " + SecondNumber + " = " +DivANS + "." );
        System.out.print(" (Approximately. The remainder if divided by " + ModNumber + " is " + ModANS4);
        // the above does the math for the division operation


    }
}
