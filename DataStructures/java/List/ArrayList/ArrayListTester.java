package DataStructures.java.List.ArrayList;

/**
 * ArrayListTester
 * 
 * @author DeepSeek
 */
public class ArrayListTester {
    
    public static void main(String[] args) {
        
        System.out.println("=== Testing ArrayList ===\n");
        
        // Test 1: Basic operations with Integer
        System.out.println("Test 1: Basic operations with Integer");
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.println("Empty list: " + intList);
        System.out.println("Size: " + intList.size());
        System.out.println("Is empty? " + intList.isEmpty());
        
        intList.addToRear(10);
        intList.addToRear(20);
        intList.addToRear(30);
        System.out.println("After adding 10, 20, 30: " + intList);
        System.out.println("Size: " + intList.size() + "\n");
        
        // Test 2: Add to front
        System.out.println("Test 2: Add to front");
        intList.addToFront(5);
        System.out.println("After adding 5 to front: " + intList);
        System.out.println("First element: " + intList.first());
        System.out.println("Last element: " + intList.last() + "\n");
        
        // Test 3: Remove operations
        System.out.println("Test 3: Remove operations");
        System.out.println("Remove first: " + intList.removeFirst());
        System.out.println("After removing first: " + intList);
        System.out.println("Remove last: " + intList.removeLast());
        System.out.println("After removing last: " + intList);
        System.out.println("Remove element 20: " + intList.remove(Integer.valueOf(20)));
        System.out.println("After removing 20: " + intList + "\n");
        
        // Test 4: Add after
        System.out.println("Test 4: Add after");
        intList.addToRear(40);
        intList.addToRear(50);
        intList.addToRear(60);
        System.out.println("List: " + intList);
        intList.addAfter(55, 50);
        System.out.println("After adding 55 after 50: " + intList);
        System.out.println("Contains 55? " + intList.contains(55) + "\n");
        
        // Test 5: Iterator
        System.out.println("Test 5: Iterator");
        System.out.print("Iterating: ");
        for (Integer num : intList) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        // Test 6: String elements
        System.out.println("Test 6: String elements");
        ArrayList<String> strList = new ArrayList<>();
        strList.addToRear("apple");
        strList.addToRear("banana");
        strList.addToRear("cherry");
        System.out.println("String list: " + strList);
        strList.addToFront("grape");
        System.out.println("After adding grape to front: " + strList);
        strList.remove("banana");
        System.out.println("After removing banana: " + strList + "\n");
        
        // Test 7: Edge cases
        System.out.println("Test 7: Edge cases");
        ArrayList<String> emptyList = new ArrayList<>();
        System.out.println("Empty list: " + emptyList);
        System.out.println("Size: " + emptyList.size());
        System.out.println("Is empty? " + emptyList.isEmpty());
        System.out.println("Contains 'test'? " + emptyList.contains("test") + "\n");
        
        // Test 8: Exception handling
        System.out.println("Test 8: Exception handling");
        try {
            emptyList.removeFirst();
        } catch (EmptyCollectionException e) {
            System.out.println("Caught EmptyCollectionException: " + e.getMessage());
        }
        
        try {
            intList.remove(Integer.valueOf(999));
        } catch (ElementNotFoundException e) {
            System.out.println("Caught ElementNotFoundException: " + e.getMessage());
        }
        
        try {
            emptyList.first();
        } catch (EmptyCollectionException e) {
            System.out.println("Caught EmptyCollectionException on first(): " + e.getMessage());
        }
        System.out.println();
        
        // Test 9: Capacity expansion
        System.out.println("Test 9: Capacity expansion");
        ArrayList<Integer> bigList = new ArrayList<>(3);
        bigList.addToRear(1);
        bigList.addToRear(2);
        bigList.addToRear(3);
        System.out.println("List: " + bigList);
        System.out.println("Adding 4th element (should expand capacity)");
        bigList.addToRear(4);
        System.out.println("List: " + bigList + "\n");
        
        System.out.println("=== All tests completed ===");
        
    }
    
}