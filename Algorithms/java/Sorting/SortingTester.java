package Algorithms.java.Sorting;

/**
 * SortingTester
 * 
 * @author DeepSeek
 */
public class SortingTester {
    
    public static void main(String[] args) {
        
        System.out.println("=== Testing Sorting Algorithms ===\n");
        
        // Test 1: Selection Sort with integers
        System.out.println("Test 1: Selection Sort - Integer array");
        Integer[] intArray1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Original: ");
        printArray(intArray1);
        Sorting.selectionSort(intArray1);
        System.out.print("Sorted:   ");
        printArray(intArray1);
        System.out.println("Expected: [11, 12, 22, 25, 34, 64, 90]\n");
        
        // Test 2: Selection Sort with strings
        System.out.println("Test 2: Selection Sort - String array");
        String[] strArray1 = {"banana", "apple", "cherry", "date", "fig"};
        System.out.print("Original: ");
        printArray(strArray1);
        Sorting.selectionSort(strArray1);
        System.out.print("Sorted:   ");
        printArray(strArray1);
        System.out.println("Expected: [apple, banana, cherry, date, fig]\n");
        
        // Test 3: Insertion Sort with integers
        System.out.println("Test 3: Insertion Sort - Integer array");
        Integer[] intArray2 = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Original: ");
        printArray(intArray2);
        Sorting.insertionSort(intArray2);
        System.out.print("Sorted:   ");
        printArray(intArray2);
        System.out.println("Expected: [11, 12, 22, 25, 34, 64, 90]\n");
        
        // Test 4: Insertion Sort with strings
        System.out.println("Test 4: Insertion Sort - String array");
        String[] strArray2 = {"banana", "apple", "cherry", "date", "fig"};
        System.out.print("Original: ");
        printArray(strArray2);
        Sorting.insertionSort(strArray2);
        System.out.print("Sorted:   ");
        printArray(strArray2);
        System.out.println("Expected: [apple, banana, cherry, date, fig]\n");
        
        // Test 5: Bubble Sort with integers
        System.out.println("Test 5: Bubble Sort - Integer array");
        Integer[] intArray3 = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Original: ");
        printArray(intArray3);
        Sorting.bubbleSort(intArray3);
        System.out.print("Sorted:   ");
        printArray(intArray3);
        System.out.println("Expected: [11, 12, 22, 25, 34, 64, 90]\n");
        
        // Test 6: Bubble Sort with strings
        System.out.println("Test 6: Bubble Sort - String array");
        String[] strArray3 = {"banana", "apple", "cherry", "date", "fig"};
        System.out.print("Original: ");
        printArray(strArray3);
        Sorting.bubbleSort(strArray3);
        System.out.print("Sorted:   ");
        printArray(strArray3);
        System.out.println("Expected: [apple, banana, cherry, date, fig]\n");
        
        // Test 7: Edge case - empty array
        System.out.println("Test 7: Edge case - empty array");
        Integer[] emptyArray = {};
        System.out.print("Original: ");
        printArray(emptyArray);
        Sorting.selectionSort(emptyArray);
        System.out.print("Sorted:   ");
        printArray(emptyArray);
        System.out.println("Expected: []\n");
        
        // Test 8: Edge case - single element
        System.out.println("Test 8: Edge case - single element array");
        Integer[] singleArray = {42};
        System.out.print("Original: ");
        printArray(singleArray);
        Sorting.selectionSort(singleArray);
        System.out.print("Sorted:   ");
        printArray(singleArray);
        System.out.println("Expected: [42]\n");
        
        // Test 9: Already sorted array (should still work)
        System.out.println("Test 9: Already sorted array");
        Integer[] sortedArray = {10, 20, 30, 40, 50};
        System.out.print("Original: ");
        printArray(sortedArray);
        Sorting.bubbleSort(sortedArray);
        System.out.print("Sorted:   ");
        printArray(sortedArray);
        System.out.println("Expected: [10, 20, 30, 40, 50]\n");
        
        // Test 10: Reverse sorted array
        System.out.println("Test 10: Reverse sorted array");
        Integer[] reverseArray = {50, 40, 30, 20, 10};
        System.out.print("Original: ");
        printArray(reverseArray);
        Sorting.insertionSort(reverseArray);
        System.out.print("Sorted:   ");
        printArray(reverseArray);
        System.out.println("Expected: [10, 20, 30, 40, 50]\n");
        
        System.out.println("=== All tests completed ===");
    }
    
    /**
     * Helper method to print an array nicely
     */
    public static <T> void printArray(T[] array) {
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