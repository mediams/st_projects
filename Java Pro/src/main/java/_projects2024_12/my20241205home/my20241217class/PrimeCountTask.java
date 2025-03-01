package _projects2024_12.my20241205home.my20241217class;

public class PrimeCountTask {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(computerParallel());


    }

    static class Task implements Runnable{

        @Override
        public void run() {

        }
    }

    private static int computerParallel() {
        long start =System.currentTimeMillis();

        int count = 0;
        for (int i = 2; i < 500_000; i++) {
            boolean isPrime = true;
            for (int j=2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                count++;
        }
        System.out.println("Total numbers of prime:  "+ count);

        long end = System.currentTimeMillis();
        System.out.println("Total numbers of prime: " + count);
        System.out.println("Time elapsed:" + (end - start));
        return count;
    }
}
