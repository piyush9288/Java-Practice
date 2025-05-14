package MultipleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Testing {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);
        Multi task1 = new Multi("Ram");
        Multi task2 = new Multi("Sita");
        Multi task3 = new Multi("Geeta");
        Multi task4 = new Multi("Sohan");

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.submit(task4);

        service.shutdown();
        System.out.printf("**********1\n");
        if(!service.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.printf("\n*********2");
            service.shutdown();
        }
    }
}
