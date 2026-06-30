package DataStructures.java.List.SinglyLinkedList;

/**
 * Represents the situation in which an element is not found.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class ElementNotFoundException extends RuntimeException {

    /**
     * Default constructor.
     */
    public ElementNotFoundException() {
        super();
    }

    /**
     * Sets up this exception with an appropriate message.
     * @param collection the name of the collection
     */
    public ElementNotFoundException(String collection) {
        super("The " + collection + " does not contain the specified element.");
    }

}
