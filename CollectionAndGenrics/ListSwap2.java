package CollectionAndGenrics;

import java.util.Arrays;
//import java.util.Collections;
import java.util.List;

class ListSwap2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,1,2,3,4,5);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }

    public static void reverse(List<Integer> list) {
        //Collections.reverse(list);
        for(int i = 0; i < list.size() / 2; i++) {
            ListSwap.swap(list, i, list.size() - 1 - i);
        }
    }
}
