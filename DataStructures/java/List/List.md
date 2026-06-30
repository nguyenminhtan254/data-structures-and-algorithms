# List

## Definition
- A list is a linear collection, like stacks and queues, but is more flexible.
- Adding and removing elements in lists can occur at either end or anywhere in the middle.
- Three primary types of list collections:
    - ordered lists
    - unordered lists
    - indexed lists

## ListADT
| Methods                      | Array Implementation | Linked List Implementation |
| ---------------------------- | -------------------- | -------------------------- |
| removeFirst() : T            | O(n)                 |                            |
| removeLast() : T             | O(1)                 |                            |
| remove(T element) : T        | O(n)                 |                            |
| first() : T                  | O(1)                 |                            |
| last() : T                   | O(1)                 |                            |
| contains(T target) : boolean | O(n)                 |                            |
| isEmpty() : boolean          | O(1)                 |                            |
| size() : int                 | O(1)                 |                            |
| iterator() : Iterator        | O(1)                 |                            |
| toString() : String          | O(n)                 |                            |

# Ordered Lists

## Definition
- The elements in an ordered list are ordered by some inherent characteristic of the elements.
    - names in alphabetical order
    - scores in ascending order
- The elements themselves determine where they are sorted in the list.

## OrderedListADT

# Unordered Lists

## Definition
- The user of the list determines the order of the elements.
- That order is not based on element characteristics.

## UnorderedListADT
| Methods                              | Array Implementation | Linked List Implementation |
| ------------------------------------ | -------------------- | -------------------------- |
| addToFront(T element) : void         | O(n)                 |                            |
| addToRear(T element) : void          | O(1)                 |                            |
| addAfter(T element, T target) : void | O(n)                 |                            |