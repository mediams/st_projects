package _projects2024_10.my20241014algorithmus;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 3, 5};
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            if (temp < array[i]) {
                temp = array[i];
            }
        }
        System.out.println(temp);
    }
}
