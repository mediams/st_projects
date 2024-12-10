package my20241125algorytmus;

public class QuickSortEx {
    public static void main(String[] args) {
        int[] arr = {7, -2, 4, 1, 6, 5, 0, -4, 2};
        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        // Опорный элемент — последний элемент
        int pivot = arr[end];
        int pIndex = start;

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                // Меняем местами arr[i] и arr[pIndex]
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }

        // Меняем местами опорный элемент с элементом по индексу pIndex
        int temp = arr[pIndex];
        arr[pIndex] = arr[end];
        arr[end] = temp;

        return pIndex;
    }
}