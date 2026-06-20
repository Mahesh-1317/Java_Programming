package Polymorphism.overriding;

class Vehicle {
    private int noOfTires;

    public int getNoOfTires() {
        return this.noOfTires;
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }
}
