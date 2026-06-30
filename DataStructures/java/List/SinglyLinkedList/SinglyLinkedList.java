package DataStructures.java.List.SinglyLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * SinglyLinkedList represents a linked implementation of a list.
 *
 * @author Minh Tan Nguyen
 */
public class SinglyLinkedList<T> implements UnorderedListADT<T> {

    protected int count;
    protected Node<T> head, tail;

    /**
     * Represents a node in a linked list.
     * 
     * @author Minh Tan Nguyen
     */
    private static class Node<T> {

        private T element;
        private Node<T> next;

        /**
         * Creates an empty node.
         */
        public Node() {
            element = null;
            next = null;
        }

        /**
         * Creates a node storing the specified element.
         * 
         * @param element element to be stored
         */
        public Node(T element) {
            this.element = element;
            next = null;
        }

    }

    /**
     * Creates an empty list.
     */
    public SinglyLinkedList() {
        count = 0;
        head = tail = null;
    }

    /**
     * Removes and returns the first element from this list.
     *
     * @return the first element from this list
     * @throws EmptyCollectionException if the list is empty
     */
    @Override
    public T removeFirst() {

        if (isEmpty()) {
            throw new EmptyCollectionException("list");
        }

        T result = head.element;
        head = head.next;
        count--;

        if (isEmpty()) {
            tail = null;
        }

        return result;

    }

    /**
     * Removes and returns the last element from this list.
     *
     * @return the last element from this list
     * @throws EmptyCollectionException if the list is empty
     */
    @Override
    public T removeLast() {

        if (isEmpty()) {
            throw new EmptyCollectionException("list");
        }

        T result = tail.element;

        if (head == tail) {
            head = tail = null;
        } else {

            Node<T> current = head;
            Node<T> previous = null;

            while (current.next != null) {
                previous = current;
                current = current.next;
            }

            tail = previous;
            tail.next = null;

        }

        count--;
        return result;

    }

    @Override
    public T remove(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    /**
     * Returns a reference to the first element in this list.
     *
     * @return a reference to the first element in this list
     * @throws EmptyCollectionException if the list is empty
     */
    @Override
    public T first() {

        if (isEmpty()) {
            throw new EmptyCollectionException("list");
        }

        return head.element;

    }

    /**
     * Returns a reference to the last element in this list.
     *
     * @return a reference to the last element in this list
     * @throws EmptyCollectionException if the list is empty
     */
    @Override
    public T last() {

        if (isEmpty()) {
            throw new EmptyCollectionException("list");
        }

        return tail.element;

    }

    @Override
    public boolean contains(T target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public void addToFront(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addToFront'");
    }

    @Override
    public void addToRear(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addToRear'");
    }

    @Override
    public void addAfter(T element, T target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAfter'");
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
        return new SinglyLinkedListIterator();
    }

    /**
     * SinglyLinkedLIstIterator represents an iterator for a singly linked list of
     * linear nodes.
     */
    private class SinglyLinkedListIterator implements Iterator<T> {

        private Node<T> current;

        /**
         * Sets up this iterator.
         */
        public SinglyLinkedListIterator() {
            current = head;
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
            return current != null;
        }

        /**
         * Returns the next element in the iteration. If there are no more elements in
         * this iteration, a NoSuchElementException is thrown.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iterator is empty
         */
        @Override
        public T next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            T result = current.element;
            current = current.next;
            return result;

        }

    }

    /**
     * Returns a string representation of this list.
     *
     * @return a string representation of this list
     */
    public String toString() {

        StringBuilder result = new StringBuilder();

        result.append("[");

        Node<T> current = head;
        while (current != null) {
            if (current != head) {
                result.append(", ");
            }
            result.append(current.element);

            current = current.next;
        }

        result.append("]");

        return result.toString();

    }

}
