package my20250109class;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Konto {
    static AtomicInteger account = new AtomicInteger(0);

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                int value = account.addAndGet(10);
                System.out.println(value);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();
        new Thread(() -> {
            do {
                int value = account.addAndGet(10);
                System.out.println(value);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } while (true);

        }).start();

    }

}