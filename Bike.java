package Bike;
/**
 * class: Bike
 * author: Muketoi Celestino
 * course: ITEC 2150 - 09
 * date: September 13, 2022
 * description: This program will create a model of a Bike to be used for object creation in BikeTester class
 * Attributes: Number of Wheels, Manufacturer, Year
 */
public class Bike {
    private int wheels;
    private String manufacturer;
    private int year;

 // Constructors
    public Bike(){          // No-arg constructor
        this.wheels = 2;
        this.manufacturer = "Schwinn";
        this.year = 2014;
    }

    public Bike(int wheels, String manufacturer, int year){
        this.wheels = wheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }

 // GETTERS AND SETTERS


    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

  @Override
    public String toString(){
        return "Number of Wheels: " + wheels + "\nManufacturer: " + manufacturer + "\nYear: " + year;
  }
}
