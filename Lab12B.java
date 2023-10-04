import java.util.Scanner;

public class Lab12B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog Dog1 = new Dog();

        System.out.println("You are about to create a dog");
        System.out.print("How old is the dog: ");
        int ageM = sc.nextInt();
        System.out.print("How much does the dog weigh: ");
        double weightM = sc.nextDouble();
        System.out.print("What is the dog's name: ");
        String nameM = sc.next();
        System.out.print("What color is the dog: ");
        String colorFurM= sc.next();
        System.out.print("What breed is the dog: ");
        String breedM = sc.next();
        System.out.println();


        Dog1.age = ageM;
        Dog1.weight = weightM;
        Dog1.name = nameM;
        Dog1.furColor = colorFurM;
        Dog1.breed = breedM;


        System.out.println(Dog1.name + " is a " + Dog1.age + " year old " + Dog1.furColor + " " + Dog1.breed + " that weighs " +
                Dog1.weight + " lbs.");
        System.out.println();


        System.out.println(Dog1.bark());
        System.out.print(Dog1.name +" is hungry, how much should he eat: ");
        double ate = sc.nextDouble();
        Dog1.weight= Dog1.nWeight(ate,weightM);
        System.out.print(Dog1.name + " isn't a very good name. What should they be renamed to: ");
        String nName = sc.next();
        Dog1.name = Dog1.rename(nName);
        System.out.println();


        System.out.println(Dog1.name + " is a " + Dog1.age + " year old " + Dog1.furColor + " " + Dog1.breed + " that weighs " +
                Dog1.weight + " lbs.");



    }
}
