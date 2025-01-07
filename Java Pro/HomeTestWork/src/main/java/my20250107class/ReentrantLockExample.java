package my20250107class;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    static int count = 0;
    static ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                increment();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                increment();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(count);
    }

    //    private synchronized static void increment() {
//        count++;
//    }
    private synchronized static void increment() {
        lock.lock();
        count++;
        lock.unlock();
    }
}
