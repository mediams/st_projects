package my20250108homework;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Pizza {
//    Реализовать модель кафе: один повар и много посетителей. Посетители посещают кафе со случайной периодичностью.
//    Каждого посетителя представить как отдельный поток. Повар готовит пиццу, кладет ее на прилавок (в блокирующую очередь).
//    При наличии трех готовых пицц повар отдыхает.
//            один посетитель (отдельный поток)
//    - заходит в кафе
//    - ждет пиццу на прилавке
//    - ест пиццу
//    - покидает кафе
//    повар (отдельный поток)
//    - готовит пиццу
//    - кладет ее на прилавок (в блокирующую очередь)
//    - отдыхает, если готовых пицц уже 3 шт.

    private static final BlockingQueue<String> pizzaQueue = new ArrayBlockingQueue<>(3);

    public static void main(String[] args) {
        int count = 1;

        new Thread(new Cook(), "Cook").start();
        while (true) {
            Random random = new Random();
            int r = random.nextInt(3, 6);
            new Thread(new Visitor(), "Visitor " + count++).start();

            try {
                TimeUnit.SECONDS.sleep(r);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Visitor implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " заходит в кафе");
            try {
                System.out.println(Thread.currentThread().getName() + " забирает пиццу: " + pizzaQueue.take());
                TimeUnit.SECONDS.sleep(2);
                System.out.println(Thread.currentThread().getName() + " покидает кафе");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class Cook implements Runnable {

        @Override
        public void run() {
            int pizzaCount = 1;

            while (true) {
                try {
                    System.out.println(Thread.currentThread().getName() + " готовит пиццу");
                    TimeUnit.SECONDS.sleep(3);
                    pizzaQueue.put("Pizza #" + pizzaCount++);
                    System.out.println(Thread.currentThread().getName() + " кладет пиццу на прилавок");
                    TimeUnit.MILLISECONDS.sleep(100);
                    System.out.println("Количество пицц на прилавке: " + pizzaQueue.size());
                    if (pizzaQueue.size() == 3) {
                        System.err.println("Cook отдыхает");
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}