package my20250109home;

import java.util.concurrent.atomic.AtomicInteger;

public class AccountPlus10 {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(0);

        Thread t1 = new Thread(() -> {
            while (count.get() < 100) {
                count.addAndGet(10);
            }
        });
        Thread t2 = new Thread(() -> {
            while (count.get() < 100) {
                count.addAndGet(10);
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(count.get());
    }
}
