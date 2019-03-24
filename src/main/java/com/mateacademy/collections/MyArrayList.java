package com.mateacademy.collections;

import java.util.Arrays;

public class  MyArrayList <T> implements MyList<T>, Cloneable{
    private static final int INITIAL_CAPACITY = 10;
    private int size;
    private Object[] elements;

    MyArrayList() {
        elements = new Object[INITIAL_CAPACITY];
    }

    MyArrayList(int size) {
        elements = new Object[size];
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > this.size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        return (T)elements[index];
    }

    @Override
    public void add(T t) {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        elements[size++] = t;
    }

    @Override
    public void remove(int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index > this.size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        int numberMoved = size - index;
        if(numberMoved > 0) {
            System.arraycopy(elements, index, elements, index - 1, numberMoved);
        }
        elements[--size] = null;
    }

    @Override
    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
