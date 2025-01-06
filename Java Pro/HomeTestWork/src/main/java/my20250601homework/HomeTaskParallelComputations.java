package my20250601homework;

public class HomeTaskParallelComputations {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long count = computeParallel();
        long end = System.currentTimeMillis();
        System.out.println("Total numbers: " + count);
        System.out.println("Time elapsed, parallel:" + (end - start));
    }

    private static int computeParallel() {
        int number = 100;
        Task runnable1 = new Task(Integer.MIN_VALUE, 0, number);
        Task runnable2 = new Task(0, Integer.MAX_VALUE, number);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            int result1 = runnable1.getCount();
            thread2.join();
            int result2 = runnable2.getCount();
            int count = result1 + result2;
            return count;
        } catch (InterruptedException e) {
            throw new RuntimeException("Error");
        }
    }


    private static class Task implements Runnable {
        int minNumber;
        int maxNumber;

        int number;
        int count = 0;

        public Task(int minNumber, int maxNumber, int number) {
            this.minNumber = minNumber;
            this.maxNumber = maxNumber;
            this.number = number;
        }

        public int getCount() {
            return count;
        }

        @Override
        public void run() {
            for (int i = minNumber; i < maxNumber; i++) {
                if (i % number == 0)
                    count++;
            }
        }
    }

}
