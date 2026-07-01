package DataStructures.java.List.SinglyLinkedList;

/**
 * SinglyLinkedListTester
 * 
 * @author DeepSeek
 */
public class SinglyLinkedListTester {
    
    public static void main(String[] args) {
        
        System.out.println("=== Testing SinglyLinkedList ===\n");
        
        // Test 1: Add elements to front and rear
        System.out.println("Test 1: Adding elements to front and rear");
        SinglyLinkedList<String> list1 = new SinglyLinkedList<>();
        list1.addToFront("First");
        list1.addToRear("Last");
        list1.addToFront("New First");
        System.out.println("List: " + list1);
        System.out.println("Expected: [New First, First, Last]");
        System.out.println("Size: " + list1.size() + " (Expected: 3)\n");
        
        // Test 2: Remove first element
        System.out.println("Test 2: Remove first element");
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
        list2.addToRear(10);
        list2.addToRear(20);
        list2.addToRear(30);
        System.out.println("Before: " + list2);
        int removedFirst = list2.removeFirst();
        System.out.println("Removed: " + removedFirst + " (Expected: 10)");
        System.out.println("After: " + list2);
        System.out.println("Expected: [20, 30]\n");
        
        // Test 3: Remove last element
        System.out.println("Test 3: Remove last element");
        SinglyLinkedList<String> list3 = new SinglyLinkedList<>();
        list3.addToRear("A");
        list3.addToRear("B");
        list3.addToRear("C");
        System.out.println("Before: " + list3);
        String removedLast = list3.removeLast();
        System.out.println("Removed: " + removedLast + " (Expected: C)");
        System.out.println("After: " + list3);
        System.out.println("Expected: [A, B]\n");
        
        // Test 4: Remove specific element
        System.out.println("Test 4: Remove specific element");
        SinglyLinkedList<Integer> list4 = new SinglyLinkedList<>();
        list4.addToRear(5);
        list4.addToRear(10);
        list4.addToRear(15);
        list4.addToRear(20);
        System.out.println("Before: " + list4);
        int removed = list4.remove(Integer.valueOf(15));
        System.out.println("Removed: " + removed + " (Expected: 15)");
        System.out.println("After: " + list4);
        System.out.println("Expected: [5, 10, 20]\n");
        
        // Test 5: First and last methods
        System.out.println("Test 5: First and last elements");
        SinglyLinkedList<String> list5 = new SinglyLinkedList<>();
        list5.addToRear("Alpha");
        list5.addToRear("Beta");
        list5.addToRear("Gamma");
        System.out.println("List: " + list5);
        System.out.println("First: " + list5.first() + " (Expected: Alpha)");
        System.out.println("Last: " + list5.last() + " (Expected: Gamma)\n");
        
        // Test 6: Contains method
        System.out.println("Test 6: Contains method");
        SinglyLinkedList<String> list6 = new SinglyLinkedList<>();
        list6.addToRear("Cat");
        list6.addToRear("Dog");
        list6.addToRear("Bird");
        System.out.println("List: " + list6);
        System.out.println("Contains 'Dog': " + list6.contains("Dog") + " (Expected: true)");
        System.out.println("Contains 'Fish': " + list6.contains("Fish") + " (Expected: false)\n");
        
        // Test 7: Add after specific element
        System.out.println("Test 7: Add after specific element");
        SinglyLinkedList<Integer> list7 = new SinglyLinkedList<>();
        list7.addToRear(1);
        list7.addToRear(2);
        list7.addToRear(4);
        System.out.println("Before: " + list7);
        list7.addAfter(3, 2);
        System.out.println("After adding 3 after 2: " + list7);
        System.out.println("Expected: [1, 2, 3, 4]\n");
        
        // Test 8: Iterator
        System.out.println("Test 8: Iterator");
        SinglyLinkedList<String> list8 = new SinglyLinkedList<>();
        list8.addToRear("One");
        list8.addToRear("Two");
        list8.addToRear("Three");
        System.out.print("Iterating: ");
        for (String element : list8) {
            System.out.print(element + " ");
        }
        System.out.println("\nExpected: One Two Three \n");
        
        // Test 9: Empty list edge cases
        System.out.println("Test 9: Edge cases - empty list");
        SinglyLinkedList<String> emptyList = new SinglyLinkedList<>();
        System.out.println("Is empty: " + emptyList.isEmpty() + " (Expected: true)");
        System.out.println("Size: " + emptyList.size() + " (Expected: 0)");
        System.out.println("Empty list: " + emptyList + " (Expected: [])");
        
        // Test 10: Single element list
        System.out.println("\nTest 10: Single element list");
        SinglyLinkedList<String> singleList = new SinglyLinkedList<>();
        singleList.addToFront("Only");
        System.out.println("List: " + singleList);
        singleList.removeFirst();
        System.out.println("After removing first: " + singleList + " (Expected: [])");
        System.out.println("Is empty: " + singleList.isEmpty() + " (Expected: true)\n");
        
        // Test 11: Exception handling - remove from empty list
        System.out.println("Test 11: Exception handling");
        SinglyLinkedList<String> exceptionList = new SinglyLinkedList<>();
        try {
            exceptionList.removeFirst();
        } catch (EmptyCollectionException e) {
            System.out.println("Correctly caught: " + e.getMessage());
        }
        
        try {
            exceptionList.remove("Test");
        } catch (EmptyCollectionException e) {
            System.out.println("Correctly caught: " + e.getMessage());
        }
        
        try {
            SinglyLinkedList<String> list11 = new SinglyLinkedList<>();
            list11.addToRear("Hello");
            list11.remove("Goodbye");
        } catch (ElementNotFoundException e) {
            System.out.println("Correctly caught: " + e.getMessage());
        }
        
        System.out.println("\n=== All tests completed ===");
    }
}