import java.util.Random;

public class Assignment6B {

    public static boolean check_if_sorted(int myArray[]){
        boolean passedSort= true;
        for (int i =0; i < myArray.length; i++){
            if (myArray[i] > myArray[i+1]){
                passedSort=false;
                break;
            }
        }
        return passedSort;
    }

    public static int[] shuffleArray(int myArray[]){
        Random random = new Random();

        for (int i =0; i< myArray.length; i++){
            int guess= random.nextInt(myArray.length-i);
            int temp= myArray[guess];
            myArray[guess]= myArray[i];
            myArray[i]= temp;
        }
        return myArray;
    }

    public static void PrintArray(int myArray[]){
        for (int i =0; i< myArray.length; i++){
            System.out.print(myArray[i] + ", ");
        }
    }


    public static void main(String[]args){
        Random random = new Random();
        int myArray []= new int[17];

        for (int i =0; i < myArray.length; i++){
            myArray[i]= random.nextInt(0,360);
        }

        System.out.println("[Random Sort]");
        System.out.println();
        int counter =0;

        while(!(check_if_sorted(myArray))){

            System.out.println("Printing array...");
            PrintArray(myArray);
            myArray = shuffleArray(myArray);
            System.out.println("\nNot sorted yet!");
            System.out.println();
            System.out.println("Shuffling array...");
            System.out.println();
            counter++;
        }
        System.out.println("Hooray, it’s sorted! And it only took " + counter + " attempts!");
        PrintArray(myArray);
    }
}
