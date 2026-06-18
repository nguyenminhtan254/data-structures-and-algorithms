package Algorithms.java.Sorting;

/**
 * QuickSortTester
 * 
 * @author DeepSeek
 */
public class QuickSortTester {
    
    public static void main(String[] args) {
        
        System.out.println("=== Testing Quick Sort ===\n");
        
        // Test 1: Integer array
        System.out.println("Test 1: Sort integer array");
        Integer[] intArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Before: ");
        printArray(intArray);
        QuickSort.quickSort(intArray);
        System.out.print("After:  ");
        printArray(intArray);
        System.out.println("Expected: [11, 12, 22, 25, 34, 64, 90]\n");
        
        // Test 2: String array
        System.out.println("Test 2: Sort string array");
        String[] strArray = {"banana", "apple", "date", "cherry", "elderberry"};
        System.out.print("Before: ");
        printArray(strArray);
        QuickSort.quickSort(strArray);
        System.out.print("After:  ");
        printArray(strArray);
        System.out.println("Expected: [apple, banana, cherry, date, elderberry]\n");
        
        // Test 3: Already sorted array
        System.out.println("Test 3: Sort already sorted array");
        Integer[] sortedArray = {1, 2, 3, 4, 5, 6};
        System.out.print("Before: ");
        printArray(sortedArray);
        QuickSort.quickSort(sortedArray);
        System.out.print("After:  ");
        printArray(sortedArray);
        System.out.println("Expected: [1, 2, 3, 4, 5, 6]\n");
        
        // Test 4: Reverse sorted array
        System.out.println("Test 4: Sort reverse sorted array");
        Integer[] reverseArray = {9, 8, 7, 6, 5, 4};
        System.out.print("Before: ");
        printArray(reverseArray);
        QuickSort.quickSort(reverseArray);
        System.out.print("After:  ");
        printArray(reverseArray);
        System.out.println("Expected: [4, 5, 6, 7, 8, 9]\n");
        
        // Test 5: Array with duplicates
        System.out.println("Test 5: Sort array with duplicates");
        Integer[] dupArray = {5, 2, 8, 2, 9, 1, 5, 5};
        System.out.print("Before: ");
        printArray(dupArray);
        QuickSort.quickSort(dupArray);
        System.out.print("After:  ");
        printArray(dupArray);
        System.out.println("Expected: [1, 2, 2, 5, 5, 5, 8, 9]\n");
        
        // Test 6: Single element array
        System.out.println("Test 6: Sort single element array");
        Integer[] singleArray = {42};
        System.out.print("Before: ");
        printArray(singleArray);
        QuickSort.quickSort(singleArray);
        System.out.print("After:  ");
        printArray(singleArray);
        System.out.println("Expected: [42]\n");
        
        // Test 7: Empty array
        System.out.println("Test 7: Sort empty array");
        Integer[] emptyArray = {};
        System.out.print("Before: ");
        printArray(emptyArray);
        QuickSort.quickSort(emptyArray);
        System.out.print("After:  ");
        printArray(emptyArray);
        System.out.println("Expected: []\n");
        
        System.out.println("=== All tests completed ===");
    }
    
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