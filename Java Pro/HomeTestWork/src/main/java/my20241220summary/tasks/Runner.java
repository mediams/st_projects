package my20241220summary.tasks;

import lombok.Getter;

import java.util.Random;

public class Runner implements Runnable {
    Random random = new Random();
    long start;
    long end;
    long result;
    int time = random.nextInt(3000);
    String name;

    public Runner() {
    }

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        start = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + ", started");


        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ", finished");
        end = System.currentTimeMillis();
        result = end - start;

    }


    public long getStart() {
        return start;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "result=" + result +
                ", time=" + time +
                ", name='" + name + '\'' +
                '}';
    }

    public long getEnd() {
        return end;
    }

    public long getResult() {
        return result;
    }

    public int getTime() {
        return time;
    }
}
