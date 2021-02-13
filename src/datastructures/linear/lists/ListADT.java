package datastructures.linear.lists;

/**
 * This ListADT interface will serve as the ADT (Abstract Data Type) for a List Data Structure we want to implement.
 */
public interface ListADT<E> {

    /**
     * This method will add a new item (value) to our list.
     *
     * @return it returns true if the item is added to the list.
     */
    boolean add(E item);

}
