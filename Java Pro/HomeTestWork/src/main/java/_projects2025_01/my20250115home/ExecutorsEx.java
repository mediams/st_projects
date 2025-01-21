package _projects2025_01.my20250115home;

import java.util.concurrent.*;

public class ExecutorsEx {
    public static void main(String[] args) {
        Callable<String> callable = () -> "Test 4";
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(() -> {
            System.out.println("Test");
        });
        es.execute(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("Test 2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        es.submit(() -> System.out.println("Test 3"));

        Future<Integer> submit = es.submit(() -> 1 + 1);
        try {
            System.out.println(submit.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        Future<String> submit1 = es.submit(callable);
        try {
            System.out.println(submit1.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
