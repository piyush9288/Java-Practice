package Caller;

import java.util.concurrent.Callable;

public class CallerKeyword implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for(int i = 1;i<=number;i++){
            fact*=i;
        }
        Thread.sleep(1000);
        return fact;
    }
    private int number;

    public CallerKeyword(int number) {
        this.number = number;
    }
}
