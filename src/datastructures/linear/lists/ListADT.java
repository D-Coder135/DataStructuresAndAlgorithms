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

    /**
     * This method will remove an existing element from our list.
     * Since no parameter to the method is allowed it simply removes the last element from our list.
     *
     * @return it returns the value of the item that was just removed.
     */
    public abstract E remove();

    /**
     * This method is an overloaded version of the previous remove() method we had built.
     * Since lists allow random access, we can specify an integer type index to the parameter to delete
     * the item on that particular index.
     *
     * @return it returns the value of the item that was just removed from the index.
     * @throws IndexOutOfBoundsException throws an exception if the specified index is out of bounds.
     */
    public abstract E remove(int index) throws IndexOutOfBoundsException;

}
