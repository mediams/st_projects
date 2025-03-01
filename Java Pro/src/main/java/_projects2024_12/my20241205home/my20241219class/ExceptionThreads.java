package _projects2024_12.my20241205home.my20241219class;

public class ExceptionThreads {
    public static void main(String[] args) {
        System.out.println("Main start");
        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
            System.err.println("Default logic for dealing with Exception: " + e.getMessage());
            System.err.println("Exception happened in " + t.getName());
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " doing task");
                System.out.println(Thread.currentThread().getName() + " doing task");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            throw new NullPointerException("Nulls!");

        });

        thread1.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.out.println(1 / 0);
        System.out.println("Main end");
    }
}
