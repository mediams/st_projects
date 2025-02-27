package my20250203home.search;

public class BinarySearchEx {
    public int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
//            mid = (left + right) / 2; может вызывать переполнение в больших числах.
            int mid = left + (right - left) / 2; // избегает этой проблемы и считается более безопасным.
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchEx binarySearchEx = new BinarySearchEx();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 1;
        int result = binarySearchEx.binarySearch(array, key);

        System.out.println(result);
    }
}
