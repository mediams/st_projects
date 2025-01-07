package my20250107home;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    private final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        LockEx lockEx = new LockEx();
        lockEx.performTask();

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
