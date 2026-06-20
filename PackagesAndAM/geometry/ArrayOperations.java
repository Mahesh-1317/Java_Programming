package PackagesAndAM.geometry;

public class ArrayOperations {
    private int[] arr;

    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }

    public class Statistics {
        int sum() {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }

        double mean() {
            if (arr.length == 0) {
                return 0;
            }
            return (double) sum() / arr.length;
        }

        double median() {
            if (arr.length == 0) {
                return 0;
            }
            int[] sorted = arr.clone();
            java.util.Arrays.sort(sorted);
            int mid = sorted.length / 2;
            if (sorted.length % 2 == 0) {
                return (sorted[mid - 1] + sorted[mid]) / 2.0;
            } else {
                return sorted[mid];
            }
        }
    }
}
