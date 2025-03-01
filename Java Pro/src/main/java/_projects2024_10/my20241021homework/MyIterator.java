package _projects2024_10.my20241021homework;

import java.util.Iterator;
import java.util.List;

public class MyIterator implements Iterator<String> {
    private final List<String> list;
    private int currentIndex = 0;

    public MyIterator(List<String> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < list.size() && list.get(currentIndex) == null) {
            currentIndex++; // Пропускать значения null
        }
        return currentIndex < list.size();
    }

    @Override
    public String next() {
        return list.get(currentIndex++);
    }
}
