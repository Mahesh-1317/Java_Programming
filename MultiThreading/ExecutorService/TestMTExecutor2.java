package MultiThreading.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestMTExecutor2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; i++){
            PrintTask task = new PrintTask((char)i);
            service.submit(task); 
        }
        service.shutdown();

        try {
            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            service.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
