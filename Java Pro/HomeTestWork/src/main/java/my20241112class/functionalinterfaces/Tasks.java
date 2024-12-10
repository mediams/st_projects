package my20241112class.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Tasks {
    public static void main(String[] args) {
        Supplier<Bot> generateBot = () -> new Bot("Bot 1");
        System.out.println(generateBot.get().name);

        Consumer<Integer> printConcat = integer -> System.out.println("..." + integer + "...");
        printConcat.accept(5);


        Predicate<Employee> isAdultEmployee = employee -> employee.age > 18;
        Employee employee = new Employee("Name 1", 5);
        System.out.println(isAdultEmployee.test(employee));

        int num = 5;
        Function<Integer, Integer> getSum = integer -> {
            int sum = 0;
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
            return sum;
        };

        System.out.println(getSum.apply(5));
    }
}
//1. Создать Supplier generateBot, который выдает пользователю экземпляр класса Bot.
//        2. Создать Consumer, который принимает числа и печатает их в формате "---123---".
//        3. Создать Predicate isAdultEmployee, который проверяет, что возраст Employee больше 18.
//        4. Создать Function, которая вычисляет сумму чисел от 1 до n включительно.
