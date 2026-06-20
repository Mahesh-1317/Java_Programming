package PackagesAndAM.gettersetter;

public class Car {
    private String color;
    private String model;
    private int price;
    private int fuelLevel;


    public Car(String color, String model, int price, int fuelLevel) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.fuelLevel = fuelLevel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("Green")) {
            System.out.println("Pagal mat ban, Green color is not allowed");
        } else {
            this.color = color;
        }
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
    public int getFuelLevel() {
        return fuelLevel;
    }
}
