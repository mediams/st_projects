package my20250203home.search;

public class LinearSearchEx {
    public static int linearSearch(int[] arr, int key) {
        if (arr==null) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchWhile(int[] arr, int key) {
        if (arr==null) {
            return -1;
        }
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == key) {
                return index;
            }
            index++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 11;

        System.out.println("Результат поиска (for): " + linearSearch(array, key));
        System.out.println("Результат поиска (while): " + linearSearchWhile(array, key));

    }

}
