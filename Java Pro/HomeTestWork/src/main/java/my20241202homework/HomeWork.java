package my20241202homework;

import java.util.List;
import java.util.function.BinaryOperator;

public class HomeWork {
    public static void main(String[] args) {
//        Переделать метод reduce() в классе ReduceMethod (см. пакет lesson20241119.hometasks) так,
//        чтобы этот метод мог производить операции над списками любого типа.
            List<Integer> list = List.of(1, 2, 3, -7, 1, 9, 6);

            System.out.println(reduce(list, Integer::sum, 0)); // sum of numbers

            System.out.println(reduce(list, (accumulator, data) -> accumulator * data, 1)); // multiply

            System.out.println(reduce(list, (accumulator, data) -> accumulator + data * data, 0)); // sum of squares

            System.out.println(reduce(list, Integer::max, list.iterator().next())); // max of numbers

//        Переделать класс MyArrayList (пакет lesson20241017.customiterator) так, чтобы этот класс мог хранить данные любого типа.

        }


        public static <T> T reduce(List <T> list, BinaryOperator<T> operator, T basicValue) {
            T result = basicValue;
            for (T number : list) {
                result = operator.apply(result, number);
            }
            return result;
        }
    }
