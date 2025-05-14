package in.challenges.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Testing {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        SingleThreadExecutor singleThreadExecutor = new SingleThreadExecutor();
        service.submit(singleThreadExecutor);
        service.shutdown();
    }
}
