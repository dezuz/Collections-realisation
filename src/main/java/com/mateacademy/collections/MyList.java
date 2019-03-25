package com.mateacademy.collections;

public interface MyList<T> {
    T get(int i);

    void add(T t);

    void remove(int i);

    int size();
}
