
import java.util.Scanner;
public class Assignment3C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[Cretaceous Park Dialog]");
        System.out.println("Oh no, the power has gone out at Cretaceous Park!");
        System.out.println("1) What does that mean?");
        System.out.println("2) No, I just turned the light off.");
        String Option1 = sc.nextLine();
        String Option2;

        if (Option1.equals("What does that mean?")) {
            System.out.println("\nThe dinosaurs will get loose... again...");
            System.out.println("1) Life finds a way...");
            System.out.println("2) What do we do?");
            Option2 = sc.nextLine();


            if (Option2.equals("What do we do?")) {
                System.out.println("\nWe have to evacuate the park! ");
            } else {
                System.out.println("\nThat's not helpful right now! ");
                System.out.println("We have to evacuate the park!");
            }
        } else {
            System.out.println("\nOh thank goodness!");
        }
    }
}
