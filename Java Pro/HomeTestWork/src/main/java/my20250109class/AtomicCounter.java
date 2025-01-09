package my20250109class;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicCounter {
    static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        AtomicReference<String> atomicReference = new AtomicReference<>("string value");
        String value = atomicReference.get();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                int currentValue = counter.incrementAndGet(); // ++ counter
                System.out.println(currentValue);
//                 counter.getAndIncrement();// counter++
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                
                int currentValue = counter.get();
                int old = currentValue;
                currentValue++;
                System.out.println(currentValue);
                boolean success = counter.compareAndSet(old, currentValue);
                System.out.println(success);

                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
