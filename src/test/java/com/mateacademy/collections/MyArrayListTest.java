package com.mateacademy.collections;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {
    private MyArrayList<Integer> myArrayList;
    private int size;
    private final int INITIAL_CAPACITY = 10;
    private Object[] elements;


    @Before
    public void init() {
        myArrayList = new MyArrayList<>();
        elements = new Object[INITIAL_CAPACITY];

        for (int i = 0; i < 4; i++) {
            elements[i] = i * i;
        }

        for (int i = 0; i < 4; i++) {
            myArrayList.add(i * i);
        }

    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testGetMethodToReturnCorrectElement() {
        Object expected = elements[2];
        Object actual = myArrayList.get(2);

        assertEquals(expected, actual);
    }

    @Test
    public void testAddMethod() {
        elements[4] = 16;
        myArrayList.add(16);

        assertEquals(elements[4], myArrayList.get(4));
    }

    @Test
    public void testGetMethodToExceptions() {
        exception.expect(ArrayIndexOutOfBoundsException.class);
        exception.expectMessage("Index is lower than size");
        myArrayList.get(-1);
    }

    @Test
    public void testRemoveMethod() {
        Object expected = elements[3];
        myArrayList.remove(2);
        Object actual = myArrayList.get(2);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveMethodIndexIsLowerThanZero() {
        exception.expect(ArrayIndexOutOfBoundsException.class);
        exception.expectMessage("Index is lower than size");
        myArrayList.remove(-1);
    }

    @Test
    public void testRemoveMethodIndexIsOverSize() {
        exception.expect(ArrayIndexOutOfBoundsException.class);
        exception.expectMessage("Index is over size");
        myArrayList.remove(6);
    }

    @Test
    public void testSizeMethodToReturnCorrectSize() {
        Integer expected = 4;
        Integer actual = myArrayList.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testClearMethod() {
        Integer expected = 0;
        myArrayList.clear();
        Integer actual = myArrayList.size();

        assertEquals(expected, actual);
    }
}
