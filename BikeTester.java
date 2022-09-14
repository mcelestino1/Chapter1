package Bike;

import java.util.ArrayList;

public class BikeTester {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        System.out.println(bike1);
        System.out.println();       // adds new empty line

        Bike bike2 = new Bike();
        bike2.setWheels(3);
        bike2.setManufacturer("Mulan");
        bike2.setYear(2022);

        System.out.println(bike2);
        System.out.println();       // adds new empty line

        ArrayList<Bike> bikeList = new ArrayList<>();
        bikeList.add(bike1);
        bikeList.add(bike2);

        System.out.println(bikeList);
        System.out.println();       // adds new empty line

        int numberOfWheels = 0;
        int oldestBikeYear = bike1.getYear();
        for (Bike b: bikeList){
            numberOfWheels += b.getWheels();
            if (b.getYear() < oldestBikeYear){
                oldestBikeYear = b.getYear();
            }
        }
        System.out.println(numberOfWheels);
        System.out.println(oldestBikeYear);
    }
}
