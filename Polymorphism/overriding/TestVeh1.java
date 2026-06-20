package Polymorphism.overriding;

class TestVeh1 {
    public static void main(String[] args) {
        Vehicle1 v = new Vehicle1();
        Car1 c = new Car1();

        v.service();
        c.service();
    }
}
