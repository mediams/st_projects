package my20250107home;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        LockEx lockEx = new LockEx();
        lockEx.performTask();

        Runnable task = () -> {
            try {
                if (lock.tryLock(1, TimeUnit.SECONDS)) {

                    try {
                        System.out.println(Thread.currentThread().getName() + ", get thread");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                        System.out.println(Thread.currentThread().getName()+ "Left the thread");
                    }
                } else System.out.println(Thread.currentThread().getName() + ", can't take the thread");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(task, "Thread One");
        Thread t2 = new Thread(task, "Thread Two");

        t1.start();
        t2.start();
    }

    public void performTask() {
        lock.lock();
        try {
            System.out.println("Critical section");
        } finally {
            lock.unlock();
        }
    }


}
