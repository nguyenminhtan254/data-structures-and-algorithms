# Searching
- Searching is the process of finding a target element within a group of items.

### Linear Search
- A linear search examines each item in the search pool, one at a time, until either the target is found or the pool is exhausted.
- This approach does not assume the items in the search pool are in any particular order.
- Time Complexity:
    - Best case: Ω(1)
    - Average case: Θ(n)
    - Worst case: O(n)

## Binary Search
- A binary search eliminates large parts of the search pool with each comparison.
- Each comparison in a binary search eliminates half of the candidates that remain in the search pool.
- We begin in the middle. If the target isn't found, we know that if it is in the pool at all, it is in one half or the other. Then we jump to the middle of that half and continue similarly.
- This approach requires the items in the search pool to be in ascending order.
- Time Complexity:
    - Best case: Ω(1)
    - Average case: Θ(log n)
    - Worst case: O(log n)