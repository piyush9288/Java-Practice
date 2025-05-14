import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        queue.add(3);
        System.out.println(queue.element());
        System.out.println(queue.peek());
        PrintClass.print(queue);
        System.out.println(queue.remove());
        PrintClass.print(queue);
        System.out.println(queue.poll());
        PrintClass.print(queue);

    }
}
