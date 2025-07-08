# [Move All Zeroes to End](https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1)

## 🧠 Difficulty
**Easy**

## 📌 Problem Statement

You are given an array `arr[]` of non-negative integers.  
Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements.  
This must be done **in-place**, without using extra space for another array.

---

## 📥 Input

- An integer array `arr[]` of size `n`

## 📤 Output

- The modified array with all 0s moved to the end, maintaining the relative order of the non-zero elements.

---

## ✅ Constraints

- `1 ≤ arr.size() ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^5`

---

## 🔍 Examples

### Example 1
```python
Input: arr = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.
