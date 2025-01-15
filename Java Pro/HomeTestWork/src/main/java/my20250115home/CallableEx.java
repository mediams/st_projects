package my20250115home;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableEx {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(3);
        List<Callable<String>> callableList = List.of(
                () -> "Task 1",
                () -> "Task 2",
                () -> "Task 3"
        );
        es.invokeAll(callableList).forEach(stringFuture -> {
            try {
                System.out.println(stringFuture.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
