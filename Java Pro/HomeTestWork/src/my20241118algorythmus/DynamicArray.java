package my20241118algorythmus;

import java.util.Arrays;

class DynamicArray {
    int[] array = new int[1];
    int count = 0;
    int size = 1;

    public void add(int num) {
        if (count == array.length) {
            reSize();
        }
        array[count++] = num;
    }

    public void reSize() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    public void remove() {
        count--;
        array[count] = 0;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                ", count=" + count +
                ", size=" + size +
                '}';
    }
}