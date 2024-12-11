package _projects2024_10.my20241018summary;

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
            return (row < data.length && col < data[0].length); 
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int num = 0;
            num = data[row][col];
            col++;
            if (col >= data[row].length) {
                row++;
                col = 0;
            }
            return num;
        }
    }
}


