package ClassesObjects;

public class Car1 {
    int noOfWheeels;
    String color;
    float maxSpeed;
    float Fuel;
    int noOfSeats;

    public Car1 start(){
        if (Fuel == 0) {
            System.out.println("Car is out of fuel, can not start");
        } else if (Fuel < 5) {
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("Car is stated.. vroom.....");
        }
        return this;
    }

    public void drive() {
        System.out.println("Car is driving");
        Fuel--;
    }

    public void addFuel(float fuel) {
        Fuel += fuel;  
    }
}
