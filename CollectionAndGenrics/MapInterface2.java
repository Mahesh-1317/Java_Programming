package CollectionAndGenrics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MapInterface2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("India", "New Delhi");
        map.put("Russia", "Moscow");
        map.put("Italy", "Rom");
        map.put("Turky", "Ankara");
        map.put("Japan", "Tokyo");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the country name: ");
        String country = input.next();

        if (map.containsKey(country)){
            System.out.printf("Capital of %s is %s",country, map.get(country));
        } else {
            System.out.println("Sorry, we don't know the capital");
        }
        input.close();
    }

}
