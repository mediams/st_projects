package _projects2024_12.my20241205home.my20241218homework;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        int number = 5;
        int count = 0;

        long start = System.currentTimeMillis();
        getCountOfDivisables(number, count);
        long end = System.currentTimeMillis();
        System.out.println("Time elapsed, sequentially:" + (end - start));

        start = System.currentTimeMillis();
        Thread threadOne = new Thread(new MyRunnable(Integer.MIN_VALUE, 0));
        Thread threadTwo = new Thread(new MyRunnable(0, Integer.MAX_VALUE));
        threadOne.start();
        System.out.println(threadOne.getName() + ", started");
        threadTwo.start();
        System.out.println(threadTwo.getName() + ", started");
        threadOne.join();
        threadTwo.join();
        end = System.currentTimeMillis();
        System.out.println("Time elapsed, parallel:" + (end - start));
    }

    private static void getCountOfDivisables(int number, int count) {
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if (i % number == 0)
                count++;
        }

        System.out.println("Total divisible by " + number + " : " + count);
    }
}
