package my20241218homework;

public class MyRunnable implements Runnable {
    private int a;
    private int b;
    static int countThread = 0;

    public MyRunnable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        int number = 5;
        int count = 0;

        for (int i = a; i < b; i++) {
            if (i % number == 0)
                count++;
        }

        System.out.println("(runnable " + countThread++ + ") Total divisible by " + number + " : " + count);
    }
}
