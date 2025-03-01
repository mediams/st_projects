package _projects2025_01.my20250111home;

public class BinarySerch {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 8;

        System.out.println(searchKeyInArray(array, key));

    }

    private static int searchKeyInArray(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                left = mid + 1;
            } else right = mid - 1;
        }

        return -1;
    }
}
