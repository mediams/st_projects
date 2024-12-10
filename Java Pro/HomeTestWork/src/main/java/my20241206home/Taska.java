package my20241206home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Taska {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int temp = 0;
        int length = numbers.length - 1;
        List<Integer> reverce = new ArrayList<>();
        for (int i = 0; i < length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[length - i];
            numbers[length - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
