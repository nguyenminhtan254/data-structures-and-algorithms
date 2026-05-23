package Algorithms.java.Searching;

/**
 * A searching utility contains multiple methods. And each method is a searching algorithm which 
 * finds a target element within a search pool.
 * 
 * @author Minh Tan Nguyen
 */
public class Searching {
    
    /**
     * Searches the specified array of objects using a linear search algorithm.
     * @param <T> the type of elements
     * @param data the array to be searched
     * @param target the element being searched for
     * @return true if the desired element is found
     */
    public static <T extends Comparable<T>> boolean linearSearch(T[] data, T target) {

        boolean found = false;

        for (T element : data) {
            if (element.compareTo(target) == 0) {
                found = true;
                break;
            }
        }

        return found;

    }

    /**
     * Searchs the specifed array of objects using a linear search algorithm.
     * @param <T> the type of elements
     * @param data the array to be searched
     * @param min the location of minimum value
     * @param max the location of maximum value
     * @param target the element being searched for
     * @return true if the desired element is found
     */
    public static <T> boolean linearSearch(T[] data, int min, int max, T target) {
        
        int index = min;
        boolean found = false;

        while (!found && index <= max) {
            found = data[index].equals(target);
            index++;
        }

        return found;

    }

    /**
     * Searches the specified array of objects using a binary search algorithm.
     * @param <T> the type of elements
     * @param data the array to be searched
     * @param target the element being searched for
     * @return true if the desired element is found
     */
    public static <T extends Comparable<T>> boolean binarySearch(T[] data, T target) {

        boolean found = false;
        int min = 0;
        int max = data.length - 1;

        while (min <= max) {
            
            int midpoint = (min + max) / 2;

            if (data[midpoint].compareTo(target) == 0) {
                found = true;
                break;
            } else if (data[midpoint].compareTo(target) > 0) {
                max = midpoint - 1;
            } else {
                min = midpoint + 1;
            }

        }

        return found;

    }

    /**
     * Searches the specified array of objects using a binary search algorithm.
     * @param <T> the type of elements
     * @param data the array to be searched
     * @param min the location of minimum value
     * @param max the location of maximum value
     * @param target the element being searched for
     * @return true if the desired element is found
     */
    public static <T extends Comparable<T>> boolean binarySearch(T[] data, int min, int max, T target) {

        boolean found = false;
        int midpoint = (min + max) / 2;

        if (min <= max) {
            
            if (data[midpoint].compareTo(target) == 0) {
                found = true;
            } else if (data[midpoint].compareTo(target) > 0) {
                found = binarySearch(data, min, midpoint - 1, target);
            } else {
                found = binarySearch(data, midpoint + 1, max, target);
            }

        }

        return found;

    }

}
