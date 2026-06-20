package PackagesAndAM.in;

public class Car {
    public String color;
    public String model;
    private int price;
    int fuelLevel;

    public Car() {

    }

    public Car(String color, String model, int price, int fuelLevel) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.fuelLevel = fuelLevel; 
    }

    // @Override
    // public String toString() {
    //     return "Car{" +
    //             "color='" + color + '\'' +
    //             ", model='" + model + '\'' +
    //             ", price=" + price +
    //             ", fuelLevel=" + fuelLevel +
    //             '}';
    // }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", price=").append(price);
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append('}');
        return sb.toString();
    }
}
