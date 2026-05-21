package DataStructures.java.Stack.ArrayStack;

/**
 * ArrayStackTester
 * 
 * @author DeepSeek
 */
public class ArrayStackTester {
    
    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<>();

        System.out.println("=== Testing ArrayStack ===\n");
        
        // Test 1: Push elements
        System.out.println("Test 1: Pushing elements");
        stack.push(5);
        stack.push(45);
        stack.push(31);
        stack.push(97);
        stack.push(99);
        stack.push(76);
        System.out.println("Stack after pushes: " + stack);
        System.out.println("Expected: [5, 45, 31, 97, 99, 76]\n");
        
        // Test 2: Peek at top
        System.out.println("Test 2: Peek at top element");
        System.out.println("Top element: " + stack.peek());
        System.out.println("Expected: 76\n");
        
        // Test 3: Pop elements
        System.out.println("Test 3: Popping elements");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pops: " + stack);
        System.out.println("Expected: [5, 45, 31, 97]\n");
        
        // Test 4: Peek again
        System.out.println("Test 4: Peek after pops");
        System.out.println("Top element: " + stack.peek());
        System.out.println("Expected: 97\n");
        
        // Test 5: Check size
        System.out.println("Test 5: Check stack size");
        System.out.println("Current size: " + stack.size());
        System.out.println("Expected: 4\n");
        
        // Test 6: Check if empty
        System.out.println("Test 6: Check if empty");
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Expected: false\n");
        
        // Test 7: Push more elements (testing dynamic resizing)
        System.out.println("Test 7: Push more elements (testing resize)");
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("Stack after pushing 10 more elements: " + stack);
        System.out.println("Size: " + stack.size());
        System.out.println();
        
        // Test 8: Pop everything
        System.out.println("Test 8: Pop all elements");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\nStack after popping all: " + stack);
        System.out.println("Is empty? " + stack.isEmpty());
        System.out.println();
        
        // Test 9: Edge cases - popping from empty stack
        System.out.println("Test 9: Edge case - pop from empty stack");
        try {
            stack.pop();
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        System.out.println();
        
        // Test 10: Edge cases - peeking empty stack
        System.out.println("Test 10: Edge case - peek at empty stack");
        try {
            stack.peek();
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        
        System.out.println("\n=== All tests completed ===");
        
    }

}