package _projects2025_01.my20250114class;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorsEx {
    public static void main(String[] args) throws InterruptedException {
        Executor customSingleThreadExecutor = task -> {
            Thread thread = new Thread(task);
            thread.start();
        };

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " going tasks.");
        };

        Callable<String> callableTask = () -> {
            System.out.println(Thread.currentThread().getName() + " going callable task");
            return "data from callable procces by " + Thread.currentThread().getName();
        };

        customSingleThreadExecutor.execute(task);
        customSingleThreadExecutor.execute(task);
        customSingleThreadExecutor.execute(task);

        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            executorService.execute(task);
            executorService.execute(task);
            executorService.execute(task);
//        executorService.shutdown();
            Future<String> future = executorService.submit(callableTask);

            try {
                Thread.sleep(5_000);
                try {
                    String result = future.get();
                    System.out.println(result);
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Callable<String> callable = () -> {
                System.out.println(Thread.currentThread().getName() + " going callable task");
                Thread.sleep(5_000);
                return "data from callable procces by " + Thread.currentThread().getName();
            };

            int maxThreadsCPU = Runtime.getRuntime().availableProcessors();
            System.out.println(maxThreadsCPU);
            ExecutorService manyThreadsExecutor = Executors.newFixedThreadPool(maxThreadsCPU / 2);
            List<Future<String>> futures = manyThreadsExecutor.invokeAll(List.of(callable, callable, callable, callable, callable));

            futures.forEach(f -> {
                try {
                    System.out.println(f.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            });

            Thread.sleep(5_000);
            manyThreadsExecutor.submit(callable);
            manyThreadsExecutor.submit(callable);
            manyThreadsExecutor.submit(callable);

            manyThreadsExecutor.shutdown();

        }


    }
}
