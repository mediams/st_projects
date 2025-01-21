package my20250107class;

public class WaitNotifyExample {
    //    static volatile boolean shouldStart = false;
    static Object mutex = new Object();

    public static void main(String[] args) {

        new Thread(new Task()).start();
        new Thread(new Task()).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        shouldStart = true;
        synchronized (mutex) {
            mutex.notify();
        }
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            synchronized (mutex) {
                try {
                    System.out.println(Thread.currentThread().getName() + " waiting");
                    mutex.wait();
                    System.out.println(Thread.currentThread().getName() + " awaken");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + " left");

            while (true) {
                System.out.println(Thread.currentThread().getName() + " Doing task");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
