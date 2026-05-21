package Algorithms.java.Searching;

/**
 * LinearSearchTester
 * 
 * @author DeepSeek
 */
public class LinearSearchTester {
    
    public static void main(String[] args) {
        
        System.out.println("=== Testing Linear Search ===\n");
        
        // Test 1: Integer array with full array search
        System.out.println("Test 1: Search integer array (full array)");
        Integer[] intArray = {10, 20, 30, 40, 50, 60};
        System.out.println("Array: [10, 20, 30, 40, 50, 60]");
        System.out.println("Searching for 30: " + Searching.linearSearch(intArray, 30));
        System.out.println("Expected: true");
        System.out.println("Searching for 100: " + Searching.linearSearch(intArray, 100));
        System.out.println("Expected: false\n");
        
        // Test 2: String array with full array search
        System.out.println("Test 2: Search string array (full array)");
        String[] strArray = {"apple", "banana", "cherry", "date"};
        System.out.println("Array: [apple, banana, cherry, date]");
        System.out.println("Searching for 'banana': " + Searching.linearSearch(strArray, "banana"));
        System.out.println("Expected: true");
        System.out.println("Searching for 'grape': " + Searching.linearSearch(strArray, "grape"));
        System.out.println("Expected: false\n");
        
        // Test 3: Search within range (min, max)
        System.out.println("Test 3: Search within range (min=1, max=3)");
        Integer[] rangeArray = {5, 15, 25, 35, 45, 55};
        System.out.println("Array: [5, 15, 25, 35, 45, 55]");
        System.out.println("Searching for 25 (index 2): " + Searching.linearSearch(rangeArray, 1, 3, 25));
        System.out.println("Expected: true");
        System.out.println("Searching for 5 (index 0): " + Searching.linearSearch(rangeArray, 1, 3, 5));
        System.out.println("Expected: false");
        System.out.println("Searching for 45 (index 4): " + Searching.linearSearch(rangeArray, 1, 3, 45));
        System.out.println("Expected: false\n");
        
        // Test 4: Edge cases - empty array
        System.out.println("Test 4: Edge case - empty array");
        Integer[] emptyArray = {};
        System.out.println("Empty array search: " + Searching.linearSearch(emptyArray, 10));
        System.out.println("Expected: false\n");
        
        // Test 5: Single element array
        System.out.println("Test 5: Single element array");
        Integer[] singleArray = {42};
        System.out.println("Array: [42]");
        System.out.println("Searching for 42: " + Searching.linearSearch(singleArray, 42));
        System.out.println("Expected: true");
        System.out.println("Searching for 7: " + Searching.linearSearch(singleArray, 7));
        System.out.println("Expected: false\n");
        
        System.out.println("=== All tests completed ===");
        
    }
    
}