package DataStructures.java.Stack.ArrayStack;

import java.util.Arrays;

/**
 * An array implementation of a stack in which the bottom of the
 * stack is fixed at index 0.
 * 
 * @author Minh Tan Nguyen
 */
public class ArrayStack<T> implements StackADT<T> {

    private final static int DEFAULT_CAPACITY = 100;
    private int top;
    private T[] stack;

    /**
     * Creates an empty stack using the default capacity.
     */
    public ArrayStack() {
        top = 0;
        stack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    /**
     * Creates an empty stack using the specified capacity.
     * @param initalCapacity the inital size of the array
     */
    public ArrayStack(int initalCapacity) {
        top = 0;
        stack = (T[]) (new Object[initalCapacity]);
    }
    
    /**
     * Adds the specified element to the top of this stack, expanding 
     * the capacity of the array if necessary.
     * @param element generic element to be pushed onto stack
     */
    @Override
    public void push(T element) {

        if (size() == stack.length) {
            expandCapacity();
        }
        stack[top] = element;
        top++;

    }

    /**
     * Removes the element at the top of this stack and returns 
     * a reference to it.
     * @return element removed from top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    @Override
    public T pop() {

        if (isEmpty()) {
            throw new EmptyCollectionException("stack");
        }

        top--;
        T result = stack[top];
        stack[top] = null;

        return result;

    }

    /**
     * Returns a reference to the element at the top of this stack.
     * @return element on top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    @Override
    public T peek() {
        
        if (isEmpty()) {
            throw new EmptyCollectionException("stack");
        }

        return stack[top-1];

    }

    /**
     * Checks if this stack is empty.
     * @return true if this stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return top == 0;
    }
   
    /**
     * Returns the current size of this stack.
     * @return the size of this stack
     */
    @Override
    public int size() {
        return top;
    }

    /**
     * Creates a new array to store the contents of this stack with twice 
     * the capacity of the old one.
     */
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length*2);
    }

    /**
     * Returns the status of this stack.
     * @return the string representation of this stack
     */
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        result.append("[");

        for (int i = 0; i < top; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(stack[i]);
        }

        result.append("]");
        return result.toString();

    }
    
}
