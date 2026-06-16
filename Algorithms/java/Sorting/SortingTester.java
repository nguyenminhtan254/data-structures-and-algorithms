package Algorithms.java.Sorting;

/**
 * SortingTester
 * 
 * @author DeepSeek
 */
public class SortingTester {
    
    public static void main(String[] args) {
        
        System.out.println("=== Testing Selection Sort ===\n");
        
        // Test 1: Integer array
        System.out.println("Test 1: Sort integer array");
        Integer[] intArray = {64, 25, 12, 22, 11};
        System.out.print("Before: ");
        printArray(intArray);
        Sorting.selectionSort(intArray);
        System.out.print("After:  ");
        printArray(intArray);
        System.out.println("Expected: [11, 12, 22, 25, 64]\n");
        
        // Test 2: Already sorted array
        System.out.println("Test 2: Already sorted array");
        Integer[] sortedArray = {1, 2, 3, 4, 5};
        System.out.print("Before: ");
        printArray(sortedArray);
        Sorting.selectionSort(sortedArray);
        System.out.print("After:  ");
        printArray(sortedArray);
        System.out.println("Expected: [1, 2, 3, 4, 5]\n");
        
        // Test 3: Reverse sorted array
        System.out.println("Test 3: Reverse sorted array");
        Integer[] reverseArray = {9, 7, 5, 3, 1};
        System.out.print("Before: ");
        printArray(reverseArray);
        Sorting.selectionSort(reverseArray);
        System.out.print("After:  ");
        printArray(reverseArray);
        System.out.println("Expected: [1, 3, 5, 7, 9]\n");
        
        // Test 4: String array
        System.out.println("Test 4: Sort string array");
        String[] strArray = {"banana", "apple", "date", "cherry"};
        System.out.print("Before: ");
        printArray(strArray);
        Sorting.selectionSort(strArray);
        System.out.print("After:  ");
        printArray(strArray);
        System.out.println("Expected: [apple, banana, cherry, date]\n");
        
        // Test 5: Single element array
        System.out.println("Test 5: Single element array");
        Integer[] singleArray = {42};
        System.out.print("Before: ");
        printArray(singleArray);
        Sorting.selectionSort(singleArray);
        System.out.print("After:  ");
        printArray(singleArray);
        System.out.println("Expected: [42]\n");
        
        // Test 6: Empty array
        System.out.println("Test 6: Empty array");
        Integer[] emptyArray = {};
        System.out.print("Before: ");
        printArray(emptyArray);
        Sorting.selectionSort(emptyArray);
        System.out.print("After:  ");
        printArray(emptyArray);
        System.out.println("Expected: []\n");
        
        // Test 7: Duplicate values
        System.out.println("Test 7: Array with duplicates");
        Integer[] dupArray = {5, 2, 8, 2, 5, 1};
        System.out.print("Before: ");
        printArray(dupArray);
        Sorting.selectionSort(dupArray);
        System.out.print("After:  ");
        printArray(dupArray);
        System.out.println("Expected: [1, 2, 2, 5, 5, 8]\n");
        
        System.out.println("=== All tests completed ===");
    }
    
    /**
     * Helper method to print array
     */
    private static <T> void printArray(T[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}