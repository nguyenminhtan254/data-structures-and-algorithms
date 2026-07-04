# Tree

## Definition
- A tree is a non-linear structure in which elements are organized into a hierarchy.
- A tree is comprised of a set of nodes in which elements are stored and edges connect one node to another.
- *General trees* have no limit to the number of children a node may have.
- A tree that limits each node to no more than n children is referred to as an n-ary tree.

## Terminologies
- **Parent node**: A node that is an immediate predecessor of another node.
- **Child node**: A node that is an immediate successor of another node.
- **Root node**: The topmost node in the tree, which does not have a parent.
- **Leaf node**: Nodes that do not have any children.
- **Internal node**: A node that is not the root and has at least one child.
- **Subtree**: A tree structure makes up part of another tree.
- **Level of a Node**: The number of edges in the path from the root to that node. The root node is at level 0.
- **Height of a Tree**: The length of the longest path from the root to the a leaf.

# Binary Tree

## Definition
- A binary tree is a tree in which each node may have at most 2 children.

## Classifying Trees
- **Balanced tree**: All of the leaves are on the same level or within one level of each other.
- **Skewd tree**: Every node has only one child or none, like a linked list.
- **Full tree**: Every node contains 0 or 2 children.
- **Complete tree**: All levels contain all possible nodes except the last level, and all nodes in the last level must be on the left side of the tree.
- **Perfect tree**: All internal nodes have 2 children and all leaf nodes are at the same level.

## Tree Traversals
- **Preorder**: visit the root, then traverse the subtrees from left to right.
- **Inorder**: traverse the left subtree, then visit the root, then traverse the right subtree.
- **Postorder**: traverse the subtrees from left to right, then visit the root.
- **Level order**: visit each node at each level of the tree from top to bottom and left to right.

## BinaryTreeADT
| Methods                             | Array Implementation | Linked List Implementation |
| ----------------------------------- | -------------------- | -------------------------- |
| getRootElement() : T                |                      | O(1)                       |
| isEmpty() : boolean                 |                      | O(1)                       |
| size() : int                        |                      | O(1)                       |
| contains(T targetElement) : boolean |                      | O(n)                       |
| find(T targetElement) : T           |                      | O(n)                       |
| toString() : String                 |                      | O(n)                       |
| iterator() : Iterator\<T>           |                      | O(n)                       |
| iteratorInOrder() : Iterator\<T>    |                      | O(n)                       |
| iteratorPreOrder() : Iterator\<T>   |                      | O(n)                       |
| iteratorPostOrder() : Iterator\<T>  |                      | O(n)                       |
| iteratorLevelOrder() : Iterator\<T> |                      | O(n)                       |

# Binary Search Tree

