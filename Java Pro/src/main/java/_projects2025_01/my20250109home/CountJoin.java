package _projects2025_01.my20250109home;

public class CountJoin {
    public static void main(String[] args) {
        CounterExample counterExample = new CounterExample();

        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                counterExample.increment();
            }
        };

        Thread task1 = new Thread(task);
        Thread task2 = new Thread(task);

        task1.start();
        task2.start();

        try {
            task1.join();
            task2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counterExample.getCount());

        new Thread(counterExample::increment).start();

    }
}
