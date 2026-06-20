package CollectionAndGenrics;

import java.util.HashMap;
import java.util.Map;

class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Alia", 85);
        map.put("Rashmika", 81);
        map.put("Kiara", 75);
        map.put("Kriti", 97);

        System.out.println(map.size());
        System.out.println(map.get("Kiara"));
        System.out.println(map.containsKey("Kriti"));
        System.out.println(map.containsKey("Sara"));
        System.out.println(map.remove("Alia"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key,map.get(key));
        }
    }
}