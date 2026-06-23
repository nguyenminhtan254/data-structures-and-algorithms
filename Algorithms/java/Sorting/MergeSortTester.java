package Algorithms.java.Sorting;

/**
 * MergeSortTester
 * 
 * @author DeepSeek
 */
public class MergeSortTester {
    
    public static void main(String[] args) {
        
        System.out.println("=== Testing Merge Sort ===\n");
        
        // Test 1: Integer array
        System.out.println("Test 1: Sort integer array");
        Integer[] intArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Original: ");
        printArray(intArray);
        MergeSort.mergeSort(intArray);
        System.out.print("Sorted:   ");
        printArray(intArray);
        System.out.println("Expected: [11, 12, 22, 25, 34, 64, 90]\n");
        
        // Test 2: Already sorted array
        System.out.println("Test 2: Sort already sorted array");
        Integer[] sortedArray = {1, 2, 3, 4, 5};
        System.out.print("Original: ");
        printArray(sortedArray);
        MergeSort.mergeSort(sortedArray);
        System.out.print("Sorted:   ");
        printArray(sortedArray);
        System.out.println("Expected: [1, 2, 3, 4, 5]\n");
        
        // Test 3: Reverse sorted array
        System.out.println("Test 3: Sort reverse sorted array");
        Integer[] reverseArray = {9, 8, 7, 6, 5, 4};
        System.out.print("Original: ");
        printArray(reverseArray);
        MergeSort.mergeSort(reverseArray);
        System.out.print("Sorted:   ");
        printArray(reverseArray);
        System.out.println("Expected: [4, 5, 6, 7, 8, 9]\n");
        
        // Test 4: String array
        System.out.println("Test 4: Sort string array");
        String[] strArray = {"banana", "apple", "cherry", "date", "elderberry"};
        System.out.print("Original: ");
        printArray(strArray);
        MergeSort.mergeSort(strArray);
        System.out.print("Sorted:   ");
        printArray(strArray);
        System.out.println("Expected: [apple, banana, cherry, date, elderberry]\n");
        
        // Test 5: Array with duplicates
        System.out.println("Test 5: Sort array with duplicates");
        Integer[] dupArray = {5, 2, 8, 2, 9, 1, 5, 5};
        System.out.print("Original: ");
        printArray(dupArray);
        MergeSort.mergeSort(dupArray);
        System.out.print("Sorted:   ");
        printArray(dupArray);
        System.out.println("Expected: [1, 2, 2, 5, 5, 5, 8, 9]\n");
        
        // Test 6: Single element array
        System.out.println("Test 6: Sort single element array");
        Integer[] singleArray = {42};
        System.out.print("Original: ");
        printArray(singleArray);
        MergeSort.mergeSort(singleArray);
        System.out.print("Sorted:   ");
        printArray(singleArray);
        System.out.println("Expected: [42]\n");
        
        // Test 7: Empty array
        System.out.println("Test 7: Sort empty array");
        Integer[] emptyArray = {};
        System.out.print("Original: ");
        printArray(emptyArray);
        MergeSort.mergeSort(emptyArray);
        System.out.print("Sorted:   ");
        printArray(emptyArray);
        System.out.println("Expected: []\n");
        
        // Test 8: Two element array
        System.out.println("Test 8: Sort two element array");
        Integer[] twoArray = {5, 2};
        System.out.print("Original: ");
        printArray(twoArray);
        MergeSort.mergeSort(twoArray);
        System.out.print("Sorted:   ");
        printArray(twoArray);
        System.out.println("Expected: [2, 5]\n");
        
        System.out.println("=== All tests completed ===");
    }
    
    /**
     * Helper method to print array elements
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