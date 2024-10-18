package my20241016homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("eis", "sort", "ein", "eis", "kaktus"));
        List<Integer> listNumbers = new ArrayList<>(Arrays.asList(6, 1, 2, 3, 4, -1));

        System.out.println(getList(list)); //вернуть список со всеми значениями String более трех символов
        System.out.println(getOddNUmbers(listNumbers)); //вернуть список, содержащий только нечетные числа
        System.out.println(getDistinct(list)); //вернуть список этих значений без каких-либо дубликатов
        System.out.println(getConcat(listNumbers)); //вернуть одну строку, которая представляет собой конкатенацию всех значений.
        System.out.println(getSum(listNumbers)); //список значений Integer, вы должны вернуть их сумму
        System.out.println(getMaximum(listNumbers));//список значений Integer, вы должны вернуть их максимум
        System.out.println(getMaxLength(list)); //список String, вы должны вернуть максимальную длину String
        System.out.println(getTwoList(list, listNumbers)); //метод для объединения двух списков в один общий ArrayList
    }

    private static List<Object> getTwoList(List<String> list, List<Integer> listNumbers) {
        List<Object> newList = new ArrayList<>();
//        newList.addAll(list);
//        newList.addAll(listNumbers);
        for (String s : list) {
            newList.add(s);
        }
        for (Integer i : listNumbers) {
            newList.add(i);
        }

        return newList;
    }

    private static int getMaxLength(List<String> list) {
        int max = Integer.MIN_VALUE;
        for (String i : list) {
            if (max < i.length()) {
                max = i.length();
            }
        }
        return max;
    }

    private static int getMaximum(List<Integer> listNumbers) {
        int max = Integer.MIN_VALUE;
        for (Integer i : listNumbers) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    private static int getSum(List<Integer> listNumbers) {
        int sum = 0;
        for (Integer i : listNumbers) {
            sum += i;
        }
        return sum;
    }

    private static String getConcat(List<Integer> list) {
        StringBuilder listConcat = new StringBuilder();
        for (Integer s : list) {
            listConcat.append(s + " ");
        }
        return listConcat.toString();
    }

    private static List<String> getDistinct(List<String> list) {
        List<String> listNew = new ArrayList<>();
        for (String s : list) {
            if (!listNew.contains(s)) {
                listNew.add(s);
            }
        }
        return listNew;
    }

    private static List<Integer> getOddNUmbers(List<Integer> listNumbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer i : listNumbers) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }
        return oddNumbers;
    }

    private static List<String> getList(List<String> list) {
        List<String> listNew = new ArrayList<>();
        for (String s : list) {
            if (s.length() > 3) {
                listNew.add(s);
            }
        }
        return listNew;
    }

}
