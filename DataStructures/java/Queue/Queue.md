# Queue

## Definition
- A **queue** is a linear collection whose elements are added on one end and removed from the other in a *fist in, first out* (FIFO) manner.
- Elements are removed in the same order they arrive.
- A queue is like a waiting line, where the first person to arrive at the grocery store line will be the first one to check out.

## QueueADT
| Methods                   | Array Implementation | Linked List Implementation |
| ------------------------- | -------------------- | -------------------------- |
| enqueue(T element) : void | O(1)                 | O(1)                       |
| dequeue() : T             | O(1)                 | O(1)                       |
| first() : T               | O(1)                 | O(1)                       |
| isEmpty() : boolean       | O(1)                 | O(1)                       |
| size() : int              | O(1)                 | O(1)                       |
| toString() : String       | O(n)                 | O(n)                       |