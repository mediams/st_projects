package _projects2024_12.my20241205home.my20241211home;

public class BinarySearch {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 5;

        System.out.println(searchNumberInArray(array, number));

    }

    private static int searchNumberInArray(Integer[] array, int number) {
        int left = 0;
        int right = array.length - 1;


        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (array[mid] == number) {
                return mid;
            } else if (array[mid] < number) {
                left = mid + 1;
            } else right = mid - 1;

        }
        return -1;
    }
}
