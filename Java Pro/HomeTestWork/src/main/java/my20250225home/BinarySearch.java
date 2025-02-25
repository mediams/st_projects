package my20250225home;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7, 4, 8, 9};
        int key = 9;
        System.out.println(binarySearch(array, key));
        System.out.println(binarySearch(key, array, 0, array.length - 1));
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

    private static int binarySearch(int key, int[] array, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (array[mid] == key) {
            return mid;
        } else if (array[mid] > key) {
            return binarySearch(key, array, left, mid - 1);
//                right = mid - 1;
        } else return binarySearch(key, array, mid + 1, right);//left = mid + 1;
    }
}
