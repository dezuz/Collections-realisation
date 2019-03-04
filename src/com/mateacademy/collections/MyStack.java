package com.mateacademy.collections;

import java.util.Arrays;

public class MyStack<T> {
    private int size;
    private Object[] elements;

    MyStack(int initialCapacity) {
        elements = new Object[initialCapacity];
    }

    public void push(T item) {
        if (size == 0) {
            elements = Arrays.copyOf(elements, 1);
        }
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        elements[size++] = item;
    }

    public void remove() {
        elements = Arrays.copyOf(elements, --size);
    }

    public void clear() {
        elements = Arrays.copyOf(elements, 0);
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        return (T)elements[size - 1];
    }

    public T pop() {
        T topElement = (T)elements[size - 1];
        elements = Arrays.copyOf(elements, --size);
        return topElement;
    }
}
