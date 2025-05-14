package in.ThreadSleepandGetState;

public class LongRunningTask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Task started!");
        try {
            Thread.sleep(2000); //2sec
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + ": Task completed.");
    }
}
