package _projects2025_01.my20250107class;

public class CaffeTask {
    static Object visitorComes = new Object();
    static Object coffeeIsReady = new Object();

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Visitor visitor = new Visitor();

        Thread waiter1 = new Thread(waiter, "Waiter");
        Thread visitor1 = new Thread(visitor, "Visitor");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waiter1.start();
        visitor1.start();
    }

    static  class Visitor implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ", Enter cafe");
            synchronized (visitorComes){
                visitorComes.notify();
            }



            System.out.println(Thread.currentThread().getName() + ", Makes order");
            System.out.println(Thread.currentThread().getName() + ", waits for coffee");
            synchronized (coffeeIsReady){
                try {
                    coffeeIsReady.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + ", drinks coffee");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            System.out.println(Thread.currentThread().getName() + ", leaves cafe");
        }
    }
    static class Waiter implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ", waits for visitor");
            synchronized (visitorComes){
                try {
                    visitorComes.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            System.out.println(Thread.currentThread().getName() + ", cooking coffee");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ", brings coffee to visitor");
            synchronized (coffeeIsReady){
                coffeeIsReady.notify();
            }

        }
    }
}
