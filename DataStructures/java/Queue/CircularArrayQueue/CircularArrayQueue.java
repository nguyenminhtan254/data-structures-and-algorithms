package DataStructures.java.Queue.CircularArrayQueue;

/**
 * CircularArrayQueue represents an array implementation of a queue in
 * which the indexes for the front and rear of the queue circle back to 0
 * when they reach the end of the array.
 * 
 * @author Minh Tan Nguyen
 */
public class CircularArrayQueue<T> implements QueueADT<T> {

    private final static int DEFAULT_CAPACITY = 100;
    private int front, rear, count;
    private T[] queue;

    /**
     * Creates an empty queue using the default capacity.
     */
    public CircularArrayQueue() {
        front = rear = count = 0;
        queue = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    /**
     * Creates an empty queue using the specified capacity.
     * 
     * @param initialCapacity the initial size of the circular array queue
     */
    public CircularArrayQueue(int initialCapacity) {
        front = rear = count = 0;
        queue = (T[]) (new Object[initialCapacity]);
    }

    /**
     * Adds the specified element to the rear of this queue, expanding
     * the capacity of the queue array if necessary.
     * 
     * @param element the element to add to the rear of the queue
     */
    @Override
    public void enqueue(T element) {

        if (size() == queue.length) {
            expandCapacity();
        }

        queue[rear] = element;
        /**
         * When rear < array.length, the (% queue.length) does not affect (rear + 1).
         * When rear = array.length, the operation will definitely result in a remainder
         * of 0.
         */
        rear = (rear + 1) % queue.length;

        count++;

    }

    /**
     * Removes the element at the front of this queue and returns a
     * reference to it.
     * 
     * @return the element removed from the front of the queue
     * @throws EmptyCollectionException if the queue is empty
     */
    @Override
    public T dequeue() {

        if (isEmpty()) {
            throw new EmptyCollectionException("queue");
        }

        T result = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;

        count--;

        return result;

    }

    /**
     * Returns without removing the element at the front of this queue.
     * 
     * @return the first element in the queue
     * @throws EmptyCollectionException  if the queue is empty
     */
    @Override
    public T first() {

        if (isEmpty()) {
            throw new EmptyCollectionException("queue");
        }

        return queue[front];

    }

    /**
     * Returns true if this queue contains no elements.
     * 
     * @return true if this queue is empty
     */
    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Returns the number of elements in this queue.
     * 
     * @return the integer representation of the size of the queue
     */
    @Override
    public int size() {
        return count;
    }

    /**
     * Creates a new array to store the contents of this queue with
     * twice the capacity of the old one.
     */
    private void expandCapacity() {

        T[] newQueue = (T[]) new Object[queue.length * 2];

        for (int scan = 0; scan < count; scan++) {
            newQueue[scan] = queue[front];
            front = (front + 1) % queue.length;
        }

        front = 0;
        rear = count;
        queue = newQueue;

    }

    /**
     * Returns a string representation of this queue.
     * 
     * @return the string representation of the queue
     */
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        int current = front;

        result.append("[");
        for (int scan = 0; scan < count; scan++) {
            if (scan > 0) {
                result.append(", ");
            }
            result.append(queue[current]);
            current = (current + 1) % queue.length;
        }
        result.append("]");

        return result.toString();

    }

}
