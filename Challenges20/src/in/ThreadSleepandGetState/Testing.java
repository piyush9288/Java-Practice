package in.ThreadSleepandGetState;

public class Testing {
    public static void main(String[] args) {
        Thread thread = new Thread(new LongRunningTask(),"My Thread");
        System.out.println("State after creation: " + thread.getState());
        thread.start();
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("State after creation: " + thread.getState());
        try{
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("State after creation: " + thread.getState());

    }
}
