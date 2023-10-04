import java.util.Scanner;
public class Assignment3B {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);


        System.out.println("[Image Encoding Checker]");
        int Width;
        int Height;
        int ByteSize;
                                                                        // creates and takes in the inputs from user
        System.out.print("What is the image width? ");
        Width = sc.nextInt();
        System.out.print("What is the image height? ");
        Height = sc.nextInt();
        System.out.print("What is the file size (in bytes)? ");
        ByteSize = sc.nextInt();

        if (Width <= 0 || Height <= 0)
        {
            System.out.println("The information is invalid - please re-enter it.");
        }

        if (ByteSize < (Width * Height * 3))
        {
            System.out.println("The information is invalid - please re-enter it.");
        }

        int BPC = ByteSize / (Width * Height *3);

        switch (BPC)
        {
            case 1:
                System.out.println("\nThe RGB image is encoded with 8 bits per channel.");
                break;

            case 2:
                System.out.println("\nThe RGB image is encoded with 16 bits per channel.");
                break;

            case 4:
                System.out.println("\nThe RGB image is encoded with 32 pits per channel.");
        }
    }
}
