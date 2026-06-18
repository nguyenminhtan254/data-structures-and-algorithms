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
            for (int scan = index + 1; scan < data.length; scan++) {
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
     * Sorts the specified array of objects using an insertion
     * sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void insertionSort(T[] data) {

        for (int index = 1; index < data.length; index++) {
            T key = data[index];
            int position = index;

            while (position > 0 && data[position - 1].compareTo(key) > 0) {
                data[position] = data[position - 1];
                position--;
            }

            data[position] = key;
        }

    }

    /**
     * Sorts the specified array of objects using a bubble sort
     * algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] data) {

        for (int index = data.length - 1; index > 0; index--) {

            boolean swapped = false;

            for (int scan = 0; scan < index; scan++) {

                if (data[scan].compareTo(data[scan + 1]) > 0) {
                    swap(data, scan, scan + 1);
                    swapped = true;
                }

            }

            if (!swapped) {
                break;
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
    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

}
