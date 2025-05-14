package in.Executor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class testing {
    public static void main(String[] args) throws InterruptedException {
        //ExecutorService executors = Executors.newSingleThreadExecutor();//single thread executor
        ExecutorService executors = Executors.newFixedThreadPool(3);//multiple thread executor
//        Print print =new Print('*');
//        Print print1 =new Print('#');
//        Print print2 =new Print('$');
//
//        executors.submit(print);
//        executors.submit(print1);
//        executors.submit(print2);
//        executors.shutdown();
        for(int i =0;i<10;i++){
            Print print =new Print((char)i);
            executors.submit(print);
        }
        executors.shutdown();
        System.out.println("\n************1");
        if(!executors.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("\n************2");
            executors.shutdownNow();
        }
    }
}
