package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    @Test
    void test() {
        var testTarget = new ValidAnagram();
        Assertions.assertTrue(testTarget.isAnagram("anagram", "nagaram"));
        Assertions.assertFalse(testTarget.isAnagram("rat", "cat"));
    }

}