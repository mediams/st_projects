package my20241219class;

public class AwakeningThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("Doing task");
                for (int i = 0; i < 1_000_000; i++) {

                }
                System.out.println("Sleeping");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }

            System.out.println("After existing loop");
        });
        thread.start();
        

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.interrupt();
    }
}
