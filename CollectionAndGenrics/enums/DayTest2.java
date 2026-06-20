package CollectionAndGenrics.enums;

public class DayTest2 {
    public static void main(String[] args) {
        for (Day2 d : Day2.values()) {
            System.out.printf("%s : %s\n",d,d.getType());
        }
    }
}
