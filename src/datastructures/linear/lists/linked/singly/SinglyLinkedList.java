package datastructures.linear.lists.linked.singly;

import datastructures.linear.lists.ListADT;
import datastructures.linear.lists.linked.singly.node.Node;

public class SinglyLinkedList<E> implements ListADT<E> {

    /*
     * This head reference variable will
     * 1. Store the reference value for the first node object in the linked list.
     * 2. Keep track of the first node in the linked list in case it is changed anytime.
     * */
    private Node<E> head = null;

    /*
     * This size variable will keep the count of the total number of nodes in the linked list except the head node.
     * */
    private int size = 0;

    @Override
    public boolean add(E item) {
        return false;
    }

    /**
     * This method will add an item node to the beginning of the linked list.
     * Since the programmer is only giving us the item(the data value) and NOT
     * the node itself, we would have to create a node. Since, the linked list can only
     * operate on nodes.
     *
     * @param item This is the data value of the node to be created and added to the linked list.
     */
    private void addFirst(E item) {
        /*
         * The code following these comments is the summation of the two lines of code
         * written inside the comments.
         * Node<E> n1 = new Node<E>(item, null);
         * head = n1;
         * */
        head = new Node<>(item, head);
        // increase the size of the linked list
        size++;
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
