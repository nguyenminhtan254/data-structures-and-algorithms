package DataStructures.java.Queue.LinkedQueue;

/**
 * LinkedQueue represents a linked inplementation of a queue.
 * 
 * @author Minh Tan Nguyen
 */
public class LinkedQueue<T> implements QueueADT<T> {

    private SinglyLinkedList<T> queue;

    /**
     * Creates an empty queue.
     */
    public LinkedQueue() {
        queue = new SinglyLinkedList<>();
    }

    /**
     * Adds the specified element to the tail of this queue.
     * 
     * @param element the element to be added to the tail of the queue
     */
    @Override
    public void enqueue(T element) {
        queue.addToRear(element);
    }

    /**
     * Removes the element at the head of this queue and returns a
     * reference to it.
     * 
     * @return the element at the head of this queue
     * @throws EmptyCollectionException if the queue is empty
     */
    @Override
    public T dequeue() {
        return queue.removeFirst();
    }

    /**
     * Returns without removing the element at the front of this queue.
     * 
     * @return the first element in the queue
     * @throws EmptyCollectionException if the queue is empty
     */
    @Override
    public T first() {
        return queue.first();
    }

    /**
     * Returns true if this queue contains no elements.
     * 
     * @return true if this queue is empty
     */
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Returns the number of elements in this queue.
     * 
     * @return the integer representation of the size of the queue
     */
    @Override
    public int size() {
        return queue.size();
    }

    /**
     * Returns a string representation of this queue.
     * 
     * @return the string representation of the queue
     */
    @Override
    public String toString() {
        return queue.toString();
    }

}
