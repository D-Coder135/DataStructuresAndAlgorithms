package datastructures.linear.lists.linked.doubly.node;

/**
 * The Node class is created generic so that it can support operations with any
 * reference type (pre-defined or programmer-defined) in Java.
 */
public class Node<E> {
    /*
     * The E type here specifies that the data variable can be of any reference type, including but not limited to -
     * 1. Wrapper Types for primitive data types in the JDK.
     * 2. String, StringBuilder/StringBuffer, BigInteger, BigDecimal.
     * 3. Pre-Defined "Data" classes in the JDK.
     * 4. "Data" Classes created by a programmer in a package.
     * */
    private final E data;

    private final Node<E> previous;

    /*
     * This variable will store the reference to the next node of the current node.
     * This will form a "logical-link" (not a physical link) from the current node to the next node.
     * It is hence possible to query the current node for the next node, and thus we can traverse to the next node if
     * required.
     * */
    private final Node<E> next;


    /*
     * This constructor is used in the case that we want to create a node but only the data of the node is
     * available to us, in this case, the node simply DOES NOT have a next node, and thus the value is set to null.
     * */
    public Node(E data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    /*
     * This constructor is used in the case that we want to create a node and we have both the data of the node and
     * the
     * */
    public Node(E data, Node<E> previous, Node<E> next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    /**
     * This is the public getter method for reading the value of the data of a node.
     *
     * @return returns the actual data stored in the node.
     */
    public E getData() {
        return data;
    }

    /**
     * This is the public getter method for reading the reference value of the next node of the current node.
     *
     * @return returns the reference of the next node.
     */
    public Node<E> getNext() {
        return next;
    }

    public Node<E> getPrevious() {
        return previous;
    }
}

