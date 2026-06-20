package PackagesAndAM.abstrsction1;

public class Test {
    public static void main(String[] args) {

        // Vehicle vehicle = new Vehicle(2);

        Car car = new Car();
        System.out.println("Number of wheels: " + car.getNoOfWheels());
        car.start();
        
        //car.commute();  Abstract method call, will work if commute() is implemented in Car class
    }
}
