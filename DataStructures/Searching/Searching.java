package DataStructures.Searching;

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

}
