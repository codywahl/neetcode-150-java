# Two Pointers Algorithm

## Explanation

The two pointers algorithm involves using two pointers to iterate through a data structure, typically an array or a linked list. The pointers usually start at different positions and move towards each other or in the same direction based on the problem requirements. This technique is often used to reduce the time complexity of certain problems from O(n^2) to O(n).

## When to Use

- **Sorted Arrays**: When dealing with problems involving sorted arrays, such as finding pairs that sum to a target value.
- **Palindrome Checking**: To check if a string is a palindrome by comparing characters from both ends.
- **Merging Arrays**: When merging two sorted arrays or lists.
- **Partitioning Problems**: When you need to partition an array based on a condition.

## Tips

- Look for problems where you need to compare elements from both ends or from different parts of the data structure.
- Consider using two pointers when you need to find pairs or triplets that meet certain criteria.
- Ensure that the data structure allows for efficient movement of pointers (e.g., arrays or linked lists).

## Knowing Which Pointer to Move

- **Sum Problems**: When dealing with problems that involve finding pairs that sum to a target value, if the sum of the two pointers is less than the target, move the left pointer to the right to increase the sum. If the sum is greater than the target, move the right pointer to the left to decrease the sum.
- **Palindrome Checking**: When checking for palindromes, move both pointers towards the center. If the characters at both pointers match, continue moving inward. If they don't match, the string is not a palindrome.
- **Merging Arrays**: When merging two sorted arrays, compare the elements at both pointers. Move the pointer of the array with the smaller element to the right to add the smaller element to the merged array.
- **Partitioning Problems**: When partitioning an array, decide which pointer to move based on the condition you are partitioning by. For example, if partitioning by even and odd numbers, move the left pointer to the right until you find an odd number and the right pointer to the left until you find an even number, then swap them.

By understanding the problem requirements and the conditions under which you need to move the pointers, you can effectively use the two pointers technique to solve a variety of problems efficiently.
