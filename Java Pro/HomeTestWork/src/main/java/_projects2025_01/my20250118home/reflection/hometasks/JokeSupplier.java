package my20250118home.reflection.hometasks;

import java.util.Random;
import java.util.function.Supplier;

public class JokeSupplier {

    // Создать Supplier randomJoke, который выдает пользователю случайный анекдот из заготовленного исходного списка анекдотов.


    public static void main(String[] args) {
        Supplier<String> randomJoke = () -> {
            Jokes jokes = new Jokes();
            Random random = new Random();
            return jokes.getJokeList().get(random.nextInt(jokes.getJokeList().size()));
        };

        for (int i = 0; i < 5; i++) {
            System.out.println(randomJoke.get());
        }

        MyInterface myInterface = () -> System.out.println("My action");
        myInterface.method();

    }

    @FunctionalInterface
    static interface MyInterface {
        void method();
    }


}
