package DataStructures.java.Tree.BinaryTree;

/**
 * BinaryTreeNode represents a node in a binary tree with a left and right
 * child.
 * 
 * @author Minh Tan Nguyen
 */
public class BinaryTreeNode<T> {

    protected T element;
    protected BinaryTreeNode<T> left, right;

    /**
     * Default constructor.
     */
    public BinaryTreeNode() {
        element = null;
        left = right = null;
    }

    /**
     * Creates a new tree node with the specified data.
     * 
     * @param element the element that will become a part of the new tree node
     */
    public BinaryTreeNode(T element) {
        this.element = element;
        left = right = null;
    }

}