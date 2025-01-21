package _projects2025_01.my20250109home;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEx {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(0);


        new Thread(() -> {
            for (int i = 0; i <100; i++) {
                count.incrementAndGet();
            }
        }).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(count.get());
    }
}
