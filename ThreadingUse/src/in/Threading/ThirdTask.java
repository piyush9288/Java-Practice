package in.Threading;

public class ThirdTask extends Thread{
    public void run(){
        for(int i = 1;i < 1000;i++){
            System.out.printf("%d$ ",i);
        }
        System.out.printf("\n %s $ is complete the task",Thread.currentThread().getName());
    }
}
