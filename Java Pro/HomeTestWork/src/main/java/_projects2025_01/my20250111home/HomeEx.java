package my20250111home;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class HomeEx {
    public static void main(String[] args) {

//        randoms();
        while (true) {
            Runnable runRandoms = HomeEx::randoms;
            runRandoms.run();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void randoms() {
        var t  = (int) (Math.random() * 100);

        System.out.println(t);

        var random = new Random().nextInt(100);
        System.out.println(random + "\n");
    }
}
