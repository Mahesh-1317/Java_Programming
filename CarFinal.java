class CarFinal {
    final int noOfWheels;
    final String model;

    public CarFinal(int noOfWheels, String model) {
        this.model = model;
        this.noOfWheels = noOfWheels;

        // this.noOfWheels = 4;  // Error: cannot assign a value to final variable
    }

}
