package my20250111home.carconveyer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConveyerEx {
    static BlockingQueue<CarBody> queueCarBody = new ArrayBlockingQueue<>(10);
    static BlockingQueue<Wheel> queueWheel = new ArrayBlockingQueue<>(40);
    static BlockingQueue<Car> queueCar = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {
        new Thread(() -> {
            int i = 1;
            while (true) {
                var carBody = new CarBody();
                try {
                    Thread.sleep(5000);
                    queueCarBody.put(carBody);
                    System.out.printf("Added a Car Body #%d to queue.\n", i++);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    var wheel = new Wheel();
                    Thread.sleep(1000);
                    queueWheel.put(wheel);
                    System.out.println("Added a Wheel to queue.");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();

        new Thread(() -> {
            int i = 1;
            Wheel[] wheels = new Wheel[4];

            while (true) {
                try {
                    CarBody carBody = queueCarBody.take();
                    Thread.sleep(6000);
                    for (int j = 0; j < 4; j++) {
                        wheels[j] = queueWheel.take();
                    }
                    var car = new Car(carBody, wheels);
                    queueCar.put(car);
                    System.err.println("A new Car #" + i++ + " created.");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        }).start();

    }

}
//Реализовать модель конвейера
//первый поток производит корпус автомобиля ----> класс CarBody
//второй поток производит колеса ----> класс Wheel
//третий поток собирает из 4 колес и одного корпуса автомобиля готовый автомобиль ----> класс Car