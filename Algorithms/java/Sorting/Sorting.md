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