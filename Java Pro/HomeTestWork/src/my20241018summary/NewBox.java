package my20241018summary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NewBox implements Iterable<Integer> {
    private ArrayList<Integer> list;

    public NewBox() {
        list = new ArrayList<>();
    }

    public void addRectangleArea(int area) {
        list.add(area);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int currentIndex = 0;
            private int currentElem = 0;//

            @Override
            public boolean hasNext() {
                return currentIndex < list.size();
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                currentElem = list.get(currentIndex);//
                currentIndex++;//
                return currentElem;
//                return list.get(currentIndex++);
            }
        };
    }
}
