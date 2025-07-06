# [Second Largest](https://www.geeksforgeeks.org/problems/second-largest3735/1)

## 🧠 Difficulty
**Easy**

## 📌 Problem Statement

Given an array of **positive integers** `arr[]`, return the **second largest** element from the array.  
If the second largest element doesn't exist (i.e., all elements are equal), then return `-1`.

> 🔎 Note: The second largest element must be **strictly less** than the largest.

---

## 📥 Input

- An integer array `arr[]` of size `N`.

## 📤 Output

- Return the **second largest** element of the array.
- If no such element exists, return `-1`.

---

## ✅ Constraints

- `2 ≤ arr.size() ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^5`

---

## 🔍 Examples

### Example 1
```python
Input: arr = [12, 35, 1, 10, 34, 1]  
Output: 34  
Explanation: The largest element is 35 and the second largest is 34.
