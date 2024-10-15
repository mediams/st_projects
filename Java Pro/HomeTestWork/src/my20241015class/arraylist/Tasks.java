package my20241015class.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // String
        list.add("aA");
        list.add("B");
        list.add("c");
        list.add("D");
        list.add("e");

        List<String> upperCaseList = new ArrayList<>();
        for (String s : list) {
            upperCaseList.add(s.toUpperCase());
        }
        System.out.println(upperCaseList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        List<Integer> doppleValue = new ArrayList<>();
        for (Integer i : integerList) {
            Integer doubledValue = i * 2;
            doppleValue.add(doubledValue);
        }
        System.out.println(doppleValue);

        List<Integer> lengthList = new ArrayList<>();
        for (String s : list) {
            lengthList.add(s.length());
        }
        System.out.println(lengthList);
    }
}
//1. У вас есть список строковых значений,
// вы должны вернуть список со всеми этими строковыми значениями в верхнем регистре

//2. У вас есть список значений int,
// вы должны вернуть список, каждое значение которого умножается на 2

//        3. У вас есть список значений String,
//        вы должны вернуть список количества символов этих String