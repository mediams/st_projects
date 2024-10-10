package my20241010;

public class ArrayExample {
    public static void main(String[] args) {
        int[] ints = new int[10];
        System.out.println(ints.getClass().getName());
        System.out.println(ints.getClass().getCanonicalName());

        Integer[] integers = new Integer[10];
        System.out.println(integers.getClass().getName());
        System.out.println(integers.getClass().getCanonicalName());

        int[] ints1;
        int ints2[];
        ints1 = new int[10];
        ints1 = new int[]{1, 2, 3};
        int[] ints3 = {1, 2, 3, 4};
        
    }
}
