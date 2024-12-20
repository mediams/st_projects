package my20241220summary.tasks;

public class Task2 {
    static int count = 0;

    public static void main(String[] args) {
        new Thread(() ->
        {
            while (true) {
                synchronized (Task2.class) {
                    if (count == 100) {
                        break;
                    }
                    count += 10;
                    System.out.println("User2 " + count);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        }).start();
        new Thread(() ->
        {
            while (true) {
                synchronized (Task2.class) {
                    if (count == 100) {
                        break;
                    }
                    count += 10;
                    System.out.println("User1 " + count);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        }).start();
    }
}


