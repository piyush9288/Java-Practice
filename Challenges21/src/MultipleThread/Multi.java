package MultipleThread;

public class Multi implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Name: %s\n",name);
        System.out.printf("Thread name: %s",Thread.currentThread().getName());
    }

    private String name;

    public Multi(String name) {
        this.name = name;
    }
}
