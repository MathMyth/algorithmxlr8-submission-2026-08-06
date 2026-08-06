<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Add Digits

**Difficulty:** `Easy`

## Problem

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

For example, if num is 38, first add its digits to get 3 + 8 = 11. Since 11 still has more than one digit, add its digits again: 1 + 1 = 2. Since 2 has only one digit, the process stops and the answer is 2.

Read num from standard input, and print the final single digit result to standard output.

- If num is already a single digit (0 through 9), the answer is num itself.
- Repeatedly summing the digits of any non-negative number always shrinks it (or leaves a single digit unchanged), so the process is guaranteed to terminate quickly.

## Examples

### Example 1

**Input**
```
num = 38
```
**Output**
```
2
```

**Explanation:** 3 + 8 = 11, which still has more than one digit, so add again: 1 + 1 = 2.

### Example 2

**Input**
```
num = 0
```
**Output**
```
0
```

**Explanation:** num is already a single digit, so the answer is num itself.

### Example 3

**Input**
```
num = 12345
```
**Output**
```
6
```

**Explanation:** 1 + 2 + 3 + 4 + 5 = 15, which still has more than one digit, so add again: 1 + 5 = 6.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/add-digits).