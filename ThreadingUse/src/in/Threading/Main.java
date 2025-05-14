package in.Threading;

public class Main {
    public static void main(String[] args) {
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
        System.out.println("\n Starting third thread");
        thirdTask.setPriority(Thread.MAX_PRIORITY);
        thirdTask.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken : %d \n ",Thread.currentThread().getName(),(firstTime-endTime));
    }
}