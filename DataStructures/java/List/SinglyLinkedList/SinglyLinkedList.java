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

    /**
     * Removes and returns the specified element from this list.
     *
     * @param element the element to be removed from the list
     * @throws EmptyCollectionException if list is empty
     * @throws ElementNotFoundException if the element is not in the list
     */
    @Override
    public T remove(T element) {

        if (isEmpty()) {
            throw new EmptyCollectionException("list");
        }

        T result = null;

        if (head.element.equals(element)) {
            result = removeFirst();
        } else if (tail.element.equals(element)) {
            result = removeLast();
        } else {

            Node<T> current = head;
            Node<T> previous = null;

            while (current != null) {
                if (current.element.equals(element)) {
                    break;
                }
                previous = current;
                current = current.next;
            }

            if (current == null) {
                throw new ElementNotFoundException("list");
            }

            result = current.element;
            previous.next = current.next;
            count--;

        }

        return result;

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

    /**
     * Returns true if this list contains the specified target element.
     *
     * @param target the target that is being sought in the list
     * @return true if the list contains this element
     */
    @Override
    public boolean contains(T target) {

        boolean found = false;

        if (target != null) {
            Node<T> current = head;

            while (current != null) {
                if (current.element.equals(target)) {
                    found = true;
                    break;
                }
                current = current.next;
            }
        }

        return found;

    }

    /**
     * Adds the specified element to the front of this list.
     *
     * @param element the element to be added to the front of this list
     */
    @Override
    public void addToFront(T element) {

        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;

        if (isEmpty()) {
            tail = newNode;
        }

        count++;

    }

    /**
     * Adds the specified element to the rear of this list.
     *
     * @param element the element to be added to the rear of this list
     */
    @Override
    public void addToRear(T element) {

        Node<T> newNode = new Node<>(element);

        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        count++;

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

        Node<T> current = head;

        while (current != null) {
            if (current.element.equals(target)) {
                break;
            }
            current = current.next;
        }

        if (current == null) {
            throw new ElementNotFoundException("list");
        }

        Node<T> newNode = new Node<>(element);
        newNode.next = current.next;
        current.next = newNode;
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
