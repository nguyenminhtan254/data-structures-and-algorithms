package DataStructures.java.List.SinglyLinkedList;

import java.util.Iterator;

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

        return result;

    }

    /**
     * Removes and returns the last element from this list.
     *
     * @return the last element from this list
     */
    @Override
    public T removeLast() {
        
        if (isEmpty()) {
            throw new EmptyCollectionException("list");
        }

        T result = tail.element;

        Node<T> current = head;
        Node<T> previous = null;

        while (current.next != null) {
            previous = head;
            current = current.next;
        }

        tail = previous;

        return result;

    }

    @Override
    public T remove(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public T first() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'first'");
    }

    @Override
    public T last() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'last'");
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

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

}
