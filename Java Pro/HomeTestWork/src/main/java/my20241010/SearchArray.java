package my20241010;

import java.util.Arrays;

public class SearchArray {
    public static void main(String[] args) {
        int[] ints = {1, 0, 2, 4, 3};

        boolean isPresent = false;
        System.out.println(searchLinear(ints, 4));

        int[] sortedInts = {0, 1, 2, 3, 4, 5};
        System.out.println(searchLinear(sortedInts, 9));

        System.out.println(Arrays.binarySearch(sortedInts, 5));
        Arrays.sort(sortedInts);
    }

    private static boolean searchLinear(int[] ints, int i) {
        for (int j = 0; j < ints.length; j++) {
            if (i == ints[j]) {
                return true;
            }
        }

        return false;
    }


}
