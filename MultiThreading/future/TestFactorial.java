package MultiThreading.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestFactorial {
    public static void main(String[] args) throws InterruptedException, java.util.concurrent.ExecutionException {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {

            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                Factorial task = new Factorial(i);
                list.add(service.submit(task));
            }

            for (Future<Integer> future : list) {
                System.out.printf("\n Result is: %d", future.get());
            }

            service.shutdown();
            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Bahut hua!");
                service.shutdown();
            }
        }
    }
}
