package my20250107class;

import java.util.LinkedList;
import java.util.Queue;

public class CustomLinkedBlockingQueue {
    private Queue<String> queue = new LinkedList<>();
    private Object queueIsNotEmpty = new Object();

    public void put(String data) {
        synchronized (queueIsNotEmpty){
            queue.add(data);
            queueIsNotEmpty.notifyAll();
        }
    }

    public String take() {
        synchronized (queueIsNotEmpty) {
            if (queue.isEmpty()) {
                try {
                    queueIsNotEmpty.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return queue.remove();
    }

}
