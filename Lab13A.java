public class Lab13A {
    public static void main(String[] args) {
        BuildingBluePrint buildingOne = new BuildingBluePrint();
        BuildingBluePrint buildingTwo = new BuildingBluePrint(30,30,75);

        System.out.println("Year 2020:");
        System.out.println("Building 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getApartments() + " apartments, " +
                "and is " + (int)buildingOne.getOccupancyRate() + "% occupied. Full? " + buildingOne.getFullCapacity());
        System.out.println("Building 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getApartments() + " apartments, " +
                "and is " + (int)buildingTwo.getOccupancyRate() + "% occupied. Full? " + buildingTwo.getFullCapacity());


        System.out.println("\nMany years pass.\n ");

        buildingOne.setOccupancyRate(0);
        buildingTwo.setOccupancyRate(100);


        System.out.println("Year 2043:");
        System.out.println("Building 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getApartments() + " apartments, " +
                "and is " + (int)buildingOne.getOccupancyRate() + "% occupied. Full? " + buildingOne.getFullCapacity());
        System.out.println("Building 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getApartments() + " apartments, " +
                "and is " + (int)buildingTwo.getOccupancyRate() + "% occupied. Full? " + buildingTwo.getFullCapacity());


        System.out.println("\nLooks like people prefer taller buildings.");


    }
}
