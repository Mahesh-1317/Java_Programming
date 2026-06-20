package CollectionAndGenrics;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Krishna");
        System.out.println(names.add("Mugivar"));
        names.add("Jatin");
        ListUtility.print(names);

        System.out.println(names.add("Jatin"));
        names.remove("Mugivar");
        System.out.println(names.remove("Mugivar"));
        ListUtility.print(names);

        System.out.println(names.contains("Krishna"));
        System.out.println(names.size());;
        System.out.println(names.isEmpty());
    }
}
