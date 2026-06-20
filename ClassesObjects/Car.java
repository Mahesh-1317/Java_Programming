package ClassesObjects;

public class Car {
    int noOfWheeels;
    String color;
    float maxSpeed;
    float Fuel;
    int noOfSeats;

    public void drive() {
        if (Fuel == 0) {
            System.out.println("Car is out of fuel");
        } else if (Fuel < 5) {
            System.out.println("Car is in reserved mode, please refuel");
            Fuel--;
        } else {
            System.out.println("Car is driving");
            Fuel--;
        }
    }

    public void addFuel(float fuel) {
        Fuel += fuel;  
    }
}
