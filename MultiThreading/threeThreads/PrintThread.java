package MultiThreading.threeThreads;

public class PrintThread extends Thread {
    private final int threadNumber;

    public PrintThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread Stating-%d\n",Thread.currentThread().getName(), threadNumber);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread Ended-%d\n",Thread.currentThread().getName(),threadNumber);
    }
}
