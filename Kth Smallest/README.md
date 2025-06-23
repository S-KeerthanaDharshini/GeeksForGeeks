# [Kth Smallest Element](https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1)

`Medium`   |        `PriorityQueue`
## Problem Statement

Given an array `arr[]` and an integer `k`, where `k` is smaller than the size of the array, your task is to **find the kth smallest element** in the given array.

### Follow-up:
Do **not** solve it using the inbuilt `sort()` function.

---

## Examples

### Example 1:
Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output: 7
Explanation: 3rd smallest element in the given array is 7.

### Example 2:
Input: arr[] = [2, 3, 1, 20, 15], k = 4
Output: 15
Explanation: 4th smallest element in the given array is 15.

---

## Constraints

- `1 <= arr.size <= 10^6`
- `1 <= arr[i] <= 10^6`
- `1 <= k <= n`

---

## Recommended Approaches

- **Min-Heap** (PriorityQueue): Extract `k` elements  
- **QuickSelect Algorithm** (Hoare’s partition-based selection algorithm): Average O(n) time  
- Avoid using Java's built-in `Arrays.sort()` method in interviews to demonstrate understanding of algorithmic strategies

---

## Additional Java Resources

- [QuickSelect Algorithm – GeeksforGeeks](https://www.geeksforgeeks.org/quickselect-algorithm/)
- [PriorityQueue in Java – Oracle Docs](https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html)
- [Min-Heap Java Implementation](https://www.baeldung.com/java-min-heap)
- [Difference between Sorting and Selection Algorithms](https://www.geeksforgeeks.org/selection-algorithms/)

---

## Related GeeksforGeeks Topics

- Arrays  
- Searching  
- Heap  
- Divide and Conquer  
- Priority Queue  
- Sorting (Without Built-ins)
