package my20250114home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorsEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(() -> System.out.println("Hello from thread " + Thread.currentThread().getName()));
        es.execute(() -> System.out.println("Hello from thread " + Thread.currentThread().getName()));

        Future<Integer> future = es.submit(() -> 1 + 1);
        System.out.println(future.get(10, TimeUnit.SECONDS));


        List<Callable<String>> callableList = new ArrayList<>(Arrays.asList(
                () -> "task #1",
                () -> "task #2",
                () -> "task #3"
        ));

        List<Future<String>> futures = es.invokeAll(callableList);

        futures.stream().map(stringFuture -> {
            try {
                return stringFuture.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            return "";
        }).forEach(System.out::println);

//        es.shutdown();
    }
}
