package Algorithms.java.Sorting;

/**
 * The quick sort algorithm sorts a list by partitioning the list 
 * and then recursively sorting the two partitions.
 * 
 * @author Minh Tan Nguyen
 */
public class QuickSort {

    /**
     * Sorts the specified array of objects using the quick sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void quickSort(T[] data) {
        quickSort(data, 0, data.length - 1);
    }

    /**
     * Recursively sorts a range of objects in the specified array using the
     * quick sort algorithm.
     *
     * @param data the array to be sorted
     * @param min  the minimum index in the range to be sorted
     * @param max  the maximum index in the range to be sorted
     */
    private static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {

        if (min < max) {

            // Create partitions around pivot element
            int pivot = partition(data, min, max);

            // Sort the left partition recursively
            quickSort(data, min, pivot - 1);

            // Sort the right partition recursively
            quickSort(data, pivot + 1, max);

        }

    }

    /**
     * Used by the quick sort algorithm to find the partition.
     *
     * @param data the array to be sorted
     * @param min  the minimum index in the range to be sorted
     * @param max  the maximum index in the range to be sorted
     */
    private static <T extends Comparable<T>> int partition(T[] data, int min, int max) {

        int left = min;
        int right = max;
        int middle = (min + max) / 2;

        // Use the middle data value as the pivot and swap to the beginning of the list
        T pivot = data[middle];
        swap(data, min, middle);

        while (left < right) {

            // Search for an element that is > the pivot
            while (left < right && data[left].compareTo(pivot) <= 0) {
                left++;
            }

            // Search for an element that is < the pivot
            while (data[right].compareTo(pivot) > 0) {
                right--;
            }

            // Swap the elements
            if (left < right) {
                swap(data, left, right);
            }

        }

        // Move the pivot into the proper place, and return its index
        swap(data, min, right);
        return right;

    }

    /**
     * Swaps to elements in an array.
     *
     * @param data   the array in which the elements are swapped
     * @param index1 the index of the first element to be swapped
     * @param index2 the index of the second element to be swapped
     */
    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

}
