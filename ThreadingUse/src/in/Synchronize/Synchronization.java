package in.Synchronize;

public class Synchronization extends Thread{
    private final Counting counting;

    public Synchronization(Counting counting){
        this.counting= counting;
    }

    public void run(){
        for(int i=0;i<1000;i++){
            counting.increment();
        }
    }
}
