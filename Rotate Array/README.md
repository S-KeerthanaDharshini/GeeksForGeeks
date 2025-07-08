# [Rotate Array](https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1)

## 🧠 Difficulty
**Medium**

## 📌 Problem Statement

Given an array `arr[]`, rotate the array to the **left (counter-clockwise direction)** by `d` steps, where `d` is a positive integer.  
The rotation must be done **in-place**, without using extra space.  
📎 **Note:** Treat the array as **circular**.

---

## 📥 Input

- An integer array `arr[]` of size `n`
- An integer `d`, representing the number of steps to rotate

## 📤 Output

- The modified array after rotating left by `d` positions

---

## ✅ Constraints

- `1 <= arr.size(), d <= 10^5`
- `0 <= arr[i] <= 10^5`

---

## 🔍 Examples

### Example 1
```python
Input: arr = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]

Explanation: Rotating left by 2 positions results in [3, 4, 5, 1, 2].
