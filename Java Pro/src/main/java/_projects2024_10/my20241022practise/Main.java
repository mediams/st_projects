package _projects2024_10.my20241022practise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println(sum);

        List<Integer> integerList = new LinkedList<>();
        Random random = new Random();

        int num = 0;
        sum = 0;
        for (int i = 0; i <= 10; i++) {
//            num = random.nextInt(11);
            integerList.add(i);
            sum+=integerList.get(i);
        }

        System.out.println(sum);
    }
}
