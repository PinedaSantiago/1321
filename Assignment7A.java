import java.util.Scanner;


public class Assignment7A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int killCommand=0;
        String attack;

        System.out.println("[Ro-Sham-Bo Player]");
        System.out.println("Who do you want to face?");
        System.out.println("1) R. Dorothy");
        System.out.println("2) Johnny 5");
        System.out.print("Opponent: ");
        int opponent = sc.nextInt();
        System.out.println();


        RoshamboPlayer p1 = new RoshamboPlayer("R. Dorothy", 30,60);
        RoshamboPlayer p2 = new RoshamboPlayer("Johnny 5", 40, 85);


        if (opponent == 1 ){
            System.out.println("Your opponent is " + p1.getPlayerName() + "!");
        }
        if (opponent == 2 ){
            System.out.println("Your opponent is " + p2.getPlayerName() + "!");
        }


        while(killCommand != 2) {

            System.out.println("1) Play a round?\n" +
                    "2) Quit?");
            System.out.print("Choice: ");
            killCommand = sc.nextInt();
            boolean booAttack = false;

            if (opponent == 1 && killCommand == 1) {
                System.out.println();

                do {
                    System.out.print("Enter an attack: ");
                    attack = sc.next();
                    if ((attack.equals("Ro") || attack.equals("Sham") || attack.equals("Bo"))) {
                        booAttack = true;
                    }
                    else System.out.println("Invalid attack!");
                }while (!booAttack);

                    if (p1.playRound(attack)) {
                        System.out.println(p1.getPlayerName() + " chose " + p1.getAttack() + " You win!");
                    }
                    else
                        System.out.println(p1.getPlayerName() + " chose " + p1.getAttack() + " You lose...");


            }

            if (opponent == 2 && killCommand ==1) {
                System.out.println();
                do {
                    System.out.print("Enter an attack: ");
                    attack = sc.next();
                    if ((attack.equals("Ro") || attack.equals("Sham") || attack.equals("Bo"))) {
                        booAttack = true;
                    }
                    else System.out.println("Invalid attack!");
                }while (!booAttack);

                if (p1.playRound(attack)) {
                    System.out.println(p2.getPlayerName() + " chose " + p2.getAttack() + " You win!");
                } else
                    System.out.println(p2.getPlayerName() + " chose " + p2.getAttack() + " You lose...");
            }
            System.out.println();
        }
        System.out.println("Game Over");
    }
}
