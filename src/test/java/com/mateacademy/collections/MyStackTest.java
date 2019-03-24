package com.mateacademy.collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyStackTest {
    private MyStack<Integer> myStack;

    @Before
    public void init() {
        myStack = new MyStack<>(4);
        for (int i = 0; i < 4; i++) {
            myStack.push(i * i);
        }
    }

    @Test
    public void testRemoveMethod() {
        Integer expected = 4;
        myStack.remove();
        Integer actual = myStack.peek();

        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRemoveMethodToException() {
        myStack.clear();
        myStack.remove();
    }

    @Test
    public void testClearMethod() {
        Integer expected = 0;
        myStack.clear();
        Integer actual = myStack.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testSizeMethodToReturnCorrectSize() {
        Integer expected = 4;
        Integer actual = myStack.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testPeekMethodToReturnCorrectElement() {
        Integer expected = 9;
        Integer actual = myStack.peek();

        assertEquals(expected, actual);
    }

    @Test
    public void testPopMethodToReturnCorrectElement() {
        Integer expected = 9;
        Integer actual = myStack.pop();

        assertEquals(expected, actual);
    }

    @Test
    public void testPopMethodToReturnCorrectSize() {
        Integer expected = 3;
        myStack.pop();
        Integer actual = myStack.size();

        assertEquals(expected, actual);
    }
}
