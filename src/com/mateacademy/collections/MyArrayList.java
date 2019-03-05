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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public T get(int index) {
        if (index < 0) {
            System.out.println("Please write a valid index");
            return null;
        }
        else {
            if (index > this.size) {
                throw new ArrayIndexOutOfBoundsException(index);
            }
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
            System.out.println("Please write a valid index");
        }
        else {
            if (index > this.size) {
                throw new ArrayIndexOutOfBoundsException(index);
            }
        }

        int numberMoved = size - index;
        if(numberMoved > 0) {
            System.arraycopy(elements, index, elements, index - 1,
                    numberMoved);
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
