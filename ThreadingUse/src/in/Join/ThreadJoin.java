package in.Join;

import in.Threading.FirstTask;
import in.Threading.SecondTask;
import in.Threading.ThirdTask;

import java.time.Duration;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        long firstTime = System.currentTimeMillis();
        FirstTask firstTask = new FirstTask();
        SecondTask secondTask = new SecondTask();
        ThirdTask thirdTask = new ThirdTask();
        System.out.println("\n Starting first thread");
        firstTask.setPriority(Thread.MIN_PRIORITY);
        firstTask.start();
        System.out.println("\n Starting second thread");
        secondTask.setPriority(Thread.NORM_PRIORITY);
        secondTask.start();
        firstTask.join();//join is used to the wait down call and after firstTask complete then run
        //firstTask.join(5);
        //firstTask.join(5,6);
        System.out.println("\n Starting third thread");
        thirdTask.setPriority(Thread.MAX_PRIORITY);
        thirdTask.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken : %d \n ",Thread.currentThread().getName(),(firstTime-endTime));
    }
}