package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

    @Test
    void test() {
        var testTarget = new LongestCommonPrefix();
        String[] arr = {"flower", "flow", "flight"};
        Assertions.assertEquals(testTarget.longestCommonPrefix(arr), "fl");
        String[] wrong = {"dog","racecar","car"};
        Assertions.assertEquals(testTarget.longestCommonPrefix(wrong), "");
        String[] one = {"a"};
        Assertions.assertEquals(testTarget.longestCommonPrefix(one), "a");
    }

}