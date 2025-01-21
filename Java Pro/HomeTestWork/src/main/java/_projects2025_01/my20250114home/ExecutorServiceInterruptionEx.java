package _projects2025_01.my20250114home;

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ExecutorServiceInterruptionEx {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        IntStream.range(0, 10).forEach(i -> {
            es.submit(() -> {
                try {
                    TimeUnit.SECONDS.sleep(i);
                    System.out.println("Task #" + i + " is completed");
                } catch (InterruptedException e) {
                    System.out.println("Task #" + i + " is interrupted");
                }
            });
        });
        System.out.println("Shutting down");
        es.shutdown();

        try {
            es.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            es.shutdownNow();
        }
    }
}
