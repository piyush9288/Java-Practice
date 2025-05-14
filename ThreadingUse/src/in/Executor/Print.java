package in.Executor;

public class Print implements Runnable{
    @Override
    public void run(){
        for(int i = 1;i < 100;i++){
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ",i,targetChar);
        }
        System.out.printf("\n %s %c is complete the task",Thread.currentThread().getName(),targetChar);
    }

    private final char targetChar;

    public Print(char targetChar){
        this.targetChar = targetChar;
    }
}
