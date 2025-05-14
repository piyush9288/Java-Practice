package in.Synchronize;

public class Testing {
    public static void main(String[] args) {
        long firstTime = System.currentTimeMillis();
        Counting counting=new Counting();
        Synchronization synchronization1 = new Synchronization(counting);
        Synchronization synchronization2 = new Synchronization(counting);

        try{
            synchronization1.start();
            synchronization2.start();

            synchronization1.join();
            synchronization2.join();
            long endTime = System.currentTimeMillis();
            System.out.println("Final count is: " + counting.getCount()+(endTime-firstTime));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
