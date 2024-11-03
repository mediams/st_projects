package my20241103home;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.contains("B"));
        queue.iterator();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.size());
    }
}
