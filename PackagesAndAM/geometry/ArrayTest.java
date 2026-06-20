package PackagesAndAM.geometry;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 4};
        ArrayOperations arrayOps = new ArrayOperations(numbers);

        ArrayOperations.Statistics stats = arrayOps.new Statistics();
        System.out.println("Sum: " + stats.sum());
        System.out.println("Mean: " + stats.mean());
        System.out.println("Median: " + stats.median());
    }
}
