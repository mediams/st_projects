package _projects2025_01.my20250109class;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class CaffeTaskWithSynchQueue {
    static BlockingQueue<String> orderQueue = new SynchronousQueue<>(true);
    static BlockingQueue<String> cookedQueue = new SynchronousQueue<>(true);

    public static void main(String[] args) {
        chefCook chefCook = new chefCook();
        Visitor visitor = new Visitor();

        new Thread(chefCook, "Cook").start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<String> listMinus = List.of("Pizza", "Spaghetti", "Sup", "Tea");
        int i = 1;

        while (true) {
            new Thread(visitor, "Visitor #" + i++).start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    static class Visitor implements Runnable {

        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName() + ", Enter cafe");

            System.out.println(Thread.currentThread().getName() + ", Makes order");
            try {
                orderQueue.put("Pizza");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ", waits for order");
            String cookedMeal = null;
            try {
                cookedMeal = cookedQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.err.println(Thread.currentThread().getName() + ", enjoys " + cookedMeal);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ", leaves cafe");
        }

    }

    static class chefCook implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println(Thread.currentThread().getName() + ", waits for visitor");
                try {
                    String order = orderQueue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(Thread.currentThread().getName() + ", cooking coffee");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ", brings coffee to visitor");
                try {
                    cookedQueue.put("Pizza");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}