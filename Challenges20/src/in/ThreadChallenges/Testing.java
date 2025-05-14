package in.ThreadChallenges;

public class Testing {
    public static void main(String[] args) throws InterruptedException {
        FirstThread firstThread =new FirstThread();
        SecondThread secondThread =new SecondThread();
        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();
    }
}
