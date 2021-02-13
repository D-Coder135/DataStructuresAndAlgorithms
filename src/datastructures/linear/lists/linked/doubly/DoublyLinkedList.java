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

    /**
     * This method will return a node at the specified index from the linked list.
     *
     * @param index An non-negative index from the linked list.
     * @return The node at the specified index.
     */
    private Node<E> getNode(int index) {
        Node<E> currentNode = head;
        /*
         * using a loop to traverse the whole linked list,
         * the loop will run until i is less than the size of the linked list,
         * AND
         * the current node traversed is not equal to null.
         * */
        for (int i = 0; i < index; i++) {
            // change the reference value of the response variable to the next node
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

}
