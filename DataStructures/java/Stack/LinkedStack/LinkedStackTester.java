package DataStructures.java.Stack.LinkedStack;

/**
 * LinkedStackTester
 * 
 * @author DeepSeek
 */
public class LinkedStackTester {
    
    public static void main(String[] args) {
        
        System.out.println("=== Testing LinkedStack ===\n");
        
        // Test 1: Push and peek on integer stack
        System.out.println("Test 1: Push and peek on integer stack");
        LinkedStack<Integer> intStack = new LinkedStack<>();
        System.out.println("Empty stack: " + intStack.isEmpty());
        System.out.println("Expected: true");
        System.out.println("Size: " + intStack.size());
        System.out.println("Expected: 0\n");
        
        // Test 2: Push elements and check size
        System.out.println("Test 2: Push elements and check size");
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        System.out.println("Pushed: 10, 20, 30");
        System.out.println("Size: " + intStack.size());
        System.out.println("Expected: 3");
        System.out.println("Is empty: " + intStack.isEmpty());
        System.out.println("Expected: false\n");
        
        // Test 3: Peek at top element
        System.out.println("Test 3: Peek at top element");
        System.out.println("Top element: " + intStack.peek());
        System.out.println("Expected: 30");
        System.out.println("Size after peek: " + intStack.size());
        System.out.println("Expected: 3 (size unchanged)\n");
        
        // Test 4: Pop elements (LIFO order)
        System.out.println("Test 4: Pop elements (LIFO order)");
        System.out.println("Popped: " + intStack.pop());
        System.out.println("Expected: 30");
        System.out.println("Popped: " + intStack.pop());
        System.out.println("Expected: 20");
        System.out.println("Size after pops: " + intStack.size());
        System.out.println("Expected: 1");
        System.out.println("Remaining element: " + intStack.peek());
        System.out.println("Expected: 10\n");
        
        // Test 5: String stack
        System.out.println("Test 5: String stack test");
        LinkedStack<String> stringStack = new LinkedStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("!");
        System.out.println("Pushed: Hello, World, !");
        System.out.println("Size: " + stringStack.size());
        System.out.println("Expected: 3");
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Expected: !");
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Expected: World");
        System.out.println("Remaining: " + stringStack.peek());
        System.out.println("Expected: Hello\n");
        
        // Test 6: Edge case - pop from empty stack
        System.out.println("Test 6: Edge case - pop from empty stack");
        LinkedStack<Integer> emptyStack = new LinkedStack<>();
        System.out.println("Attempting to pop from empty stack...");
        try {
            emptyStack.pop();
            System.out.println("ERROR: Should have thrown EmptyCollectionException");
        } catch (EmptyCollectionException e) {
            System.out.println("✓ Caught EmptyCollectionException as expected");
            System.out.println("Exception message: " + e.getMessage());
        }
        System.out.println();
        
        // Test 7: Edge case - peek from empty stack
        System.out.println("Test 7: Edge case - peek from empty stack");
        System.out.println("Attempting to peek at empty stack...");
        try {
            emptyStack.peek();
            System.out.println("ERROR: Should have thrown EmptyCollectionException");
        } catch (EmptyCollectionException e) {
            System.out.println("✓ Caught EmptyCollectionException as expected");
            System.out.println("Exception message: " + e.getMessage());
        }
        System.out.println();
        
        // Test 8: Push after pop
        System.out.println("Test 8: Push after pop");
        LinkedStack<String> reusingStack = new LinkedStack<>();
        reusingStack.push("A");
        reusingStack.push("B");
        System.out.println("Pushed A, B");
        System.out.println("Pop: " + reusingStack.pop());
        System.out.println("Expected: B");
        reusingStack.push("C");
        System.out.println("Pushed C");
        System.out.println("Top: " + reusingStack.peek());
        System.out.println("Expected: C");
        System.out.println("Pop: " + reusingStack.pop());
        System.out.println("Expected: C");
        System.out.println("Pop: " + reusingStack.pop());
        System.out.println("Expected: A\n");
        
        System.out.println("=== All tests completed ===");
    }
}