package DataStructures.java.Tree.BinarySearchTree;

import java.util.Iterator;

/**
 * Tester for LinkedBinarySearchTree.
 * 
 * @author DeepSeek
 */
public class LinkedBinarySearchTreeTester {

    public static void main(String[] args) {
        System.out.println("=== Testing LinkedBinarySearchTree ===\n");

        // Test 1: Create empty tree and check isEmpty, size
        System.out.println("Test 1: Empty tree");
        LinkedBinarySearchTree<Integer> tree = new LinkedBinarySearchTree<>();
        System.out.println("isEmpty(): " + tree.isEmpty() + " (expected true)");
        System.out.println("size(): " + tree.size() + " (expected 0)");
        System.out.println();

        // Test 2: Add elements (recursive) and test traversal
        System.out.println("Test 2: Add elements recursively");
        tree.addElement(50);
        tree.addElement(30);
        tree.addElement(70);
        tree.addElement(20);
        tree.addElement(40);
        tree.addElement(60);
        tree.addElement(80);
        System.out.println("Added: 50,30,70,20,40,60,80");
        System.out.println("size(): " + tree.size() + " (expected 7)");
        System.out.println("Inorder: " + tree.toString() + " (expected [20, 30, 40, 50, 60, 70, 80])");
        System.out.println();

        // Test 3: Find (recursive and iterative)
        System.out.println("Test 3: Find");
        System.out.println("find(40): " + tree.find(40) + " (expected 40)");
        System.out.println("findIterative(60): " + tree.findIterative(60) + " (expected 60)");
        try {
            tree.find(99);
            System.out.println("find(99) did not throw exception (FAIL)");
        } catch (ElementNotFoundException e) {
            System.out.println("find(99) threw ElementNotFoundException (expected)");
        }
        System.out.println();

        // Test 4: contains
        System.out.println("Test 4: contains");
        System.out.println("contains(30): " + tree.contains(30) + " (expected true)");
        System.out.println("contains(100): " + tree.contains(100) + " (expected false)");
        System.out.println();

        // Test 5: findMin and findMax
        System.out.println("Test 5: findMin / findMax");
        System.out.println("findMin(): " + tree.findMin() + " (expected 20)");
        System.out.println("findMax(): " + tree.findMax() + " (expected 80)");
        System.out.println();

        // Test 6: removeElement
        System.out.println("Test 6: removeElement");
        tree.removeElement(30);
        System.out.println("Removed 30");
        System.out.println("Inorder: " + tree.toString() + " (expected [20, 40, 50, 60, 70, 80])");
        System.out.println("size(): " + tree.size() + " (expected 6)");
        tree.removeElement(50);
        System.out.println("Removed 50");
        System.out.println("Inorder: " + tree.toString() + " (expected [20, 40, 60, 70, 80])");
        System.out.println("size(): " + tree.size() + " (expected 5)");
        try {
            tree.removeElement(100);
            System.out.println("removeElement(100) did not throw exception (FAIL)");
        } catch (ElementNotFoundException e) {
            System.out.println("removeElement(100) threw ElementNotFoundException (expected)");
        }
        System.out.println();

        // Test 7: removeMin and removeMax
        System.out.println("Test 7: removeMin / removeMax");
        System.out.println("removeMin(): " + tree.removeMin() + " (expected 20)");
        System.out.println("Inorder: " + tree.toString() + " (expected [40, 60, 70, 80])");
        System.out.println("removeMax(): " + tree.removeMax() + " (expected 80)");
        System.out.println("Inorder: " + tree.toString() + " (expected [40, 60, 70])");
        System.out.println("size(): " + tree.size() + " (expected 3)");
        System.out.println();

        // Test 8: removeAllOccurrences (duplicates)
        System.out.println("Test 8: removeAllOccurrences (duplicates)");
        LinkedBinarySearchTree<Integer> dupTree = new LinkedBinarySearchTree<>();
        dupTree.addElement(5);
        dupTree.addElement(5); // duplicates go to right
        dupTree.addElement(5);
        dupTree.addElement(3);
        dupTree.addElement(7);
        System.out.println("Added: 5,5,5,3,7");
        System.out.println("Inorder before: " + dupTree.toString() + " (expected [3, 5, 5, 5, 7])");
        dupTree.removeAllOccurrences(5);
        System.out.println("Removed all 5's");
        System.out.println("Inorder after: " + dupTree.toString() + " (expected [3, 7])");
        System.out.println("size(): " + dupTree.size() + " (expected 2)");
        System.out.println();

        // Test 9: iterative add and find
        System.out.println("Test 9: Iterative addElementIterative and findIterative");
        LinkedBinarySearchTree<Integer> iterTree = new LinkedBinarySearchTree<>();
        iterTree.addElementIterative(10);
        iterTree.addElementIterative(5);
        iterTree.addElementIterative(15);
        System.out.println("Added: 10,5,15");
        System.out.println("size(): " + iterTree.size() + " (expected 3)");
        System.out.println("findIterative(5): " + iterTree.findIterative(5) + " (expected 5)");
        System.out.println("findIterative(20): ");
        try {
            iterTree.findIterative(20);
        } catch (ElementNotFoundException e) {
            System.out.println("threw ElementNotFoundException (expected)");
        }
        System.out.println();

        // Test 10: traversals
        System.out.println("Test 10: Traversals");
        System.out.println("PreOrder: " + listToString(tree.iteratorPreOrder()) + " (expected varies)");
        System.out.println("PostOrder: " + listToString(tree.iteratorPostOrder()) + " (expected varies)");
        System.out.println("LevelOrder: " + listToString(tree.iteratorLevelOrder()) + " (expected varies)");
        System.out.println();

        // Test 11: Edge cases - empty removal
        System.out.println("Test 11: Edge cases - empty tree removal");
        LinkedBinarySearchTree<Integer> emptyTree = new LinkedBinarySearchTree<>();
        try {
            emptyTree.removeMin();
            System.out.println("removeMin on empty did not throw (FAIL)");
        } catch (EmptyCollectionException e) {
            System.out.println("removeMin on empty threw EmptyCollectionException (expected)");
        }
        try {
            emptyTree.removeMax();
            System.out.println("removeMax on empty did not throw (FAIL)");
        } catch (EmptyCollectionException e) {
            System.out.println("removeMax on empty threw EmptyCollectionException (expected)");
        }
        try {
            emptyTree.findMin();
            System.out.println("findMin on empty did not throw (FAIL)");
        } catch (EmptyCollectionException e) {
            System.out.println("findMin on empty threw EmptyCollectionException (expected)");
        }
        System.out.println();

        System.out.println("=== All tests completed ===");
    }

    // Helper to convert iterator to string
    private static <T> String listToString(Iterator<T> it) {
        StringBuilder sb = new StringBuilder("[");
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}