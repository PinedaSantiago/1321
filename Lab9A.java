import java.util.Scanner;

public class Lab9A {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int [] Number = new int[10];

        System.out.println("Please enter 10 numbers:");

        for(int i=0; i < Number.length; i++ ){
            System.out.print("Integer " + (i+1) +": ");             // this loop runs through the array and assigns a #
            Number[i]= sc.nextInt();                                // at each index
        }

        System.out.print("\nWhat is the target number: ");          // preset the boolean to be false
        int target= sc.nextInt();
        boolean yes = false;


        for (int i =0; i < Number.length; i++){                     // this array is a linear search and goes through the array
            if (Number[i]== target) {                               // a single time and compares the array to the target
                yes = true;                                         // if the array[i]= target the boolean will change
            }
        }
        if (yes){
            System.out.println("\nThe target is in the set.");      // if the boolean is true then this will print
        }
        else
            System.out.println("\nThe target is not in the set.");  // if the boolean is false then this will print



    }
}
