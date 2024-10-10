package my20241010;

import java.util.Arrays;

public class ArrayTasks {
    public static void main(String[] args) {
        String[] data = new String[]{"One", "Two", "Three"};
        reverseArray(data);
        System.out.println(Arrays.toString(data));
    }

    private static void reverseArray(String[] data) {
        int j = data.length - 1;
        String temp = "";

        for (int i = 0; i < data.length / 2; i++) {
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
            j--;
        }
    }



}
//2. Создать метод transpose(), который будет транспонировать матрицу (заменять строки на столбцы).
//Input:
//	1 2 3 4
//	5 6 7 8
//	9 0 0 0
//Output:
//	1 5 9
//	2 6 0
//	3 7 0
//	4 8 0
//