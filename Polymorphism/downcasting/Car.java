package Polymorphism.downcasting;

public class Car extends Vehicle {
    public int noOfDoors() {
        return 5;
    }

    public void start(){
        System.out.println("Starting the car...");
    }
}
