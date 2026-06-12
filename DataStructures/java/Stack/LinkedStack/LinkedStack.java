package DataStructures.java.Stack.LinkedStack;

/**
 * LinkedStack represents a linked implementation of a stack.
 * 
 * @author Minh Tan Nguyen
 */
public class LinkedStack<T> implements StackADT<T> {

    private SinglyLinkedList<T> stack;

    /**
     * Creates an empty stack.
     */
    public LinkedStack() {
        stack = new SinglyLinkedList<>();
    }

    /**
     * Adds a specified element to the top of this stack.
     * 
     * @param element element to be pushed on stack
     */
    @Override
    public void push(T element) {
        stack.addToFront(element);
    }

    /**
     * Removes the element at the top of this stack and returns 
     * a reference to it.
     * @return element removed from top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    @Override
    public T pop() {
        return stack.removeFirst();
    }

    /**
     * Returns a reference to the element at the top of this stack.
     * @return element on top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    @Override
    public T peek() {
        return stack.first();
    }

    /**
     * Checks if this stack is empty.
     * @return true if this stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Returns the current size of this stack.
     * @return the size of this stack
     */
    @Override
    public int size() {
        return stack.size();
    }

    /**
     * Returns a string representation of this stack.
     * 
     * @return a string representation of the stack
     */
    @Override
    public String toString() {
        return stack.toString();
    }
    
}
