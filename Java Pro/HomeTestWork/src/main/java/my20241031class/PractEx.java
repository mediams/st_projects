package my20241031class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PractEx {
    public static void main(String[] args) {
        List<Integer> list = generated();
        System.out.println(list);
        System.out.println(getMin(list));
        System.out.println(Test.isPalindrome("MatraM"));

    }

    public static List<Integer> generated() {
        int num = 22;
        Random random = new Random();
        List<Integer> list = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            list.add(random.nextInt(50));
        }
        return list;
    }

    public static int getMin(List<Integer> listInt) {
        int min = listInt.get(0);
        for (int i = 1; i < listInt.size(); i++) {
            int current = listInt.get(i);
            if (min > current) {
                min = current;
            }
        }
        return min;
    }
}
