package Polymorphism.downcasting;

public class TestVeh {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();
        Plane p = new Plane();

        Vehicle vCar = new Car();

        castTest(vCar);
        castTest(v);
        castTest(p);
        castTest(c);


        // Car cVeh = new Vehicle(); This would cause a compile-time error
        //Car cVeh = (Car) new Vehicle();  This will compile but throw a ClassCastException at runtime
    }

    private static void castTest(Vehicle veh) {
        veh.start();
        //((Car) veh).noOfDoors();

        //veh.noOfDoors(); This will cause a compile-time error because the Vehicle class does not have the noOfDoors method

        if(veh instanceof Car) {
            Car cVeh = (Car) veh;
            cVeh.start();
            cVeh.noOfDoors();
        } else {
            System.out.println("Objecct is not a Car");
        }
    }
}
