package datastructures.linear.lists.linked.singly;

import datastructures.linear.lists.ListADT;
import datastructures.linear.lists.linked.singly.node.Node;

public class SinglyLinkedList<E> implements ListADT<E> {

    /*
     * This head reference variable will
     * 1. Store the reference value for the first node object in the linked list.
     * 2. Keep track of the first node in the linked list in case it is changed anytime.
     * */
    private final Node<E> head = null;

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
