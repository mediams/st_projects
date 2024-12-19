package my20241219class;

public class SyncBlocks {
    public static void main(String[] args) {
        Object mutex = new Object();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " works");

            synchronized (mutex) {
                System.out.println(Thread.currentThread().getName() + " works with common resource");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "MyThread-1").start();


        new Thread(() -> {
            {
                System.out.println(Thread.currentThread().getName() + " works");
                synchronized (mutex) {
                    System.out.println(Thread.currentThread().getName() + " works with: common resource");
                }
            }
        }, "MyThread-2").start();
    }
}

