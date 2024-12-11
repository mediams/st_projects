package _projects2024_10.my20241014homework;

public class IsSort {
    public static void main(String[] args) {
        isSort(new int[]{1, 0, 4, 5});
    }

    private static void isSort(int[] ints) {
        boolean check = true;
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] > ints[i + 1]) {
                check = false;
                break;
            }
        }
        System.out.println("check = " + check);
    }
}
