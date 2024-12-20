package my20241220summary.tasks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Runner runner1 = new Runner("Runner 1");
        Thread th1 = new Thread(runner1, "Runner 1");
        Runner runner2 = new Runner("Runner 2");
        Thread th2 = new Thread(runner2, "Runner 2");
        Runner runner3 = new Runner("Runner 3");
        Thread th3 = new Thread(runner3, "Runner 3");

        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
//            long result = runner1.getResult() > runner2.getResult() ? runner1.getResult() : runner2.getResult();
//            result = runner3.getResult() > result ? runner3.getResult() : result;
            System.out.println("runner1: " + runner1.getResult() + ", runner2: " + runner2.getResult() + ", runner3: " + runner3.getResult());
            List<Runner> longList = List.of(runner1, runner2, runner3);

            System.out.println(longList.stream()
                    .reduce((akk, r) -> {
                        if (akk.getResult() > r.getResult()) {
                            return r;
                        } else return akk;
                    })
                    .get());

//            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
