package in.Synchronize;

public class Counting {
    private static int count=0;

    public synchronized void increment() {
        count++;
    }

    public int getCount(){
        return count;
    }
}
