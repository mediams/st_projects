package _projects2025_01.my20250114home;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Отправляем задачу на выполнение
        Future<Integer> future = executorService.submit(() -> {
            // Имитируем сложную задачу
            Thread.sleep(3000); // 3 секунды
            return 42;
        });

        System.out.println("Задача запущена. Жду результата...");

        try {
            // Ожидаем результат задачи максимум 5 секунд
            Integer result = future.get(5, TimeUnit.SECONDS);
            System.out.println("Результат: " + result);
        } catch (TimeoutException e) {
            System.out.println("Задача не завершилась за указанный тайм-аут.");
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Произошла ошибка при выполнении задачи: " + e.getMessage());
        } finally {
            executorService.shutdown();
        }
    }
}