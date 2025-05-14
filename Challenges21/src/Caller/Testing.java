package Caller;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Testing {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        ExecutorService service = Executors.newFixedThreadPool(1);
        CallerKeyword callerKeyword = new CallerKeyword(scanner.nextInt());
        Future<Integer> future = service.submit(callerKeyword);
        System.out.printf("Final ans: %d %s",future.get(),Thread.currentThread().getName());
        service.shutdown();
    }
}
