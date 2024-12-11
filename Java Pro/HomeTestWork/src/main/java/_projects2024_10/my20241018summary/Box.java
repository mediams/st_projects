package _projects2024_10.my20241018summary;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Box implements Iterable<String> {
    private String itemA;
    private String itemB;
    private String itemC;


    public Box(String itemA, String itemB, String itemC) {
        this.itemA = itemA;
        this.itemB = itemB;
        this.itemC = itemC;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator<String> {

        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < 3;
        }

        @Override
        public String next() {
            String string = "";
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            if (count == 0) {
                string = itemA;
            } else if (count == 1) {
                string = itemB;
            } else if (count == 2) {
                string = itemC;
            }
            count++;
            return string;
        }
    }
}


//1.Имеется класс Box
//public class Box {
//    String itemA;
//    String itemB;
//    String itemC;
//}
//Реализовать для него итератор.
