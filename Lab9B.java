import java.util.Scanner;

public class Lab9B {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 11 numbers:");                // creates array of length 11
        int [] Numbers = new int[11];

        for(int i=0; i< Numbers.length; i++){
            System.out.print("Integer " + (i+1) + ": ");               //loop reads in the array values at index i
            Numbers[i]= sc.nextInt();
        }

        System.out.print("\nWhat is the target number: ");
        int target = sc.nextInt();
        boolean yes= false;                                             // reads in target, creates boolean,
        int n= Numbers.length;

        for (int i=0; i < n-1; i++){                       // the loop will run n - 1  (length of the array) # of times
            for (int j=0; j< n-i-1; j++){                  // the loop will run array length-amount of times outer loop ran, -1
                if (Numbers[j] > Numbers[j+1]){            // if the number at index j is greater than the next one
                    int temp= Numbers[j];                  // # at index j = temp variable
                    Numbers [j]= Numbers[j+1];             // then empty slot j turns into
                    Numbers[j+1]= temp;                    //
                }
            }
        }
        System.out.print("\nThe sorted set is: ");
        for (int i =0; i< Numbers.length; i++){
            System.out.print(Numbers[i] + " ");
        }

        int low, mid, high;
        low = 0;
        high= Numbers.length-1;
        mid = (high + low)/ 2;
        while(low<=high){
            if (Numbers[mid] == target){
                yes = true;
                System.out.println("\nLow is " + low);
                System.out.println("High is " + high);
                System.out.println("Mid is " + mid);
                System.out.println("Searching");
                break;
            }
            else if (target > Numbers[mid]){
                System.out.println("\nLow is " + low);
                System.out.println("High is " + high);
                System.out.println("Mid is " + mid);
                System.out.println("Searching");
                low = mid+1;
                mid= (low +high)/2;
                System.out.println();
            }
            else{
                System.out.println("\nLow is " + low);
                System.out.println("High is " + high);
                System.out.println("Mid is " + mid);
                System.out.println("Searching");
                high= mid-1;
                mid= (low +high)/2;
            }

        }

        if (yes){
            System.out.println("\nThe target is in the set.");
        }
        else
            System.out.println("\nThe target is not in the set.");


    }
}
