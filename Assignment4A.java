import java.util.Scanner;

public class Assignment4A {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);             // setup


        System.out.println("What loop do you want to use? ");
        System.out.println("1) A loop that might run zero or more times");      // while loop option
        System.out.println("2) A loop that will always run at least once");     // do-while loop option
        System.out.println("3) A loop with a predetermined start and end");     // for loop option
        System.out.print("Your choice: ");
        int Command = sc.nextInt();


        if (Command == 1 || Command == 2 || Command == 3) {
            if (Command == 1) {
                System.out.print("What’s your start number? ");
                int i = sc.nextInt();
                System.out.print("Counting: ");

                if (i > 0) {
                    while (i >= 0) {
                        System.out.print(i);
                        System.out.print(", ");
                        --i;
                    }
                }
            }
            if (Command == 2) {
                System.out.print("What’s your start number? ");
                int j = sc.nextInt();
                System.out.print("Counting: ");
                do {
                    System.out.print(j);
                    System.out.print(", ");
                    --j;
                } while (j >= 0);
            }

            if (Command == 3) {
                System.out.print("What’s your start number? ");
                int start = sc.nextInt();
                System.out.print("What's your end number?  ");
                int end= sc.nextInt();
                System.out.print("Counting: ");
                for (int i= start; i >= end; --i){
                    System.out.print(i + ", ");
                }
            }
        }


    }
        }

