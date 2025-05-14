package in.Future;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {
    private String name;
    public FetchName(String name){
        this.name = name;
    }
    public String call() throws InterruptedException {
        System.out.printf("\n Getting full name of %s",name);
        Thread.sleep(2000);
        return name + "Bharati";
    }
}
