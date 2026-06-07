package DataStructures.java.Stack.LinkedStack;

import java.util.Iterator;

/**
 * SinglyLinkedList represents a linked implementation of a list.
 * 
 * @author Minh Tan Nguyen
 */
public class SinglyLinkedList<T> implements UnorderedListADT<T> {

    private Node<T> head;
    private int count;

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
         * @param element element to be stored
         */
        public Node(T element) {
            this.element = element;
            next = null;
        }

    }

    /**
     * Creats an empty singly linked list.
     */
    public SinglyLinkedList() {
        head = null;
        count = 0;
    }

    /**
     * Removes and returns the first element from this list.
     *
     * @return the first element from this list
     */
    @Override
    public T removeFirst() {

        if (isEmpty()) {
            throw new EmptyCollectionException("stack");
        }

        T result = head.element;
        head = head.next;
        count--;

        return result;

    }

    @Override
    public T removeLast() {
        throw new UnsupportedOperationException("Unimplemented method 'removeLast'");
    }

    @Override
    public T remove(T element) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    
    /**
     * Returns a reference to the first element in this list.
     *
     * @return a reference to the first element in this list
     */
    @Override
    public T first() {

        if (isEmpty()) {
            throw new EmptyCollectionException("stack");
        }

        return head.element;

    }

    @Override
    public T last() {
        throw new UnsupportedOperationException("Unimplemented method 'last'");
    }

    @Override
    public boolean contains(T target) {
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
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
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    /**
     * Adds the specified element to the rear of this list.
     *
     * @param element the element to be added to the rear of this list
     */
    @Override
    public void addToFront(T element) {

        Node<T> newNode = new Node<>(element);

        newNode.next = head;
        head = newNode;

        count++;

    }

    @Override
    public void addToRear(T element) {
        throw new UnsupportedOperationException("Unimplemented method 'addToRear'");
    }

    @Override
    public void addAfter(T element, T target) {
        throw new UnsupportedOperationException("Unimplemented method 'addAfter'");
    }

}
