import java.util.Scanner;
public class Lab10A {
    public static int maxCalc(int x, int y){
        int max =0;
        if (x>y){
            max = x;

        }
        if (y>x){
            max = y;
        }

        return max;
    }

    public static int minCalc(int x, int y){
        int min=0;
        if (x>y){
            min = y;
        }
        if (y>x){
            min = x;
        }
        return min;
    }

    public static float averageCalc(int x, int y){
        float average;
        average = (x+y) / 2.0f;
        return average;
    }



    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int x = sc.nextInt();
        System.out.print("Enter number 2: ");
        int y = sc.nextInt();
        int minResult = minCalc(x,y);
        int maxResult = maxCalc(x,y);
        double averageResult = averageCalc(x,y);
        System.out.println("Min is " + minResult);
        System.out.println("Max is " + maxResult);
        System.out.println("Average is " + averageResult);

    }
}

/*
public static boolean printCalc(double averageResult){
        double minusTemp = (int) averageResult - 1;
        double addTemp= (int)averageResult + 1;
        double sameTemp = (int)averageResult ;
        boolean print = true;
        if(averageResult > minusTemp && averageResult < sameTemp ){
            print = false;
        }
        return print;}


        if (!print){
            System.out.println("Average is " + otherAverage);
        }
 */