package my20250114home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class TasksEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService es = Executors.newCachedThreadPool();
        es.submit(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        Future<Integer> stringList = es.submit(() -> 1+1);
        System.out.println(stringList.get(20, TimeUnit.SECONDS));

        List <String> list = Arrays.asList("Test");
        List<Integer> integerList = new ArrayList<>();
    }

}
