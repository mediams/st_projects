package my20241114home.second;

public class Main {
    public static void main(String[] args) {
        CalculatorRunner calculatorRunner = new CalculatorRunner();

        calculatorRunner.run(new Calculator() {
            @Override
            public int calculate(int number) {
                return number * 2;
            }
        });
    }
}
//Задание 1: Передача одного аргумента и возврат результата
//Создай интерфейс Calculator с методом calculate(int number), который принимает int и возвращает int.
// Затем создай класс CalculatorRunner с методом run, который принимает объект Calculator
// и вызывает его метод calculate, передавая значение 20. Выведи результат в консоль.
//
//В main методе:
//
//Передай реализацию интерфейса с помощью анонимного класса, который возвращает number * 2.
//Цель: понять передачу значения и его обработку через интерфейс и класс.