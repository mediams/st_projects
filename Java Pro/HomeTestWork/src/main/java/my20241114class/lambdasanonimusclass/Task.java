package my20241114class.lambdasanonimusclass;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Task {
    public static void main(String[] args) {
        Integer[] data1 = {1, 2, 3, 4, 5, 6};
        Integer[] data2 = {2, 2, 4, 4, 6, 6};

        Integer[] result = applyFunctionToArray(data1, data2, (int1, int2) -> (int1 * int2));
        System.out.println(Arrays.toString(result));
    }

    public static Integer[] applyFunctionToArray(Integer[] data1, Integer[] data2, BiFunction<Integer, Integer, Integer> operator) {

        Integer[] result = new Integer[data1.length];

        for (int i = 0; i < data1.length; i++) {
            result[i] = operator.apply(data1[i], data2[i]);
        }


        return result;
    }
}
