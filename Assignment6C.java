import java.util.Scanner;

public class Assignment6C {
    public static int surprise_function(int iNT1, int iNT2){
        return iNT1+iNT2;
    }

    public static float surprise_function(float flo1, float flo2){
        return flo1 / flo2;
    }

    public static double surprise_function(double dbl1,double dbl2 ){
        return dbl1 % dbl2;
    }

    public static String surprise_function(char chaR1, char chaR2){
        String chaResult = "The result is " + chaR1 + chaR2;
    return chaResult;
    }

    public static boolean surprise_function(boolean boo1, boolean boo2){
        boolean booResult= false;
        if (boo1 == true && boo2 == true){
            booResult = true;
        }
        return booResult;
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int iNT1,iNT2;
        float flo1, flo2;
        double dbl1, dbl2;
        char chaR1, chaR2;
        boolean boo1, boo2;

        System.out.println("[Overloaded Surprise Function]");
        System.out.print("What data type do you want to enter? ");
        String choice = sc.next();
        if (choice.equals("integer")){
            System.out.print("Value #1: ");
            iNT1 = sc.nextInt();
            System.out.print("Value #2: ");
            iNT2 = sc.nextInt();
            int inResult = surprise_function(iNT1, iNT2);
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is " + inResult);
        }
        if (choice.equals("float")){
            System.out.print("Value #1: ");
            flo1 = sc.nextFloat();
            System.out.print("Value #2: ");
            flo2 = sc.nextFloat();
            float floResult = surprise_function(flo1, flo2);
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is " + floResult);
        }
        if (choice.equals("double")){
            System.out.print("Value #1: ");
            dbl1 = sc.nextDouble();
            System.out.print("Value #2: ");
            dbl2 = sc.nextDouble();
            double dblResult = surprise_function(dbl1, dbl2);
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is " + dblResult);
        }
        if (choice.equals("char")){
            System.out.print("Value #1: ");
            chaR1 = sc.next().charAt(0);
            System.out.print("Value #2: ");
            chaR2 = sc.next().charAt(0);
            String chaResult = surprise_function(chaR1, chaR2);
            System.out.println("Calling surprise_function()...");
            System.out.println(chaResult);

        }
        if (choice.equals("boolean")){
            System.out.print("Value #1: ");
            boo1 = sc.nextBoolean();
            System.out.print("Value #2: ");
            boo2 = sc.nextBoolean();
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is " + surprise_function(boo1, boo2));


        }

    }
}
