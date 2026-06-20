package Polymorphism.overriding;

class TestVeh {
    public static void main(String[] args) {
        Car c = new Car();
        Plane p = new Plane();
        Vehicle v = new Vehicle();

        // v.start();
        // c.start();
        // p.start();

        // Runtime polymorphism
        castTest(c);
        castTest(p);
        castTest(v);
    }

    private static void castTest(Vehicle veh) {
        veh.start();
    }
}
