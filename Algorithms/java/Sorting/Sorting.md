# Sorting
- Sorting is the process of arranging a group of items into a defined order based on particular criteria.
- *Sequential sorts* require approximately n<sup>2</sup> comparisons to sort n elements.
- *Logarithmic sorts* typically require nlog<sub>2</sub>n comparisons to sort n elements.

## Selection Sort
- Selection sort orders a list of values by repetitively putting a particular value into its final position.
- **Ascending algorithm**:
    - find the smallest value in the list
    - switch it with the value in the first position
    - find the next smallest value in the list
    - switch it with the value in the second position
    - repeat until all values are in their proper places
- Time Complexity:
    - Best case: Ω(n<sup>2</sup>)
    - Average case: Θ(n<sup>2</sup>)
    - Worst case: O(n<sup>2</sup>)

## Insertion Sort
- Insertion sort orders a values by repetitively inserting a particular value into a sorted subset of the list.
- **Ascending algorithm**:
    - consider the first item to be a sorted sublist of length 1
    - insert the second item into the sorted sublist, shifting the first item if needed
    - insert the third item into the sorted sublist, shifting the other items as needed
    - repeat until all values have been inserted into their proper positions
- Time Complexity:
    - Best case: Ω(n)
    - Average case: Θ(n<sup>2</sup>)
    - Worst case: O(n<sup>2</sup>)

## Bubble Sort
- Bubble sort orders a list of values by repetitively comparing neighboring elements and swapping their positions if necessary.
- **Ascending algorithm**:
    - scan the list, exchanging adjacent elements if they are not in relative order; this bubbles the highest value to the top
    - scan the list again, bubbling up the second highest value
    - repeat until all elements have been placed in their proper order
- Time Complexity:
    - Best case: Ω(n)
    - Average case: Θ(n<sup>2</sup>)
    - Worst case: O(n<sup>2</sup>)