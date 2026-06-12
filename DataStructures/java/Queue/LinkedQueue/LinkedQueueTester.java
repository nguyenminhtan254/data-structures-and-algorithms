package DataStructures.java.Queue.LinkedQueue;

/**
 * LinkedQueueTester
 * 
 * @author DeepSeek
 */
public class LinkedQueueTester {
    
    public static void main(String[] args) {
        
        System.out.println("=== Testing LinkedQueue ===\n");
        
        // Test 1: Basic enqueue and dequeue operations
        System.out.println("Test 1: Basic enqueue and dequeue");
        LinkedQueue<String> queue = new LinkedQueue<>();
        System.out.println("Queue created, isEmpty(): " + queue.isEmpty());
        System.out.println("Expected: true");
        System.out.println("Size: " + queue.size());
        System.out.println("Expected: 0\n");
        
        // Test 2: Enqueue elements
        System.out.println("Test 2: Enqueue elements");
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");
        System.out.println("Queue: " + queue.toString());
        System.out.println("Size: " + queue.size());
        System.out.println("Expected size: 3");
        System.out.println("isEmpty(): " + queue.isEmpty());
        System.out.println("Expected: false\n");
        
        // Test 3: first() method (peek without removing)
        System.out.println("Test 3: first() method");
        System.out.println("First element: " + queue.first());
        System.out.println("Expected: First");
        System.out.println("Queue after first(): " + queue.toString());
        System.out.println("Expected: [First, Second, Third]");
        System.out.println("Size still: " + queue.size());
        System.out.println("Expected: 3\n");
        
        // Test 4: dequeue operations
        System.out.println("Test 4: Dequeue operations");
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Expected: First");
        System.out.println("Queue now: " + queue.toString());
        System.out.println("Expected: [Second, Third]");
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Expected: Second");
        System.out.println("Queue now: " + queue.toString());
        System.out.println("Expected: [Third]");
        System.out.println("Size: " + queue.size());
        System.out.println("Expected: 1\n");
        
        // Test 5: FIFO order verification
        System.out.println("Test 5: FIFO order verification");
        LinkedQueue<Integer> intQueue = new LinkedQueue<>();
        for (int i = 1; i <= 5; i++) {
            intQueue.enqueue(i);
        }
        System.out.println("Enqueued 1,2,3,4,5");
        System.out.print("Dequeue order: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(intQueue.dequeue());
            if (i < 4) System.out.print(", ");
        }
        System.out.println("\nExpected: 1, 2, 3, 4, 5\n");
        
        // Test 6: Edge case - dequeue from empty queue
        System.out.println("Test 6: Empty queue exception handling");
        LinkedQueue<String> emptyQueue = new LinkedQueue<>();
        System.out.println("Created empty queue");
        System.out.println("Attempting to dequeue from empty queue...");
        try {
            emptyQueue.dequeue();
            System.out.println("ERROR: Should have thrown EmptyCollectionException");
        } catch (EmptyCollectionException e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Expected exception - GOOD\n");
        }
        
        // Test 7: Edge case - first() on empty queue
        System.out.println("Test 7: first() on empty queue");
        try {
            emptyQueue.first();
            System.out.println("ERROR: Should have thrown EmptyCollectionException");
        } catch (EmptyCollectionException e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Expected exception - GOOD\n");
        }
        
        // Test 8: Multiple operations interleaved
        System.out.println("Test 8: Mixed operations");
        LinkedQueue<Character> charQueue = new LinkedQueue<>();
        charQueue.enqueue('A');
        charQueue.enqueue('B');
        System.out.println("Enqueued A, B");
        System.out.println("Dequeued: " + charQueue.dequeue());
        charQueue.enqueue('C');
        charQueue.enqueue('D');
        System.out.println("Enqueued C, D");
        System.out.println("Dequeued: " + charQueue.dequeue());
        System.out.println("Queue now: " + charQueue.toString());
        System.out.println("Expected: [C, D]");
        System.out.println("First element: " + charQueue.first());
        System.out.println("Expected: C\n");
        
        System.out.println("=== All tests completed ===");
    }
}