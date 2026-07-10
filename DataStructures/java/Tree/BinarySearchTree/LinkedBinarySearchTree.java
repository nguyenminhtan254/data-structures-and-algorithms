package DataStructures.java.Tree.BinarySearchTree;

/**
 * LinkedBinarySearchTree implements the BinarySearchTreeADT interface.
 * 
 * @author Minh Tan Nguyen
 */
public class LinkedBinarySearchTree<T extends Comparable<T>> extends LinkedBinaryTree<T>
        implements BinarySearchTreeADT<T> {

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
     * Returns iteratively a reference to the specified element if it is found in
     * this binary search tree. Throws an exception if the specified element is not
     * found.
     * 
     * @param targetElement the element being sought in this tree
     * @return a reference to the specified target
     * @throws ElementNotFoundException if the element is not in the tree
     */
    public T findIterative(T targetElement) {

        BinaryTreeNode<T> current = root;

        while (current != null) {
            if (targetElement.compareTo(current.element) < 0) {
                current = current.left;
            } else if (targetElement.compareTo(current.element) > 0) {
                current = current.right;
            } else {
                break;
            }
        }

        if (current == null) {
            throw new ElementNotFoundException("LinkedBinarySearchTree");
        }

        return current.element;

    }

    /**
     * Returns recursively a reference to the specified element if it is found in
     * this binary tree. Throws an exception if the specified element is not found.
     * 
     * @param targetElement the element being sought in this tree
     * @return a reference to the specified target
     * @throws ElementNotFoundException if the element is not in the tree
     */
    @Override
    public T find(T targetElement) {

        T result = find(targetElement, root);

        if (result == null) {
            throw new ElementNotFoundException("LinkedBinarySearchTree");
        }

        return result;
    }

    /**
     * Recursive helper of find.
     * 
     * @param targetElement the element being sought in this tree
     * @return a reference to the specified target
     */
    private T find(T targetElement, BinaryTreeNode<T> current) {

        T result = null;

        if (current != null) {
            if (targetElement.compareTo(current.element) < 0) {
                result = find(targetElement, current.left);
            } else if (targetElement.compareTo(current.element) > 0) {
                result = find(targetElement, current.right);
            } else {
                result = current.element;
            }
        }

        return result;

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

        count++;

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
     * @throws ElementNotFoundException if the target element is not found
     */
    @Override
    public T removeElement(T targetElement) {

        if (!contains(targetElement)) {
            throw new ElementNotFoundException("LinkedBinarySearchTree");
        }

        root = removeElement(targetElement, root);
        count--;
        return targetElement;

    }

    /**
     * Recursive helper of removeElement.
     * 
     * @param targetElement the element to be removed from the tree
     * @param current       the current reference
     * @return the element to be removed from the tree
     */
    private BinaryTreeNode<T> removeElement(T targetElement, BinaryTreeNode<T> current) {

        if (current == null) {
            // Base case: Not found
            return null;
        } else {
            // Recursive case: Find and delete node
            if (targetElement.compareTo(current.element) < 0) {
                current.left = removeElement(targetElement, current.left);
            } else if (targetElement.compareTo(current.element) > 0) {
                current.right = removeElement(targetElement, current.right);
            } else {

                // Delete node
                if (current.left == null && current.right == null) {
                    current = null;
                } else if (current.left == null) {
                    current = current.right;
                } else if (current.right == null) {
                    current = current.left;
                } else {

                    T successorElement = replacement(current.right);
                    current.element = successorElement;
                    current.right = removeElement(successorElement, current.right);

                }

            }
        }

        return current;

    }

    /**
     * Get inorder successor.
     * 
     * @param current the current reference
     * @return the smallest element in this subtree
     */
    private T replacement(BinaryTreeNode<T> current) {
        while (current.left != null) {
            current = current.left;
        }

        return current.element;
    }

    /**
     * Removes all occurences of the specified element from this tree.
     *
     * @param targetElement the element to be removed from the tree
     */
    @Override
    public void removeAllOccurrences(T targetElement) {

        try {
            while (true) {
                removeElement(targetElement);
            }
        } catch (ElementNotFoundException e) {
            
        }

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
