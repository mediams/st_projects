package _projects2025_01.my20250108home;

import java.util.concurrent.locks.ReentrantLock;

public class Crossbow {

    private int arrows = 10;
    private final ReentrantLock lock = new ReentrantLock();

    // When the arrows end, the wait() method is called and releases.
    synchronized public void fire() {

        while (true) {
            for (int idx = arrows; idx >= 0; idx--) {

                if (idx != 0) {
                    System.out.println("Стрела " + (arrows - idx + 1) + " прямо в цель!");
                } else {
                    System.out.println("Стрелы закончились");
                    arrows = 0;
                    System.out.println("Подсчитать стрелы " + arrows);
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Несите новый колчан со стрелами!!!");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // reload() brings new arrows, calls the notify() method, which awakens the thread
    synchronized public void reload() {

            System.out.println("Новые стрелы в пути!");
            arrows = 5;
            System.out.println("Посчитать стрелы = " + arrows);
            notifyAll();

    }

    public static void main(String[] args) {

        Crossbow crossbow = new Crossbow();

        Thread robinHood = new Thread(crossbow::fire);
        Thread servant = new Thread(crossbow::reload);

        robinHood.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        servant.start();
    }
}

