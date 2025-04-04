package _projects2024_11.my20241111algorythmus;

public class MergeArrays {
    public static void main(String[] args) {
        //in-place - нужно решение без доп массива, в текущем
        int[] arr1 = {1, 2, 3, 5, 7, 8, 10}; // 1 2 3 5 7 7 7 8 8 10 10
        int[] arr2 = {5, 6, 7, 8, 12};
        // 5 5 5 5 5 6 7 7 8 8 12
        // 1 2 3 5 5 6 7 7 8 8 10 12
        int n = arr1.length;
        int m = arr2.length;
        //1. Создадим массив, в который поместим результат длинной m+n
        int[] temp = new int[n + m];
        //1,2,3,5,6,7,7,8,8,10,12
        //Time complexity 0(n+m)

        //1. Создадим массив, в который поместим результат длинной m+n
//        int[] temp = new int[n + m];
//Space complexity 0(n+m)
        int i1 = 0;
        int i2 = 0;
        int index = 0;
//проверяем, что не вышли за границы первого и второго массивов while (i1 < n && i2 < m) {
//Взяли по элементу из каждого массива
        int element1 = arr1[i1]; // arr1[0] = 1;
        int element2 = arr2[i2]; // arr2[0] = 5;
//Сравним два элемента и меньший запишем в результат

        // Индексы для последнего элемента в исходных массивах
        int i = n - 1; // последний элемент в arr1 (учитываем только значимые)
        int j = m - 1; // последний элемент в arr2
        int k = n + m - 1; // последний элемент в расширенном arr1

        // Сравниваем и перемещаем элементы в конец arr1

        while (j >= 0) {
            if (i >= 0 && arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
    }
}