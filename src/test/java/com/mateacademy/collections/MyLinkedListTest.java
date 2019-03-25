package com.mateacademy.collections;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {
    private MyLinkedList<Integer> myLinkedList;

    @Before
    public void init() {
        myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 4; i++) {
            myLinkedList.add(i * i);
        }
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testGetMethod() {
        Integer expected = 0;
        Integer actual = myLinkedList.get(0);

        assertEquals(expected, actual);
    }

    @Test
    public void testAddMethod() {
        Integer expected = 16;
        myLinkedList.add(16);
        Integer actual = myLinkedList.get(4);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMethodToException() {
        exception.expect(ArrayIndexOutOfBoundsException.class);
        exception.expectMessage("Index is lower than size");
        myLinkedList.get(-1);
    }

    @Test
    public void testRemoveMethod() {
        Integer expected = 9;
        myLinkedList.remove(2);
        Integer actual = myLinkedList.get(2);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveMethodToException() {
        exception.expect(ArrayIndexOutOfBoundsException.class);
        exception.expectMessage("Index is lower than size");
        myLinkedList.remove(-1);
    }

    @Test
    public void testSizeMethodToReturnCorrectSize() {
        Integer expected = 4;
        Integer actual = myLinkedList.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testClearMethod() {
        Integer expected = 0;
        myLinkedList.clear();
        Integer actual = myLinkedList.size();

        assertEquals(expected, actual);
    }
}
