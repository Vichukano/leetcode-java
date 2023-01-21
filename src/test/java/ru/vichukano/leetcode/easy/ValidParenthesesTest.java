package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @Test
    void test() {
        var testTarget = new ValidParentheses();
        Assertions.assertTrue(testTarget.isValid("()[]{}"));
        Assertions.assertFalse(testTarget.isValid("(]"));
        Assertions.assertTrue(testTarget.isValid("{[]}"));
        Assertions.assertFalse(testTarget.isValid("[[[["));
    }

}
