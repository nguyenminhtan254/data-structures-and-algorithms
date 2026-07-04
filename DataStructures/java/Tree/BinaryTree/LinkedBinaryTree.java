package DataStructures.java.Tree.BinaryTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;

/**
 * LinkedBinaryTree implements the BinaryTreeADT interface
 *
 * @author Minh Tan Nguyen
 */
public class LinkedBinaryTree<T> implements BinaryTreeADT<T> {

    protected BinaryTreeNode<T> root;
    protected int count;

    /**
     * Creates an empty binary tree.
     */
    public LinkedBinaryTree() {
        root = null;
    }

    /**
     * Creates a binary tree with the specified element as its root.
     *
     * @param element the element that will become the root of the binary tree
     */
    public LinkedBinaryTree(T element) {
        root = new BinaryTreeNode<>(element);
        count++;
    }

    /**
     * Returns a reference to the root element
     *
     * @return a reference to the root
     * @throws EmptyCollectionException if tree is empty
     */
    @Override
    public T getRootElement() {

        if (isEmpty()) {
            throw new EmptyCollectionException("LinkedBinaryTree");
        }

        return root.element;

    }

    /**
     * Returns true if this binary tree is empty and false otherwise.
     *
     * @return true if this binary tree is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Returns the number of elements in this binary tree.
     *
     * @return the number of elements in the tree
     */
    @Override
    public int size() {
        return count;
    }

    /**
     * Returns true if the binary tree contains an element that matches the
     * specified element and false otherwise.
     *
     * @param targetElement the element being sought in the tree
     * @return true if the tree contains the target element
     */
    @Override
    public boolean contains(T targetElement) {
        return findNode(targetElement, root) != null;
    }

    /**
     * Returns a reference to the specified element if it is found in this binary
     * tree. Throws an exception if the specified element is not found.
     * 
     * @param targetElement the element being sought in this tree
     * @return a reference to the specified target
     * @throws ElementNotFoundException if the element is not in the tree
     */
    @Override
    public T find(T targetElement) {

        BinaryTreeNode<T> current = findNode(targetElement, root);

        if (current == null) {
            throw new ElementNotFoundException("LinkedBinaryTree");
        }

        return current.element;

    }

    /**
     * Returns an iterator over the elements of this tree using inorder traversal.
     *
     * @return an iterator over the elements of this binary tree
     */
    @Override
    public Iterator<T> iterator() {
        return iteratorInOrder();
    }

    /**
     * Returns an iterator that represents an inorder traversal on this binary tree.
     *
     * @return an iterator over the elements of this binary tree
     */
    @Override
    public Iterator<T> iteratorInOrder() {
        List<T> tempList = new ArrayList<>();
        inOrder(root, tempList);
        return tempList.iterator();
    }

    /**
     * Performs a recursive inorder traversal.
     *
     * @param node     the node to be used as the root for this traversal
     * @param tempList the temporary list for use in this traversal
     */
    protected void inOrder(BinaryTreeNode<T> node, List<T> tempList) {
        if (node != null) {
            inOrder(node.left, tempList);
            tempList.add(node.element);
            inOrder(node.right, tempList);
        }
    }

    /**
     * Returns an iterator that represents a preorder traversal on this binary tree.
     *
     * @return an iterator over the elements of this binary tree
     */
    @Override
    public Iterator<T> iteratorPreOrder() {
        List<T> tempList = new ArrayList<>();
        preOrder(root, tempList);
        return tempList.iterator();
    }

    /**
     * Performs a recursive preorder traversal.
     *
     * @param node     the node to be used as the root for this traversal
     * @param tempList the temporary list for use in this traversal
     */
    protected void preOrder(BinaryTreeNode<T> node, List<T> tempList) {
        if (node != null) {
            tempList.add(node.element);
            preOrder(node.left, tempList);
            preOrder(node.right, tempList);
        }
    }

    /**
     * Returns an iterator that represents a postorder traversal on this binary
     * tree.
     *
     * @return an iterator over the elements of this binary tree
     */
    @Override
    public Iterator<T> iteratorPostOrder() {
        List<T> tempList = new ArrayList<>();
        postOrder(root, tempList);
        return tempList.iterator();
    }

    /**
     * Performs a recursive postorder traversal.
     *
     * @param node     the node to be used as the root for this traversal
     * @param tempList the temporary list for use in this traversal
     */
    protected void postOrder(BinaryTreeNode<T> node, List<T> tempList) {
        if (node != null) {
            postOrder(node.left, tempList);
            postOrder(node.right, tempList);
            tempList.add(node.element);
        }
    }

    /**
     * Returns an iterator that represents a levelorder traversal on the binary
     * tree.
     *
     * @return an iterator over the elements of this binary tree
     */
    @Override
    public Iterator<T> iteratorLevelOrder() {

        Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
        List<T> tempList = new ArrayList<>();

        if (!isEmpty()) {
            queue.add(root);

            while (!queue.isEmpty()) {
                BinaryTreeNode<T> temp = queue.remove();
                tempList.add(temp.element);

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }

            }
        }

        return tempList.iterator();

    }

    /**
     * Returns the string representation of this binary tree.
     *
     * @return a string representation of the binary tree
     */
    @Override
    public String toString() {
        List<T> result = new ArrayList<>();
        inOrder(root, result);
        return result.toString();
    }

    /**
     * Returns a reference to the specified target element if it is found in this
     * binary tree.
     *
     * @param targetElement the element being sought in this tree
     * @param next          the element to begin searching from
     */
    private BinaryTreeNode<T> findNode(T targetElement, BinaryTreeNode<T> next) {

        BinaryTreeNode<T> result = null;

        if (next == null) {
            // Base case 1: Empty subtree
            result = null;
        } else if (next.element.equals(targetElement)) {
            // Base case 2: Found
            result = next;
        } else {
            // Recursive search
            result = findNode(targetElement, next.left);
            if (result == null) {
                result = findNode(targetElement, next.right);
            }
        }

        return result;

    }

}
