package DataStructures.java.Tree.BinarySearchTree;

/**
 * LinkedBinarySearchTree implements the BinarySearchTreeADT interface.
 * 
 * @author Minh Tan Nguyen
 */
public class LinkedBinarySearchTree<T extends Comparable<T>> extends LinkedBinaryTree<T>
        implements BinarySearchTreeADT<T> {

    protected BinaryTreeNode<T> root;
    protected int count;

    /**
     * Creates an empty binary search tree.
     */
    public LinkedBinarySearchTree() {
        super();
    }

    /**
     * Creates a binary search with the specified element as its root.
     *
     * @param element the element that will be the root of the new binary
     *                search tree
     */
    public LinkedBinarySearchTree(T element) {
        super(element);
    }

    /**
     * Adds iteratively the specified object to the binary search tree in the
     * appropriate
     * position according to its natural order. Note that equal elements are added
     * to the right.
     *
     * @param element the element to be added to the binary search tree
     */
    public void addElementIterative(T element) {

        BinaryTreeNode<T> newNode = new BinaryTreeNode<>(element);

        if (isEmpty()) {
            root = new BinaryTreeNode<>(element);
        } else {

            BinaryTreeNode<T> current = root;
            BinaryTreeNode<T> previous = null;

            while (current != null) {
                previous = current;
                if (element.compareTo(current.element) < 0) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }

            if (element.compareTo(previous.element) < 0) {
                previous.left = newNode;
            } else {
                previous.right = newNode;
            }

        }

    }

    /**
     * Adds recursively the specified object to the binary search tree in the
     * appropriate
     * position according to its natural order. Note that equal elements are added
     * to the right.
     *
     * @param element the element to be added to the binary search tree
     */
    @Override
    public void addElement(T element) {

        if (isEmpty()) {
            root = new BinaryTreeNode<>(element);
        } else {
            addElement(element, root);
        }
        count++;

    }

    /**
     * Recursive helper of addElement.
     * 
     * @param element the element to be added to the binary search tree
     * @param current the current reference
     */
    private void addElement(T element, BinaryTreeNode<T> current) {

        if (element.compareTo(current.element) < 0) {
            if (current.left == null) {
                current.left = new BinaryTreeNode<>(element);
            } else {
                addElement(element, current.left);
            }
        } else {
            if (current.right == null) {
                current.right = new BinaryTreeNode<>(element);
            } else {
                addElement(element, current.right);
            }
        }

    }

    /**
     * Removes and returns the specified element from this tree.
     *
     * @param targetElement the element to be removed from the tree
     * @return the element to be removed from the tree
     */
    @Override
    public T removeElement(T targetElement) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeElement'");
    }

    @Override
    public void removeAllOccurrences(T targetElement) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAllOccurrences'");
    }

    /**
     * Removes and returns the smallest element from this tree.
     *
     * @return the smallest element from the tree
     * @throws EmptyCollectionException if the tree is empty
     */
    @Override
    public T removeMin() {

        if (isEmpty()) {
            throw new EmptyCollectionException("LinkedBinarySearchTree");
        }

        T result = null;

        if (root.left == null) {
            result = root.element;
            root = root.right;
        } else {

            BinaryTreeNode<T> current = root;
            BinaryTreeNode<T> previous = null;
            while (current.left != null) {
                previous = current;
                current = current.left;
            }

            result = current.element;
            previous.left = current.right;

        }

        count--;
        return result;

    }

    /**
     * Removes and returns the largest element from this tree.
     *
     * @return the largest element from the tree
     * @throws EmptyCollectionException if the tree is empty
     */
    @Override
    public T removeMax() {
        
        if (isEmpty()) {
            throw new EmptyCollectionException("LinkedBinarySearchTree");
        }

        T result = null;

        if (root.right == null) {
            result = root.element;
            root = root.left;
        } else {

            BinaryTreeNode<T> current = root;
            BinaryTreeNode<T> previous = null;
            while (current.right != null) {
                previous = current;
                current = current.right;
            }

            result = current.element;
            previous.right = current.left;

        }

        count--;
        return result;

    }

    /**
     * Returns the smallest element in this tree without removing it.
     *
     * @return the smallest element in the tree
     * @throws EmptyCollectionException if the tree is empty
     */
    @Override
    public T findMin() {
        
        if (isEmpty()) {
            throw new EmptyCollectionException("LinkedBinarySearchTree");
        }

        BinaryTreeNode<T> current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.element;

    }

    /**
     * Returns the largest element in this tree without removing it.
     *
     * @return the largest element in the tree
     */
    @Override
    public T findMax() {

        if (isEmpty()) {
            throw new EmptyCollectionException("LinkedBinarySearchTree");
        }

        BinaryTreeNode<T> current = root;
        while (current.right != null) {
            current = current.right;
        }

        return current.element;

    }

}
