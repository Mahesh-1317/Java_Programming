package MultiThreading;

public class SleepTesting {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Before Sleeping");
        Thread.sleep(5000);
        System.out.println("Woke up");
    }
}
 