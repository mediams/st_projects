package my20241018summary;

import my20241017class.customiterator.MyIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RectangleArrayList implements Iterable<Integer> {
    private int[][] data;

    public RectangleArrayList(int[][] data) {
        this.data = data;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator<Integer> {

        private int row = 0;
        private int col = 0;

        @Override
        public boolean hasNext() {
            return (row < data.length && col < data[0].length); //---!
        }

        @Override
        public Integer next() {
            int num = 0;
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            // error

            num = data[row][col];//----!
            // ++


            return num;
        }
    }
}


