package my20241219class;

public class ThreadWithFlag {
    static volatile boolean flag = true;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            long i = 0;
            while (!Thread.interrupted()) {
                i++;
                if (i % 1_000_000 == 0) {
                    System.out.println(i);

                }
            }
        });

        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
//        flag = false;
    }

}
