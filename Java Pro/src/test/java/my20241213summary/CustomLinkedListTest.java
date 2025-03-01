package my20241213summary;

import _projects2024_12.my20241205home.my20241213summary.CustomLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomLinkedListTest {

    private CustomLinkedList customLinkedList;

    @BeforeEach
    public void createList() {
        customLinkedList = new CustomLinkedList();
    }

    @Test
    void size() {
        assertEquals(0, customLinkedList.size());
        customLinkedList.pushToHead("1");
        assertEquals(1, customLinkedList.size());
        customLinkedList.pushToHead("2");
        assertEquals(2, customLinkedList.size());

    }

    @Test
    void pushToHead() {
        assertEquals(0, customLinkedList.size());
        customLinkedList.pushToHead("1");
        assertEquals(1, customLinkedList.size());
        assertEquals(customLinkedList.get(0), "1");
        customLinkedList.pushToHead("2");
        assertEquals(customLinkedList.get(0), "2");
    }

    @Test
    void pushToTail() {
        customLinkedList.pushToTail("1");
        customLinkedList.pushToTail("2");
        assertEquals(customLinkedList.get(customLinkedList.size() - 1), "2");
        customLinkedList.pushToTail("3");
        assertEquals(customLinkedList.get(customLinkedList.size() - 1), "3");

    }

    @Test
    void pushToIndex() {
        assertThrows(RuntimeException.class, ()-> customLinkedList.pushToIndex("1",1));
        customLinkedList.pushToHead("1");
        customLinkedList.pushToTail("2");
        customLinkedList.pushToIndex("0", 0);
        assertEquals(customLinkedList.get(0), "0");
        customLinkedList.pushToIndex("1", 1);
        customLinkedList.pushToIndex("2", 2);
        assertEquals(customLinkedList.get(0), "0");
        assertEquals(customLinkedList.get(1), "1");
        assertEquals(customLinkedList.get(2), "2");
        customLinkedList.pushToTail("3");
//        customLinkedList.print();

        assertThrows(RuntimeException.class, ()-> customLinkedList.pushToIndex("100",100));


    }

    @Test
    void get() {
        assertThrows(RuntimeException.class, ()-> customLinkedList.get(0));
        customLinkedList.pushToHead("0");
        customLinkedList.pushToHead("1");
        assertThrows(RuntimeException.class, ()-> customLinkedList.get(3));
    }

    @Test
    void removeFirst() {
        customLinkedList.pushToHead("1");
        customLinkedList.pushToTail("2");
        customLinkedList.removeFirst();
        assertEquals(customLinkedList.get(0), "2");
    }

    @Test
    void print() {
    }
}