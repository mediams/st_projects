package _projects2024_12.my20241205home.my20241217class;

public class ThreadEx {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println(thread);
        System.out.println(thread.getName());
        System.out.println(thread.getState());

        Runnable task = () -> {
            System.out.println("Doing task in thread " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished task in thread " + Thread.currentThread().getName());
        };

        Thread newThread1 = new Thread(task, "CustomThread-1");
        newThread1.start();

        Thread newThread2 = new Thread("CustomThread-2") {
            @Override
            public void run() {
                System.out.println("Doing task in thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished task in thread " + Thread.currentThread().getName());
            }
        };
        newThread2.start();

        Thread newThread3 = new MyThread();
        newThread3.start();
    }
}
