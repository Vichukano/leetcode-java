package ru.vichukano.leetcode.easy;

import java.util.ArrayDeque;
import java.util.stream.Collectors;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
class ValidPalindrome {

    boolean isPalindrome(String s) {
        if (s==null || s.isEmpty()) {
            return false;
        }
        if (s.isBlank()) {
            return true;
        }
        var charsQueue = s.chars().mapToObj(i -> (char) i)
                .filter(Character::isLetterOrDigit)
                .collect(Collectors.toCollection(ArrayDeque::new));
        while (!charsQueue.isEmpty()) {
            Character first = charsQueue.pop();
            if (charsQueue.isEmpty()) {
                return true;
            }
            Character second = charsQueue.removeLast();
            if (Character.toLowerCase(first)!=Character.toLowerCase(second)) {
                return false;
            }
        }
        return true;
    }

}

