package ru.vichukano.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * <p>
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
class PalindromeNumber {

    boolean isPalindrome(int x) {
        var toString = String.valueOf(x);
        final var queue = Arrays.stream(toString.split(""))
                .collect(Collectors.toCollection(ArrayDeque::new));
        while (queue.size() > 1) {
            var head = queue.poll();
            var tail = queue.removeLast();
            if (!head.equals(tail)) {
                return false;
            }
        }
        return true;
    }

}
