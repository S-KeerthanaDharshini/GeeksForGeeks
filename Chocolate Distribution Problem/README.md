# Chocolate Distribution Problem
`Array` | `Sorting` | `Sliding Window` | `Easy`

## 📝 Problem Statement
Given an array of chocolate packet sizes and `m` students, distribute packets such that:
1. Each student gets exactly one packet
2. The difference between maximum and minimum chocolates given is minimized

Return the minimum possible difference.

## 🔢 Constraints
- `1 ≤ m ≤ arr.size ≤ 10⁵`
- `1 ≤ arr[i] ≤ 10⁹`

## 📊 Examples

### Example 1
**Input:** `arr = [3, 4, 1, 9, 56, 7, 9, 12]`, `m = 5`  
**Output:** `6`  
**Explanation:** Optimal distribution: [3, 4, 9, 7, 9] → 9 - 3 = 6

---

### Example 2
**Input:** `arr = [7, 3, 2, 4, 9, 12, 56]`, `m = 3`  
**Output:** `2`  
**Explanation:** Optimal distribution: [2, 3, 4] → 4 - 2 = 2

---

### Example 3
**Input:** `arr = [3, 4, 1, 9, 56]`, `m = 5`  
**Output:** `55`  
**Explanation:** Must take all packets → 56 - 1 = 55


## 🔗 Additional Resources

- [Sliding Window Technique](https://www.geeksforgeeks.org/window-sliding-technique/)
- [Sorting Algorithms](https://leetcode.com/articles/sorting-algorithms/)

