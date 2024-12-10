package my20241024practise;

import java.util.Arrays;

public class TaskEx {
    int[] array = {1, 2, 3, 7, 8, 5, 4, 8, 1, 2, 4, 5};


    // n + n log n time compl
    // space compl ~ 0
    public boolean hasDuplicate(int[] array) {

        Arrays.sort(array); //O(n log(n))

        for (int i = 0; i < array.length - 1; i++) { // O(n)
            if (array[i] == array[i + 1]) {
                return true; //O(1)
            }
        }
        return false; // O(1)
    }
}
