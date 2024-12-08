package my20241114home.second;

public class Main {
    public static void main(String[] args) {
        CalculatorRunner calculatorRunner = new CalculatorRunner();

        calculatorRunner.run(new Calculator() {
            @Override
            public int calculate(int number) {
                return number * 2;
            }
        }, new Subtractor() {
            @Override
            public int subtract(int number) {
                return number - 50;
            }
        });

    }
}
//Задание 2: Использование нескольких методов в интерфейсе
//Добавь в интерфейс Calculator второй метод subtract(int number), который принимает число
// и возвращает результат типа int.
// В классе CalculatorRunner реализуй метод run, который принимает объект Calculator
// и вызывает calculate и subtract с разными значениями (например, 20 и 10), а затем выводит оба результата.
//
//В main методе:
//
//Передай реализацию интерфейса через лямбда-выражение для обоих методов
// (например, для calculate можно использовать (number) -> number * 2,
// а для subtract — (number) -> number - 5).
//Цель: понять, как передавать реализации нескольких методов через один интерфейс и обрабатывать разные значения.