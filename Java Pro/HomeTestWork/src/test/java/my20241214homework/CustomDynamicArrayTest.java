package my20241214homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomDynamicArrayTest {
    CustomDynamicArray customDynamicArray = new CustomDynamicArray();

    CustomDynamicArray customDynamicArraySize5 = new CustomDynamicArray(5);


    @Test
    void addToNullSizeTest() {
        customDynamicArray.add(5);
        assertEquals(5, customDynamicArray.get(0));
        assertEquals(1, customDynamicArray.size);

    }

    @Test
    void addToNotNullTest() {
        customDynamicArraySize5.add(5);
        assertEquals(5, customDynamicArraySize5.get(0));
        assertEquals(5, customDynamicArraySize5.size);
    }


    @Test
    void addAtOutOfBoundsTest() {
        assertThrows(RuntimeException.class, () -> customDynamicArray.addAt(2, 2));
    }

    @Test
    void addAtTest() {
        customDynamicArraySize5.add(0);
        customDynamicArraySize5.add(1);
        customDynamicArraySize5.add(2);
        customDynamicArraySize5.add(3);
        customDynamicArraySize5.addAt(2, 2);
        assertEquals(2, customDynamicArraySize5.get(2));

    }

    @Test
    void addAtOutOfBoundsMinusOneTest() {
        assertThrows(RuntimeException.class, () -> customDynamicArray.addAt(-1, -1));
    }

    @Test
    void addAtCountEqualsSizeTest() {
        customDynamicArray.add(0);
        customDynamicArray.add(1);
        customDynamicArray.add(2);
        customDynamicArray.addAt(2, 2);
        assertEquals(4, customDynamicArray.size);
    }

    @Test
    void shrinkSizeTest() {
        customDynamicArray.add(0);
        customDynamicArray.add(1);
        customDynamicArray.add(2);
        customDynamicArray.add(3);
        customDynamicArray.add(4);
        customDynamicArray.removeAt(3);
        customDynamicArray.shrinkSize();
        assertEquals(4, customDynamicArray.size);

    }

    @Test
    void removeTest() {
        customDynamicArray.add(0);
        customDynamicArray.add(1);
        customDynamicArray.add(2);
        customDynamicArray.add(3);
        customDynamicArray.remove();
//        assertNull(customDynamicArray.get(customDynamicArray.count));
        assertEquals(3, customDynamicArray.count);
    }

    @Test
    void removeAtTest() {
        customDynamicArray.add(0);
        customDynamicArray.add(1);
        customDynamicArray.add(2);
        customDynamicArray.add(3);
        assertThrows(RuntimeException.class, () -> customDynamicArray.removeAt(-1));
//        assertThrows(RuntimeException.class, () -> customDynamicArray.removeAt(1));
        assertThrows(RuntimeException.class, () -> customDynamicArray.removeAt(5));

        customDynamicArray.removeAt(1);
        assertEquals(3, customDynamicArray.count);
        assertEquals(2, customDynamicArray.get(1));

    }

    @Test
    void set() {
    }

    @Test
    void get() {
    }

    @Test
    void clear() {
    }

    @Test
    void contains() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void testToString() {
    }

    @Test
    void iterator() {
    }
}