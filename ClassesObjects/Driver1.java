package ClassesObjects;

public class Driver1 {
    public static void main(String[] args) {
        Car1 BMW = new Car1();
        BMW.addFuel(6);
        // BMW.start();
        // BMW.drive();

        // Car1 startedCar = BMW.start();
        // startedCar.drive(); 
        
        BMW.start().drive();
    }
}
