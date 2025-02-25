package my20250225home;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7, 4, 8, 9};
        int key = 9;
        System.out.println(binarySearch(array, key));
    }

    private static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                right = mid - 1;
            } else left = mid + 1;
        }
        return -1;
    }
}
