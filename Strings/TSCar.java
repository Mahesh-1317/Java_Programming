package Strings;

class TSCar {
    int noOfWheels;
    int maxSpeed;
    String name;

    public TSCar(int noOfWheels,int maxSpeed,String name) {
        this.noOfWheels = noOfWheels;
        this.maxSpeed = maxSpeed;
        this.name = name;
    }
    @Override
    public String toString() {
        return "My Car Name is: " + name;
    }

    public static void main(String[] args) {
        TSCar curvv = new TSCar(4, 220, "Curvv");
        System.out.println(curvv.toString());
    }
}
