import java.time.Month;
import java.util.Scanner;
public class Assignment1C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.print("Enter the day (number): ");
        int Dayofthemonth= sc.nextInt();
    System.out.print("Enter the month (number): ");
        int Monthnumber= sc.nextInt();
    System.out.print("Enter the month (String): ");
        String MonthLetters= sc.next() ;
    System.out.print("Enter the year (number):");
        int Year= sc.nextInt();
// the above takes the input from the user and saves inputs
    System.out.println("Here are some ways to represent the date: ");
        System.out.println(Monthnumber + "/"+ Dayofthemonth + "/" + Year);
        System.out.println(Year + "/" + Dayofthemonth + "/" + Monthnumber );
        System.out.println(Dayofthemonth + "/" + Monthnumber + "/" + Year);
        System.out.println (MonthLetters + " " + Dayofthemonth + "," + Year);
        System.out.print (Dayofthemonth + " " + MonthLetters + " " + Year);


    }

}
