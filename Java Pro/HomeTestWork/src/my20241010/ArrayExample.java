package my20241010;

import java.util.Arrays;

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
        ints1 = new int[]{1, 2, 3, 4};
        int[] ints3 = {1, 2, 3, 4};

        ElectricVehicle[] electricVehicles = new ElectricVehicle[2];
//        electricVehicles[0] = new ElectricVehicle();
        System.out.println(Arrays.toString(electricVehicles));

        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i]);
        }
        System.out.println();
        for (int value : ints3) {
            System.out.print(value);
        }
        System.out.println();

        String[][] arrayOfArray = new String[4][4];
        arrayOfArray[0][0] = "A";
        arrayOfArray[0][1] = "A";
        arrayOfArray[0][2] = "A";
        arrayOfArray[0][3] = "A";

        arrayOfArray[1][0] = "B";
        arrayOfArray[1][1] = "B";
        arrayOfArray[1][2] = "B";
        arrayOfArray[1][3] = "B";

        arrayOfArray[2][0] = "C";
        arrayOfArray[2][1] = "C";
        arrayOfArray[2][2] = "C";
        arrayOfArray[2][3] = "C";

        System.out.println(Arrays.toString(arrayOfArray));
        System.out.println(Arrays.deepToString(arrayOfArray));

        for (int i = 0; i < arrayOfArray.length; i++) {
            for (int j = 0; j < arrayOfArray.length; j++) {
                System.out.print(arrayOfArray[i][j]);
            }
            System.out.println();
        }

        Integer[][] innArrayOfArray = new Integer[3][];
        innArrayOfArray[0] = new Integer[1];
        innArrayOfArray[1] = new Integer[5];
        innArrayOfArray[2] = new Integer[2];

        for (int i = 0; i < innArrayOfArray.length; i++) {
            for (int j = 0; j < innArrayOfArray[i].length; j++) {
                System.out.print(innArrayOfArray[i][j] + " ");
            }
            System.out.println();
        }

        innArrayOfArray[0][0] = 10;
        innArrayOfArray[1][3] = 10;
        innArrayOfArray[0][0] = 10;

        for (int i = 0; i < innArrayOfArray.length; i++) {
            for (int j = 0; j < innArrayOfArray[i].length; j++) {
                System.out.print(innArrayOfArray[i][j] + " ");
            }
            System.out.println();
        }

        String[] strings = new String[]{"A", "B", "C"};
        String[] copy = Arrays.copyOf(strings, 10);
        System.out.println(Arrays.toString(copy));

        String[] copy2 = Arrays.copyOfRange(strings, 1, 3);
        System.out.println(Arrays.toString(copy2));


        System.out.println(Arrays.compare(ints1, ints3));

    }
}

