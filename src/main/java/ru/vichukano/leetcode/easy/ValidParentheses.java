package ru.vichukano.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Objects;

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
