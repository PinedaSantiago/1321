import java.util.Scanner;
 class Lab11B {
     public static boolean passLength(String password){
         boolean passed = false;
         int counter = 0;
         int upperCounter=0;
        if (password.length() >= 8){
            for (int i =0; i < password.length(); i++){
                char upper = password.charAt(i);
                if (Character.isUpperCase(upper)){
                    upperCounter++;
                }
            }
            for (int i =0; i< password.length(); i++){
                int digit = password.charAt(i);
                if (Character.isDigit(digit)){
                    counter++;
                }
            }
        }
        if (counter > 0 && upperCounter > 0){
            passed =true;
        }
         return passed;
     }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = sc.next();
        if (passLength(password)){
            System.out.println("Valid password");
        }
        else {
            System.out.println("Invalid password");
        }

        System.out.println();
        System.out.println("Program Ends");

    }
}
