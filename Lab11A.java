import java.util.Scanner;

public class Lab11A {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String killCommand;
        do {
            System.out.print("Menu\n" +
                    "0) Hello World\n" +
                    "1) Goodbye Moon\n" +
                    "2) Walking on Sunshine\n" +
                    "What would you like to do: ");
            int choice = sc.nextInt();
            System.out.println();
            if (choice == 0){
                System.out.println("Hello!");
            }
            if (choice == 1){
                System.out.println("Ok, bye.");
            }
            if (choice == 2){
                System.out.println("WHOA!");
            }
            System.out.println();
            System.out.print("Type YES to rerun. ");
            killCommand = sc.next();
            System.out.println();

        }while(killCommand.equalsIgnoreCase("yes"));
        System.out.println("Program Ends ");
    }
}
