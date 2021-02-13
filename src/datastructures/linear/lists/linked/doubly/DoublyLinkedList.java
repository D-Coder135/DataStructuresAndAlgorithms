package datastructures.linear.lists.linked.doubly;

import datastructures.linear.lists.ListADT;
import datastructures.linear.lists.linked.doubly.node.Node;

public class DoublyLinkedList<E> implements ListADT<E> {

    private final Node<E> head = null;
    private final Node<E> tail = null;
    private final int size = 0;

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
