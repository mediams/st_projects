package _projects2025_01.my20250118home.reflection.hometasks;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceMethod {

    // Написать метод reduce(), который на вход принимает список чисел, оператор двух аргументов и начальное значение.
    // public static Integer reduce(List<Integer> list, BinaryOperator<Integer> operator, Integer basicValue)
    // Метод накапливает результат применения оператора по всем данных, начиная с начального значения.
    // Например, вызов
    //    reduce(list, Integer::sum, 0)) должен вернуть сумму всех чисел
    //    reduce(list, (i, j) -> i * j, 1) должен вернуть произведение всех чисел


    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, -7, 1, 9, 6);

        System.out.println(reduce(list, Integer::sum, 0)); // sum of numbers

        System.out.println(reduce(list, (accumulator, data) -> accumulator * data, 1)); // multiply

        System.out.println(reduce(list, (accumulator, data) -> accumulator + data * data, 0)); // sum of squares

        System.out.println(reduce(list, Integer::max, list.iterator().next())); // max of numbers
    }


    public static Integer reduce(List<Integer> list, BinaryOperator<Integer> operator, Integer basicValue) {
        Integer result = basicValue;
        for (Integer number : list) {
            result = operator.apply(result, number);
        }
        return result;
    }

}
