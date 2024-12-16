package my20241215home;


public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchNumber = 10;
        myBinarySearch(array, searchNumber);

    }

    private static int myBinarySearch(int[] array, int searchNumber) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            int mid = left - (right - left) / 2;

            if (array[mid] == searchNumber) {
                return mid;
            } else if (array[mid] < searchNumber) {
                left = mid + 1;
            } else right = mid - 1;
        }
        return -1;
    }
}
