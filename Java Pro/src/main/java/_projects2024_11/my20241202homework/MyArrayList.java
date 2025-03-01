package _projects2024_11.my20241202homework;

import java.util.*;

public class MyArrayList<T> implements Iterable<T> {

    private T[] data;

    public MyArrayList(T[] data) {
        this.data = data;
    }

    public void add(T element) {
        // logic for adding element
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return data.length > index;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return data[index++];
            }
        };
    }

    public Iterator<T> reverseIterator() {
        return new MyReverseIterator();
    }

    public Iterator<T> randomIterator() {
        return new MyRandomIterator();
    }


    private class MyReverseIterator implements Iterator<T> {
        private int index = data.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[index--];
        }
    }

    private class MyRandomIterator implements Iterator<T> {

        int index = 0;
        T[] copy;

        MyRandomIterator() {
            copy = Arrays.copyOf(data, data.length);
            shuffle(copy);
//            Collections.shuffle();
//            Collections.swap();
        }

        @Override
        public boolean hasNext() {
            return copy.length > index;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return copy[index++];
        }

    }


    public static <T> void shuffle(T[] data) {
        // Option 1 - n log (n) operations algorithm
        // data ---> dataPlusRandomNumbers
        // Arrays.sort(dataPlusRandomNumbers);

        // Option 2 - n operations - more fast algorithm
        Random random = new Random();
        for (int i = 1; i < data.length; i++) {
            int j = random.nextInt(i + 1);
            swap(data, i, j);
        }
    }

    public static <T> void swap(T[] data, int i, int j) {
        if (i != j) {
            T tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }
    }
}
