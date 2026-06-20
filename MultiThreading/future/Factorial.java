package MultiThreading.future;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {
    private final int num;

    public Factorial(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        if (num <= 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
