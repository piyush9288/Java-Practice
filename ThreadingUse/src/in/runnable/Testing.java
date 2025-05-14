package in.runnable;

public class Testing {
    public static void main(String... args) {
        Print print1 = new Print('*');
        new Thread(print1).start();
        Print print2 = new Print('#');
        new Thread(print2).start();

    }
}
