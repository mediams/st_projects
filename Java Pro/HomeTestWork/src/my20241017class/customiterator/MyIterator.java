package my20241017class.customiterator;

import java.util.Iterator;

public class MyIterator implements Iterator<String> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }
}
