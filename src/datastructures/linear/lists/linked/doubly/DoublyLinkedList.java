package datastructures.linear.lists.linked.doubly;

import datastructures.linear.lists.ListADT;
import datastructures.linear.lists.linked.doubly.node.Node;

public class DoublyLinkedList<E> implements ListADT<E> {

    /*
     * This field will store the reference to the first node in the linked list.
     * */
    private Node<E> head = null;

    /*
     * This field will store the reference to the last node in the linked list.
     * */
    private Node<E> tail = null;

    /*
     * This field will store the current size of the linked list.
     * */
    private int size = 0;

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
