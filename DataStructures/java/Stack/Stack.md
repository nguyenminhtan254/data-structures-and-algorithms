# Stack

## Definition
- A **stack** is a linear collection whose elements are added in a *last in, fist out* (LIFO) manner.
- That is, the last element to be put on a stack is the first one to be removed.
- Think of a stack of books, where you add and remove from the top, but can't reach into the middle.

## StackADT
| Methods                | Array Implementation | Linked List Implementation |
| ---------------------- | -------------------- | -------------------------- |
| push(T element) : void | O(1)                 | O(1)                       |
| pop() : T              | O(1)                 | O(1)                       |
| peek() : T             | O(1)                 | O(1)                       |
| isEmpty() : boolean    | O(1)                 | O(1)                       |
| size() : int           | O(1)                 | O(1)                       |
| toString() : String    | O(n)                 | O(n)                       |