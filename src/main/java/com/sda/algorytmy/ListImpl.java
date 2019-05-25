package com.sda.algorytmy;

import java.util.Arrays;

public class ListImpl<E> implements MyList<E> {

    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object elemetData[];

    public ListImpl() {
        elemetData = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity() {
        int newSize = this.DEFAULT_CAPACITY * 2;
        elemetData = Arrays.copyOf(elemetData, newSize);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(E e) {
        elemetData[size++] = e;
        return false;
    }

    @Override
    public boolean remove(int index) {

        for (int i = index; i < elemetData.length - 1; i++) {
            elemetData[i] = elemetData[i + 1];
        }
        elemetData[elemetData.length - 1] = null;
        return true;
    }
}


