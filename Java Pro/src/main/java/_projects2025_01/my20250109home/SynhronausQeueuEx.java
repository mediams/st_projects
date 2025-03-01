package _projects2025_01.my20250109home;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class SynhronausQeueuEx {

    private static BlockingQueue<String> queue = new SynchronousQueue(true);

    public static void main(String[] args) {
        var cook = new Cook();
        var visitor = new Visitor();

        new Thread(visitor::run).start();
        new Thread(cook::run).start();
    }

    static class Cook implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Kocher macht eine Pizza");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Pizza ist fertig! Eine steht vorne, auf dem Tish.");
                    queue.put("Pizza.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Visitor implements Runnable {
        @Override
        public void run() {
            int count = 1;
            while (true) {
                try {
                    System.out.println("Visitor #" + count++ + " wartet auf die Pizza...");
                    String pizza = queue.take();
                    System.err.println("Visitor" + count + " nimmt: " + pizza);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}