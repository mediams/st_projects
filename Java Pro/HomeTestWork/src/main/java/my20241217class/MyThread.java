package my20241217class;

public class MyThread extends Thread{
    public void run() {
        System.out.println("Doing task in thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished task in thread " + Thread.currentThread().getName());
    }
}
