package ru.vichukano.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Objects;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * Example 1:
 * Input: s = "()"
 * Output: true
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * Input: s = "(]"
 * Output: false
 */
public class ValidParentheses {
    private final Map<String, String> parenthesesMap = Map.of(
            ")", "(",
            "}", "{",
            "]", "["
    );

    public boolean isValid(String s) {
        if (Objects.isNull(s) || s.isEmpty() || s.isBlank()) {
            return false;
        }
        if (s.length() % 2!=0) {
            return false;
        }
        Deque<String> stack = new ArrayDeque<>(s.length());
        for (var c : s.split("")) {
            if (parenthesesMap.containsValue(c)) {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty() || !Objects.equals(parenthesesMap.get(c), stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
