package PackagesAndAM.in2;

import PackagesAndAM.gettersetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Red", "Toyota", 20000, 10);

        car.setColor("Blue");
        System.out.printf("%s %s", car.getColor(), car.getModel());
    }
}