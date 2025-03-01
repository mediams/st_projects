package _projects2025_01.my20250109home;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arrayInts = {1, 2, 3, 4, 7, 8, 9, 10};
        int key = 1;

        System.out.println(search(key, arrayInts));

    }

    private static int search(int key, int[] arrayInts) {
        int left = 0;
        int right = arrayInts.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arrayInts[mid] == key) {
                return mid;
            } else if (arrayInts[mid] < key) {
                left = mid + 1;
            } else right = mid - 1;
        }

        return -1;
    }
}
