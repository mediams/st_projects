package my20250104home;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 9};
        int key = 9;

        int rsult = search(key, ints);
        if (rsult == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element founded on: " + rsult);
        }
    }

    private static int search(int key, int[] ints) {
        int right = ints.length - 1;
        int left = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (ints[mid] == key) {
//                return mid;
                return ints[mid];
            } else if (ints[mid] < key) {
                left = mid + 1;
            } else right = mid - 1;
        }

        return -1;
    }
}
