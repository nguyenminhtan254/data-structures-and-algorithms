package DataStructures.java.Tree.BinaryTree;

import java.util.Iterator;

/**
 * LinkedBinaryTreeTester
 * 
 * @author DeepSeek
 */
public class LinkedBinaryTreeTester {

    public static void main(String[] args) {

        System.out.println("=== Testing LinkedBinaryTree ===\n");

        // ---------- Test 1: Empty tree ----------
        System.out.println("Test 1: Empty tree");
        LinkedBinaryTree<Integer> emptyTree = new LinkedBinaryTree<>();
        System.out.println("isEmpty(): " + emptyTree.isEmpty() + " (expected: true)");
        System.out.println("size(): " + emptyTree.size() + " (expected: 0)");

        try {
            emptyTree.getRootElement();
            System.out.println("getRootElement() should have thrown EmptyCollectionException");
        } catch (EmptyCollectionException e) {
            System.out.println("getRootElement() threw EmptyCollectionException (expected)");
        }

        try {
            emptyTree.find(5);
            System.out.println("find(5) should have thrown ElementNotFoundException");
        } catch (ElementNotFoundException e) {
            System.out.println("find(5) threw ElementNotFoundException (expected)");
        }

        Iterator<Integer> it = emptyTree.iterator();
        System.out.println("iterator() hasNext(): " + it.hasNext() + " (expected: false)");
        System.out.println();

        // ---------- Test 2: Single node ----------
        System.out.println("Test 2: Tree with one node");
        LinkedBinaryTree<Integer> singleTree = new LinkedBinaryTree<>(100);
        System.out.println("isEmpty(): " + singleTree.isEmpty() + " (expected: false)");
        System.out.println("size(): " + singleTree.size() + " (expected: 1)");
        System.out.println("getRootElement(): " + singleTree.getRootElement() + " (expected: 100)");
        System.out.println("contains(100): " + singleTree.contains(100) + " (expected: true)");
        System.out.println("contains(99): " + singleTree.contains(99) + " (expected: false)");

        System.out.print("In-order: ");
        printIterator(singleTree.iteratorInOrder());
        System.out.print("Pre-order: ");
        printIterator(singleTree.iteratorPreOrder());
        System.out.print("Post-order: ");
        printIterator(singleTree.iteratorPostOrder());
        System.out.print("Level-order: ");
        printIterator(singleTree.iteratorLevelOrder());
        System.out.println();

        // ---------- Test 3: Multi-node tree ----------
        System.out.println("Test 3: Multi-node tree");

        // Build a tree manually:
        //         10
        //        /  \
        //       20   30
        //      / \   / \
        //     40 50 60 70
        BinaryTreeNode<Integer> n40 = new BinaryTreeNode<>(40);
        BinaryTreeNode<Integer> n50 = new BinaryTreeNode<>(50);
        BinaryTreeNode<Integer> n60 = new BinaryTreeNode<>(60);
        BinaryTreeNode<Integer> n70 = new BinaryTreeNode<>(70);
        BinaryTreeNode<Integer> n20 = new BinaryTreeNode<>(20);
        n20.left = n40;
        n20.right = n50;
        BinaryTreeNode<Integer> n30 = new BinaryTreeNode<>(30);
        n30.left = n60;
        n30.right = n70;
        BinaryTreeNode<Integer> n10 = new BinaryTreeNode<>(10);
        n10.left = n20;
        n10.right = n30;

        LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<>();
        // Set the root via protected field (same package)
        tree.root = n10;
        tree.count = 7;   // update size

        System.out.println("isEmpty(): " + tree.isEmpty() + " (expected: false)");
        System.out.println("size(): " + tree.size() + " (expected: 7)");
        System.out.println("getRootElement(): " + tree.getRootElement() + " (expected: 10)");

        System.out.println("contains(50): " + tree.contains(50) + " (expected: true)");
        System.out.println("contains(80): " + tree.contains(80) + " (expected: false)");

        // find
        try {
            System.out.println("find(50): " + tree.find(50) + " (expected: 50)");
        } catch (ElementNotFoundException e) {
            System.out.println("find(50) failed");
        }
        try {
            tree.find(80);
            System.out.println("find(80) should have thrown ElementNotFoundException");
        } catch (ElementNotFoundException e) {
            System.out.println("find(80) threw ElementNotFoundException (expected)");
        }

        System.out.print("In-order (should be [40,20,50,10,60,30,70]): ");
        printIterator(tree.iteratorInOrder());

        System.out.print("Pre-order (should be [10,20,40,50,30,60,70]): ");
        printIterator(tree.iteratorPreOrder());

        System.out.print("Post-order (should be [40,50,20,60,70,30,10]): ");
        printIterator(tree.iteratorPostOrder());

        System.out.print("Level-order (should be [10,20,30,40,50,60,70]): ");
        printIterator(tree.iteratorLevelOrder());

        System.out.println("\n=== All tests completed ===");
    }

    /** Helper to print an iterator's elements */
    private static <T> void printIterator(Iterator<T> it) {
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}