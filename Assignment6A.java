import java.util.Random;
public class Assignment6A {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] myArray = new int[1000019];
        int arrayFill = myArray.length;
        int n = myArray.length;
        int randomNum = ran.nextInt(myArray.length - 1);
        int linearSearch = 0;

        for (int i = 0; i < myArray.length; i++) {                        // this fills in myArray starting at 0 and going to length
            myArray[i] = arrayFill--;

        }


        for (int i = n; i > randomNum; i--) {                            //linear search
            if (randomNum + 1 == i) {
                linearSearch = i;
            }
        }


        int low = 0, high = myArray.length - 1, midpoint, biCounter = 0;
        while (low <= high) {
            midpoint = (low + high) / 2;
            if (myArray[midpoint] == randomNum) {
                break;
            }
            if (myArray[midpoint] < randomNum) {
                low = midpoint + 1;
            }
            if (myArray[midpoint] > randomNum) {
                high = midpoint - 1;
            }
            biCounter++;
        }


        System.out.println("[Linear Vs. Binary Search]");
        System.out.println("The target value is " + randomNum);
        System.out.println("Linear Search: " + linearSearch + " loop(s)");
        System.out.println("Binary Search: " + biCounter + " guess(es)");
        if (linearSearch < biCounter) {
            System.out.println("Linear Search is faster this time!");
        }
        if (biCounter < linearSearch) {
            System.out.println("Binary Search is faster this time!");
        }
        if (biCounter == linearSearch) {
            System.out.println("There was a tie this time!");
        }

    }
}


