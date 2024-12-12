package my20241212class;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


class TasksExTest {

    @Test
    public void testFindSomeNumbers() {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
        List<Integer> expected = Arrays.asList(1, 7);

        assertEquals(expected, TasksEx.findSomeNumbers(array1, array2));

    }

    @Test
    public void testNotFoundSome() {
        int[] array1 = {1, 2, 5};
        int[] array2 = {3, 0, 6};
        List<Integer> expected = Arrays.asList();

        assertEquals(expected, TasksEx.findSomeNumbers(array1, array2));
    }

    @Test
    public void testIfArraysEmpty() {
        int[] array1 = {};
        int[] array2 = {};
        List<Integer> expected = Arrays.asList();

        assertEquals(expected, TasksEx.findSomeNumbers(array1, array2));
    }

    @Test
    public void getUniugeNumbers() {
        int[] arrayIntegers = {0, 3, -2, 4, 3, 2};
        Set<Integer> expected = new HashSet<>(Arrays.asList(0, 3, -2, 4, 2));

        assertEquals(expected, TasksEx.getUniugeNumbers(arrayIntegers));
    }

}