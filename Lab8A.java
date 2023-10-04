import java.util.Scanner;

public class Lab8A {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter 5 integers for the first array:");
        int [] input;
        input= new int[5];
        System.out.print("Integer 1: ");
        input [0]= sc.nextInt();
        System.out.print("Integer 2: ");
        input [1]= sc.nextInt();
        System.out.print("Integer 3: ");
        input [2]= sc.nextInt();
        System.out.print("Integer 4: ");
        input [3]= sc.nextInt();
        System.out.print("Integer 5: ");
        input [4]= sc.nextInt();
        System.out.println();
        System.out.println("Please enter 5 integers for the second array:");
        int [] input2 = new int[5];
        System.out.print("Integer 1: ");
        input2 [0]= sc.nextInt();
        System.out.print("Integer 2: ");
        input2 [1]= sc.nextInt();
        System.out.print("Integer 3: ");
        input2 [2]= sc.nextInt();
        System.out.print("Integer 4: ");
        input2 [3]= sc.nextInt();
        System.out.print("Integer 5: ");
        input2 [4]= sc.nextInt();
        System.out.println();
        int array0sum = input[0]+input2[0];
        int array1sum = input[1]+input2[1];
        int array2sum = input[2]+input2[2];
        int array3sum = input[3]+input2[3];
        int array4sum = input[4]+input2[4];

        System.out.println("The resulting sums are " + array0sum + "|" + array1sum +"|" + array2sum + "|" + array3sum + "|"
                + array4sum + "|");

    }
}
