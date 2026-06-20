package CollectionAndGenrics.enums;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.GREEN;
        // color = TrafficLight.RED;

        Grade grade = Grade.C;
        System.out.println("Color: " + color);
        System.out.printf("Grade: %s\n",grade);

        Grade grade2 = Grade.valueOf("D");
        System.out.printf("Grade2: %s", grade2);

        for (Grade value : Grade.values()) {
            System.out.println(value);
        }
    }
}
