import java.sql.Time;
import java.util.Scanner;
public class Assignment2B {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        float OriginalVidTime , PlayBack, variable2;
        int variable1;
        int NewVideoTime;
        float variable3;
        float variable4 ;
        int TimeSaved;
        System.out.println("[Fast-Forward]");
    System.out.print("What is the original video time? ");
    OriginalVidTime = sc.nextFloat();

    System.out.print("What is the playback speed factor? ");
    PlayBack = sc.nextFloat();
    // the above takes in the input from the user

    variable1 = (int) (OriginalVidTime);
    variable2 = OriginalVidTime % variable1;
    variable3 = variable2 * 100 ;
    variable4 = (variable3 + (variable1 * 60));
        // this turns 2.30 into 2 bc it drops the .30
        // this  2.30(OVT) - 2 (var1) = .30 (Var2)
        // .30(var2)  x 100. = 30 (var3)

    NewVideoTime = (int) (variable4 / PlayBack);
    TimeSaved = (int) (variable4 - NewVideoTime);
        System.out.println ("The new video time would be " + NewVideoTime + " second(s).");
    System.out.print("That saves you " + TimeSaved + " second(s) from the original video speed.");
    }
}
