
import java.util.Scanner;

public class Assignment5A {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


        int[] ID= new int[]{0,1,2,3,4,};
        String [] Name = new String[]{"Mark", "Amanda", "Norman", "Steve", "Jesse"};
        String [] Last = new String[]{"Sloan", "Bentley", "Briggs", "Sloan", "Travis"};
        int [] Age = new int[]{67, 33, 47, 35, 24};
        String [] Occupation = new String[]{"Chief of Internal Medicine", "Pathologist", "Administrator", "Hospital Security",
                "Surgeon Intern "};
        String [] ML = new String[]{"TRUE","TRUE","FALSE", "FALSE", "TRUE"};
        int choice;

        System.out.println("[Community General Hospital Directory]");

        do {
            System.out.print(
                    """
                            1) List all employees
                            2) Search employee records by ID
                            3) Search employee records by Last Name
                            4) Quit
                            Choice :\s""");
            choice = sc.nextInt();

            if (choice >= 1 && choice <=4){
            if (choice == 1) {
                System.out.println("\n#" + ID[0] + ": " + Name[0] + " " + Last[0] + ", Age " + Age[0] + ", " + Occupation[0] + ", Medical " +
                        "License: " + ML[0]);
                System.out.println("#" + ID[1] + ": " + Name[1] + " " + Last[1] + ", Age " + Age[1] + ", " + Occupation[1] + ", Medical " +
                        "License: " + ML[1]);
                System.out.println("#" + ID[2] + ": " + Name[2] + " " + Last[2] + ", Age " + Age[2] + ", " + Occupation[2] + ", Medical " +
                        "License: " + ML[2]);
                System.out.println("#" + ID[3] + ": " + Name[3] + " " + Last[3] + ", Age " + Age[3] + ", " + Occupation[3] + ", Medical " +
                        "License: " + ML[3]);
                System.out.println("#" + ID[4] + ": " + Name[4] + " " + Last[4] + ", Age " + Age[4] + ", " + Occupation[4] + ", Medical " +
                        "License: " + ML[4] + "\n");
            }

                if (choice == 2) {
                    int IDC;
                    boolean IDFound=false;
                    do {
                        System.out.print("ID: ");
                        IDC = sc.nextInt();
                        for (int i=0; i<5; i++ ){
                            if (IDC == ID[i]){
                                IDFound= true;
                                System.out.println("#" + ID[i] + ": " + Name[i] + " " + Last[i] + ", Age " + Age[i] + ", " + Occupation[i] + ", Medical " +
                                        "License: " + ML[i] + "\n");
                                break;
                                }
                            }
                        if (!IDFound){
                            System.out.println("Invalid ID!");
                        }

                    }while(!IDFound);
                }

            if (choice == 3) {
                System.out.print("Last Name: ");
                String InputName = sc.next();
                boolean foundAtLeastOne = false;
                for (int i = 0; i < 5; i++) {
                    if (InputName.equals(Last[i])) {
                        foundAtLeastOne = true;
                        System.out.println("#" + ID[i] + ": " + Name[i] + " " + Last[i] + ", Age " + Age[i] + ", " + Occupation[i] + ", Medical " +
                                "License: " + ML[i] + "");
                    }
                }
                System.out.println();
                if (!foundAtLeastOne) {
                    System.out.println("No Records Found!\n");
                }

            }
        }
            else
                System.out.println("No option " + choice + "!");
            if (choice ==4){
                System.out.print("[Closing Directory...]");
            }
        } while(choice != 4);
    }
}