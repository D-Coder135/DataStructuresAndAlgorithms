package datastructures.linear.lists.array;

import datastructures.linear.lists.ListADT;

public class ArraysList<E> implements ListADT<E> {

    private final int MAX_SIZE;
    private E[] array;
    private int currentSize = 0;

    public ArraysList(int maxSize) {
        this.MAX_SIZE = maxSize;
    }

    @Override
    public boolean add(E item) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        return null;
    }
}
