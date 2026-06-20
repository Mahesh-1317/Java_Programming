package PackagesAndAM.in;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.model = "Sedan";

        // car.price = 20000; // This will cause a compile-time error because price is private

        car.fuelLevel = 10; // This is accessible because fuelLevel has default access

        System.out.println(car);

        Car car2 = new Car("Black", "BMW", 7000, 6);
        System.out.println(car2);

        Default def = new Default();
        System.out.println(def);

    }
    
}
