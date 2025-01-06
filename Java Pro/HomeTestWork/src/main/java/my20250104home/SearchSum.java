package my20250104home;

import java.util.Map;

public class SearchSum {
    public static void main(String[] args) {
        int[] arrays = {7, 11, 23, 45, 3, 4, 6, 5};
        int value = 9;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - 1; j++) {
                if (arrays[j] + arrays[i] == value) {
                    System.out.println(arrays[i] + " + " +arrays[j]);
                }
            }
        }
    }
}
