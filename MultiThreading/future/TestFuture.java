package MultiThreading.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        ExecutorService service = Executors.newFixedThreadPool(2);

        FetchName t1 = new FetchName("Bhupindar");
        FetchName t2 = new FetchName("manindar");
        FetchName t3 = new FetchName("Ravindar");
        FetchName t4 = new FetchName("Bhupendra");

        Future<String> name1 = service.submit(t1);
        Future<String> name2 = service.submit(t2);
        Future<String> name3 = service.submit(t3);
        Future<String> name4 = service.submit(t4);

        System.out.printf("\nFull name is: %s",name1.get());
        System.out.printf("\nFull name is: %s",name2.get());
        System.out.printf("\nFull name is: %s",name3.get());
        System.out.printf("\nFull name is: %s",name4.get());

        service.shutdown();
    }
}
