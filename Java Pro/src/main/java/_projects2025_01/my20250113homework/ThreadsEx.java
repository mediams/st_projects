package _projects2025_01.my20250113homework;

public class ThreadsEx {
    public static void main(String[] args) {
        var customDynamicArray = new CustomDynamicArray();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                customDynamicArray.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                customDynamicArray.add(i);
            }

        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                customDynamicArray.remove();
            }

        });


        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(customDynamicArray);
    }
}
