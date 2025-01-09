package my20250108homework;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueEx {
    static BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        var producer = new Producer();

        new Thread(producer::generate).start();
        new Thread(() -> new Consumer().take()).start();

    }

    static class Producer {
        List<String> stringList = List.of("Text_1", "Text_2", "Text_3", "Text_4", "Text_5", "exit");

        public void generate() {
            for (String s : stringList) {
                try {
                    queue.put(s);
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer {
        public void take() {
            while (true) {
                try {
                    String temp = queue.take();
                    if (temp.equals("exit")) {
                        System.out.println("EXIT.");
                        return;
                    } else {
                        System.out.println(temp);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
//2. Применить BlockingQueue:
//Класс Продьюсер - генерирует сообщения в очередь
//Класс Консьюмер - забирает сообщения из очереди
//Задача - реализовать класс Consumer, который будет анализировать сообщения в очереди и
//при входящем сообщении "exit" заканчивать работу.
//При реализации использовать одну из стандартных реализаций BlockingQueue из Java библиотеки