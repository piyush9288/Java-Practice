package in.ThreadChallenges;

public class SecondThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello from Thread "+ Thread.currentThread().getName());
        }
    }
}
