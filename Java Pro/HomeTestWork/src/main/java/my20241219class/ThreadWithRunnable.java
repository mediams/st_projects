package my20241219class;

public class ThreadWithRunnable {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println(Thread.currentThread().getName() + ", Task 1");
        Runnable r2 = () -> System.out.println(Thread.currentThread().getName() + ", Task 2");

        r1.run(); // in Main thread -- task 1

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);

        thread1.run();

        thread1.start(); // In Thread-0 -- task 1
        thread2.start(); // In Thread-1 -- task 2

        Thread thread3 = new Thread(r2);
        thread3.start(); // In Thread-2 -- task 2

    }
}
