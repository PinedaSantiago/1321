// Santiago Pineda
import java.util.Scanner;
public class Assignment1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("What're you buying? ");
        String Item1= sc.nextLine();
    System.out.print("How many? ");
        int Item1Quantity = sc.nextInt();
    System.out.print("What do they cost? ");
        double Item1SingleCost= sc.nextDouble();

    System.out.print("\nWhat else're you buying? ");
        String Item2= sc.next();
    System.out.print("How many? ");
        int Item2Quantity = sc.nextInt();
    System.out.print("What do they cost? ");
        double Item2SingleCost= sc.nextDouble();
// the above creates scanner, ask the user to input what they are buying,how many, and what they cost
// the above also stored Items 1 and 2's name, quantity, and cost
    System.out.println("\nYour list: ");
    System.out.println("----");
        System.out.print(Item1);
    System.out.print("(");
        System.out.print(Item1Quantity);
    System.out.println(")");
    System.out.print("$");
        System.out.print(Item1SingleCost);
        double Item1TotalCost= Item1SingleCost * Item1Quantity;
    System.out.printf("($%.2f", Item1TotalCost);
    System.out.println(" total) \n");
// the above gives the user back the item(quantity)
// then in the next line along side singular price(total price) for item 1
    System.out.print(Item2);
    System.out.print("(");
        System.out.print(Item2Quantity);
    System.out.println(")");
    System.out.print("$");
        System.out.print(Item2SingleCost);
        double Item2TotalCost= Item2SingleCost * Item2Quantity;
    System.out.print("($");
        System.out.print(Item2TotalCost);
    System.out.println(" total) \n");
// the above repeats the process for item 2
    System.out.print("Total Cost: $");
        System.out.println(Item1TotalCost + Item2TotalCost);
    System.out.print("----");

    }

}
