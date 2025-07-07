# [Remove Duplicates Sorted Array](https://www.geeksforgeeks.org/dsa/remove-duplicates-sorted-array/)

## 🧠 Difficulty
**Easy**

## 📌 Problem Statement

Given a **sorted array** `arr[]`, modify the array in-place to **remove all duplicate elements** such that only distinct elements remain at the beginning.

You must:
1. Modify the array in-place so that the first part contains only distinct elements.
2. Return the **size of the modified array**.
3. **Do not use Set or HashMap**.

---

## 📥 Input

- A sorted integer array `arr[]` of size `N`.

## 📤 Output

- Return the count of unique elements (`int`).
- The first `count` elements in the array must be the distinct elements.

---

## ✅ Constraints

- `1 ≤ arr.size() ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^6`

---

## 🔍 Examples

### Example 1
Input: arr = [2, 2, 2, 2, 2]
Output: 1
Modified Array: [2]
Explanation: Only one instance of 2 should remain. Size = 1.


### Example 2

Input: arr = [1, 2, 4]
Output: 3
Modified Array: [1, 2, 4]
Explanation: No duplicates present. Size = 3.

