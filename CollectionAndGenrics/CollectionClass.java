package CollectionAndGenrics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(0);
        list.add(-6);
        ListUtility.print(list);

        Collections.sort(list);
        ListUtility.print(list);

        Collections.reverse(list);
        ListUtility.print(list);

        Collections.shuffle(list);
        ListUtility.print(list);

        System.out.println(Collections.frequency(list, 9));

        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("Min: "+ min + "\nMax: "+ max);

        int index = Collections.binarySearch(list, 4);
        System.out.println("Index of 4: " + index);

        // List<Integer> unmodifiable = Collections.unmodifiableList(list);
        // unmodifiable.add(1);
    }
}
