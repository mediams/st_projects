package my20241118algorythmus;

import java.util.Arrays;

class DynamicArray {
    int[] array = new int[1];
    int count = 0;

    public void add(int num) {
//        if (array == null) {
//            return;
//        }
        if (array.length <= count) {
            reSize();
        }
        array[count++] = num;
    }

    public void reSize() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    public void remove() {
        if (count > 0) {
            count--;
            array[count] = 0;
        } else {
            System.out.println("Array is empty");
        }
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                ", count=" + count +
                '}';
    }
}