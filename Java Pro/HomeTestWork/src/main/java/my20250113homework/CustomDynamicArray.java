package my20250113homework;

import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

public class CustomDynamicArray implements Iterable<Integer> {

    private final ReentrantLock lock = new ReentrantLock();
    private Integer[] data;
    private int count;
    private int size;

    public CustomDynamicArray() {
        this.data = new Integer[1];
        this.count = 0;
        this.size = 1;
    }

    public CustomDynamicArray(int size) {
        this.data = new Integer[size];
        this.count = 0;
        this.size = size;
    }

    public void add(int element) { // O(1) amortized,  O(n) - worst case
        lock.lock();
        try {
            if (count == size) {
                growSize();
            }
            data[count++] = element;
        } finally {
            lock.unlock();
        }
    }

    public void addAt(int index, int element) { // O(n)
        lock.lock();
        try {
            if (index < 0 || index >= count) throw new RuntimeException("Index is out of bounds");
            if (count == size) {
                growSize();
            }
            for (int i = count - 1; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = element;
            count++;
        } finally {
            lock.unlock();
        }
    }

    private void growSize() {
        lock.lock();
        try {
            Integer[] newArray = new Integer[size * 2];
            for (int i = 0; i < data.length; i++) {
                newArray[i] = data[i];
            }
            data = newArray;
            size = size * 2;
        } finally {
            lock.unlock();
        }
    }

    public void shrinkSize() { // O(n)
        lock.lock();
        try {
            if (count < size) {
                Integer[] newArray = new Integer[count];
                for (int i = 0; i < count; i++) {
                    newArray[i] = data[i];
                }
                data = newArray;
                size = count;
            }
        } finally {
            lock.unlock();
        }
    }

    public void remove() { // O(1)
        lock.lock();
        try {
            data[--count] = null; // make link to object null for GC
        } finally {
            lock.unlock();
        }
    }

    public void removeAt(int index) { // O(n)
        lock.lock();
        try {
            if (index < 0 || index >= count) throw new RuntimeException("Index is out of bounds");

            for (int i = index; i < count; i++) {
                data[i] = data[i + 1];
            }
            data[--count] = null;
        } finally {
            lock.unlock();
        }
    }

    public void set(int index, int element) { // O(1)
        lock.lock();
        try {
            if (index < 0 || index >= count) throw new RuntimeException("Index is out of bounds");
            data[index] = element;
        } finally {
            lock.unlock();
        }
    }

    public int get(int index) { // O(1)
        lock.lock();
        try {
            if (index < 0 || index >= count) throw new RuntimeException("Index is out of bounds");
            return data[index];
        } finally {
            lock.unlock();
        }
    }

    public void clear() { // O(1)
        lock.lock();
        try {
            data = new Integer[0];
            size = 1;
            count = 0;
        } finally {
            lock.unlock();
        }
    }

    public int contains(int element) { // O(n)
        lock.lock();
        try {
            for (int i = 0; i < count; i++) {
                if (data[i] == element) return i;
            }
            return -1;
        } finally {
            lock.unlock();
        }
    }

    public boolean isEmpty() { // O(1)
        lock.lock();
        try {
            return count == 0;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        lock.lock();
        try {
            StringBuilder result = new StringBuilder("CustomDynamicArray[");
            for (int i = 0; i < count; i++) {
                result.append(data[i]).append(", ");
            }
            result.append("]");
            return result.toString();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public synchronized Iterator<Integer> iterator() {
        return new Iterator<>() {
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                lock.lock();
                try {
                    return currentIndex < count;
                } finally {
                    lock.unlock();
                }
            }

            @Override
            public Integer next() {
                lock.lock();
                try {
                    if (!hasNext()) throw new RuntimeException("No elements present");
                    return data[currentIndex++];
                } finally {
                    lock.unlock();
                }
            }
        };
    }
}
