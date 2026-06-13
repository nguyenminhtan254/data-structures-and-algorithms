package DataStructures.java.Queue.CircularArrayQueue;

/**
 * CircularArrayQueueTester
 * 
 * @author DeepSeek
 */
public class CircularArrayQueueTester {
    
    public static void main(String[] args) {
        
        System.out.println("=== Testing Circular Array Queue ===\n");
        
        // Test 1: Basic enqueue and dequeue operations
        System.out.println("Test 1: Basic enqueue and dequeue");
        CircularArrayQueue<String> queue = new CircularArrayQueue<>(5);
        
        System.out.println("Enqueuing: A, B, C, D");
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        System.out.println("Queue: " + queue);
        System.out.println("Size: " + queue.size());
        System.out.println("Expected: [A, B, C, D], Size: 4\n");
        
        // Test 2: Dequeue operation
        System.out.println("Test 2: Dequeue operation");
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue after dequeue: " + queue);
        System.out.println("Expected: [B, C, D]\n");
        
        // Test 3: First operation (peek)
        System.out.println("Test 3: First operation (peek)");
        System.out.println("First element: " + queue.first());
        System.out.println("Expected: B");
        System.out.println("Queue unchanged: " + queue + "\n");
        
        // Test 4: Circular behavior
        System.out.println("Test 4: Circular behavior");
        queue.enqueue("E");
        queue.enqueue("F");
        System.out.println("After enqueuing E, F: " + queue);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue("G");
        queue.enqueue("H");
        System.out.println("After dequeues and enqueues: " + queue);
        System.out.println("Size: " + queue.size());
        System.out.println("Expected: [D, E, F, G, H], Size: 5\n");
        
        // Test 5: Expand capacity
        System.out.println("Test 5: Expand capacity");
        for (int i = 0; i < 3; i++) {
            queue.enqueue("X");
        }
        System.out.println("After adding 3 more elements: " + queue);
        System.out.println("Size: " + queue.size());
        System.out.println("Expected capacity doubled, queue maintains order\n");
        
        // Test 6: Empty queue
        System.out.println("Test 6: Empty queue");
        CircularArrayQueue<Integer> emptyQueue = new CircularArrayQueue<>();
        System.out.println("Is empty? " + emptyQueue.isEmpty());
        System.out.println("Expected: true\n");
        
        // Test 7: Exception handling
        System.out.println("Test 7: Exception handling");
        System.out.println("Trying to dequeue from empty queue...");
        try {
            emptyQueue.dequeue();
        } catch (EmptyCollectionException e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Expected: The queue is empty.\n");
        }
        
        // Test 8: Complete cycle
        System.out.println("Test 8: Complete cycle test");
        CircularArrayQueue<Integer> cycleQueue = new CircularArrayQueue<>(3);
        System.out.println("Queue capacity: 3");
        
        for (int i = 1; i <= 3; i++) {
            cycleQueue.enqueue(i);
        }
        System.out.println("After enqueue 1,2,3: " + cycleQueue);
        
        cycleQueue.dequeue();
        cycleQueue.dequeue();
        System.out.println("After two dequeues: " + cycleQueue);
        
        cycleQueue.enqueue(4);
        cycleQueue.enqueue(5);
        System.out.println("After enqueue 4,5: " + cycleQueue);
        System.out.println("Expected: [3, 4, 5]\n");
        
        // Test 9: Clear all elements
        System.out.println("Test 9: Clear all elements");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println("\nQueue is empty: " + queue.isEmpty());
        System.out.println("Size: " + queue.size() + "\n");
        
        System.out.println("=== All tests completed ===");
    }
}