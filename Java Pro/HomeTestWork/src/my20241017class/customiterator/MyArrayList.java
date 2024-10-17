package my20241017class.customiterator;

import java.util.Iterator;

public class MyArrayList implements Iterable<String> {


    private String[] data;

    public MyArrayList(String[] data) {
        this.data = data;
    }


    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }
}
