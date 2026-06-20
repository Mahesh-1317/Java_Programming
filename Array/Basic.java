package Array;

public class Basic {
    public static void main(String[] args) {
        int [] a = new int[5];
        a[0] = 45;
        a[3] = 54;
        a[4] = 51;
        a[1] = 47;
        a[2] = 9;

        // int index = 2;
        // int [] a = {45,47, 9, 54, 51}
        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[index]);
        // System.out.println(a[3]);
        // System.out.println(a[4]);

        int i = 0;
        //while(i < a.length)
        while(i<5) {
            System.out.println(a[i]);
            i++;
        }
    }
}
