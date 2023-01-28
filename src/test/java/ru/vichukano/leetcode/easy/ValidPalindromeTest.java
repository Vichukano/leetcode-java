package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    @Test
    void test() {
       var testTarget = new ValidPalindrome();
        Assertions.assertTrue(testTarget.isPalindrome("A man, a plan, a canal: Panama"));
    }

}