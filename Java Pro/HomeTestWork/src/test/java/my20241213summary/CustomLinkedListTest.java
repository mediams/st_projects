package my20241213summary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.hierarchical.Node;

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
    }

    @Test
    void get() {
//        assertNull();
        assertThrows(RuntimeException.class, ()-> customLinkedList.get(0));
    }

    @Test
    void removeFirst() {
        assertThrows(RuntimeException.class, ()-> customLinkedList.get(0));

    }

    @Test
    void print() {
    }
}