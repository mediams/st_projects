package my20241017class.customiterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList implements Iterable<String> {


    private String[] data;

    public MyArrayList(String[] data) {
        this.data = data;
    }


    @Override
    public Iterator<String> iterator() {
        return new MyReverceIterator();
    }

    public Iterator<String> reverseIterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return data.length > index;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[index++];
        }
    }

    public class MyReverceIterator implements Iterator<String> {

        private int index = data.length-1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[index--];
        }
    }
}
