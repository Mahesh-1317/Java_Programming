package PackagesAndAM.abstrsction1;

public abstract class Vehicle {
    private int noOfWheels;

    public Vehicle(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }
    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    //public abstract void commute();  Abstract method for commuting, to be implemented by subclasses
}
