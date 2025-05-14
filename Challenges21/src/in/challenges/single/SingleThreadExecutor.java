package in.challenges.single;

public class SingleThreadExecutor implements Runnable{
    @Override
    public void run() {
        for(int i = 1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d ",i);
        }
        System.out.printf("Thread name: %s",Thread.currentThread().getName());
    }
}
