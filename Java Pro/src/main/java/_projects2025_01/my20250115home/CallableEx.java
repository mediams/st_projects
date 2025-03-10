package _projects2025_01.my20250115home;

import java.util.ArrayList;
import java.util.Collection;
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

        Collection<String> stringCollection = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        var valString = new ArrayList<>();


    }
}
