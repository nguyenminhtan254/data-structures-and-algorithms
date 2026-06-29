package DataStructures.java.List.ArrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Arrays;

/**
 * ArrayList represents an array implementation of an unordered list. The front
 * of the list is kept at array index 0.
 *
 * @author Minh Tan Nguyen
 */
public class ArrayList<T> implements UnorderedListADT<T> {

    private final static int DEFAULT_CAPACITY = 100;
    private final static int NOT_FOUND = -1;
    protected int count;
    protected T[] list;

    /**
     * Creates an empty list using the default capacity.
     */
    public ArrayList() {
        count = 0;
        list = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    /**
     * Creates an empty list using the specified capacity.
     *
     * @param initialCapacity the size of the array list
     */
    public ArrayList(int initialCapacity) {
        count = 0;
        list = (T[]) (new Object[initialCapacity]);
    }

    /**
     * Removes and returns the first element from this list.
     *
     * @return the first element from this list
     * @throws EmptyCollectionException if list is empty
     */
    @Override
    public T removeFirst() {

        if (isEmpty()) {
            throw new EmptyCollectionException("ArrayList");
        }

        T result = list[0];

        for (int scan = 0; scan < count - 1; scan++) {
            list[scan] = list[scan + 1];
        }

        list[--count] = null;

        return result;

    }

    /**
     * Removes and returns the last element from this list.
     *
     * @return the last element from this list
     * @throws EmptyCollectionException if list is empty
     */
    @Override
    public T removeLast() {

        if (isEmpty()) {
            throw new EmptyCollectionException("ArrayList");
        }

        T result = list[--count];
        list[count] = null;

        return result;

    }

    /**
     * Removes and returns the specified element from this list.
     *
     * @param element the element to be removed and returned from the list
     * @return the removed elememt
     * @throws EmptyCollectionException if list is empty
     * @throws ElementNotFoundException if the element is not in the list
     */
    @Override
    public T remove(T element) {

        if (isEmpty()) {
            throw new EmptyCollectionException("ArrayList");
        }

        int index = find(element);

        if (index == NOT_FOUND) {
            throw new ElementNotFoundException("ArrayList");
        }

        T result = list[index];

        for (int scan = index; scan < count - 1; scan++) {
            list[scan] = list[scan + 1];
        }

        list[--count] = null;

        return result;

    }

    /**
     * Returns a reference to the first element in this list.
     *
     * @return a reference to the first element in this list
     * @throws EmptyCollectionException if list is empty
     */
    @Override
    public T first() {

        if (isEmpty()) {
            throw new EmptyCollectionException("ArrayList");
        }

        return list[0];

    }

    /**
     * Returns a reference to the last element in this list.
     *
     * @return a reference to the last element in this list
     * @throws EmptyCollectionException if list is empty
     */
    @Override
    public T last() {

        if (isEmpty()) {
            throw new EmptyCollectionException("ArrayList");
        }

        return list[count - 1];

    }

    /**
     * Returns true if this list contains the specified element.
     *
     * @param target the target element
     * @return true if the target is in the list, false otherwise
     */
    @Override
    public boolean contains(T target) {
        return find(target) != NOT_FOUND;
    }

    /**
     * Adds the specified element to the front of this list.
     *
     * @param element the element to be added to the front of this list
     */
    @Override
    public void addToFront(T element) {

        if (size() == list.length) {
            expandCapacity();
        }

        for (int scan = count; scan > 0; scan--) {
            list[scan] = list[scan - 1];
        }

        list[0] = element;

        count++;

    }

    /**
     * Adds the specified element to the rear of this list.
     *
     * @param element the element to be added to the rear of this list
     */
    @Override
    public void addToRear(T element) {

        if (size() == list.length) {
            expandCapacity();
        }

        list[count++] = element;

    }

    /**
     * Adds the specified element after the specified target.
     *
     * @param element the element to be added after the target
     * @param target  the target is the item that the element will be added after
     * @throws ElementNotFoundException if the element is not in the list
     */
    @Override
    public void addAfter(T element, T target) {

        if (size() == list.length) {
            expandCapacity();
        }

        int index = find(target);
        if (index == NOT_FOUND) {
            throw new ElementNotFoundException("ArrayList");
        }

        for (int scan = count; scan > index + 1; scan--) {
            list[scan] = list[scan - 1];
        }

        list[index + 1] = element;
        count++;

    }

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     */
    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the integer representation of number of elements in this list
     */
    @Override
    public int size() {
        return count;
    }

    /**
     * Returns an iterator for the elements in this list.
     *
     * @return an iterator over the elements in this list
     */
    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    /**
     * ArrayListIterator iterator over the elements of an ArrayList.
     */
    private class ArrayListIterator implements Iterator<T> {

        int current;

        /**
         * Sets up this iterator.
         */
        public ArrayListIterator() {
            current = 0;
        }

        /**
         * Returns true if this iterator has at least one more element to deliver in the
         * iteration.
         *
         * @return true if this iterator has at least one more element to deliver in the
         *         iteration
         */
        @Override
        public boolean hasNext() {
            return current < count;
        }

        /**
         * Returns the next element in the iteration. If there are no
         * more elements in this iteration, a NoSuchElementException is
         * thrown.
         *
         * @return the next element in the iteration
         */
        @Override
        public T next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            T result = list[current++];
            return result;
            
        }

    }

    /**
     * Returns a string representation of this list.
     *
     * @return a string representation of this list
     */
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        result.append("[");
        for (int scan = 0; scan < count; scan++) {
            if (scan > 0) {
                result.append(", ");
            }
            result.append(list[scan]);
        }
        result.append("]");

        return result.toString();

    }

    /**
     * Returns the array index of the specified element, or the
     * constant NOT_FOUND if it is not found.
     *
     * @param target the target element
     * @return the index of the target element, or the
     *         NOT_FOUND constant
     */
    private int find(T target) {

        int result = NOT_FOUND;

        if (target != null) {
            for (int scan = 0; scan < count; scan++) {
                if (list[scan].equals(target)) {
                    result = scan;
                    break;
                }
            }
        }

        return result;

    }

    /**
     * Creates a new array to store the contents of this list with twice the
     * capacity of the old one.
     */
    private void expandCapacity() {
        list = Arrays.copyOf(list, list.length * 2);
    }

}
