package Algorithms.java.Sorting;

/**
 * A sorting utility contains multiple methods. And each method is a sorting
 * algorithm which
 * sorts a list of values in ascending order.
 * 
 * @author Minh Tan Nguyen
 */
public class Sorting {

    /**
     * Sorts the specified array of integers using the selection
     * sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void selectionSort(T[] data) {

        int min;

        for (int index = 0; index < data.length; index++) {

            min = index;
            for (int scan = index+1; scan < data.length; scan++) {
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }
            }

            if (min != index) {
                swap(data, index, min);
            }

        }

    }

    /**
     * Swaps to elements in an array. Used by various sorting algorithms.
     *
     * @param data   the array in which the elements are swapped
     * @param index1 the index of the first element to be swapped
     * @param index2 the index of the second element to be swapped
     */
    public static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

}
