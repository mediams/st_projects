package my20241022homework.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Office {
    public static void main(String[] args) {
        Task task1 = new Task("Schreiben", "Emails schreiben");
        Task task2 = new Task("Telofonieren", "Mit dem Kunde telefoniren");
        Task task3 = new Task("Antworten", "Auf Brief antworten");

        JobActions manager = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println("Du muss: " + task.getName() + ", also: " + task.getDescription());
            }

            @Override
            public void haveRest() {
                System.out.println("Kaffee wieder trinken.");
            }
        };

        JobActions worker = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println("Ich mache: " + task.getName() + ", also: " + task.getDescription());
            }

            @Override
            public void haveRest() {
                System.out.println("Worker immer raucht.");
            }
        };

        JobActions lazyWorker = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println("LazyWorker macht gar nicht.");
            }

            @Override
            public void haveRest() {
                System.out.println("LazyWorker macht gar nicht.");

            }
        };
        manager.doTask(task1);
        manager.doTask(task2);
        manager.doTask(task3);
        manager.haveRest();

        worker.doTask(task1);
        worker.doTask(task2);
        worker.doTask(task3);
        worker.haveRest();

        lazyWorker.doTask(task1);
        lazyWorker.doTask(task2);
        lazyWorker.doTask(task3);
        lazyWorker.haveRest();
    }
}
