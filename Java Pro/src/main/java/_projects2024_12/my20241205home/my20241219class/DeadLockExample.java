package _projects2024_12.my20241205home.my20241219class;

public class DeadLockExample {
    static Object meat = new Object();
    static Object water = new Object();

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        new Thread(dog1, "Dog 1").start();
//        new Thread(dog2, "Dog 2").start();

        Cat cat = new Cat();

        new Thread(cat, "Cat").start();

    }

    static class Dog implements Runnable {

        @Override
        public void run() {
            synchronized (meat) {
                System.out.println(Thread.currentThread().getName() + ", eats meat");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            synchronized (water) {
                System.out.println(Thread.currentThread().getName() + ", drinks water");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

    static class Cat implements Runnable {

        @Override
        public void run() {
            synchronized (water) {
                System.out.println(Thread.currentThread().getName() + ", drinks water");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            synchronized (meat) {
                System.out.println(Thread.currentThread().getName() + ", eats meat");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
