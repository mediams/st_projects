package _projects2025_01.my20250601home;

public class ThreadsEx {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Test thread"));
        thread.start();
//        thread.start(); error

        Runnable task = () -> System.out.println("Runnable task");
        new Thread(task).start();
        new Thread(task).start();


        Thread thread1 = new Thread(() -> System.out.println("Test new"));
        thread1.start();

        Thread t = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Работаю...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Поток прерван во время сна!");
                    break; // Выход из цикла при прерывании
                }
            }
            System.out.println("Поток завершен.");
        });

        t.start(); // Запускаем поток

        try {
            Thread.sleep(3000); // Ждем 3 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt(); // Говорим потоку остановиться


        Thread t2 = new Thread(() -> {
            System.out.println("Поток работает...");
            System.out.println("Флаг прерывания (до): " + Thread.interrupted());
            System.out.println("Флаг прерывания (после): " + Thread.interrupted());
            System.out.println("Поток завершен.");
        });

        t2.start();

        t2.interrupt(); // Прерываем поток

        Thread t3 = new Thread(() -> {
            System.out.println("Поток начал работу...");
            try {
                Thread.sleep(2000); // Имитация работы потока
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток завершён.");
        });

        t3.start();

        System.out.println("Жду завершения потока...");
        try {
            t3.join(); // Ждём завершения потока t
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Основной поток продолжает работу.");

        System.out.println(Thread.currentThread().getName());

    }
}
