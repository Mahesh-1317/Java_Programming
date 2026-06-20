class VarArg {
    public static void main(String... args) {
        System.out.println(sum(3, 4));
        System.out.println (sum(3,7,4,5));
    }

    public static int sum(int a,int b) {
        return a + b;
    }

    public static int sum(int first,int second,int... a) {
        int sum = first + second;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
