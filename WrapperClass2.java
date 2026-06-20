class WrapperClass2 {
    public static void main(String[] args) {
        int num = 10;

        Integer obj = Integer.valueOf(num); // Converting primitive to object (Boxing)

        System.out.println("Wrapper object value: " + obj);

        // Converting object back to primitive (Unboxing)
        int number = obj.intValue();
        System.out.println("Primitive value: " + number);
    }
}
