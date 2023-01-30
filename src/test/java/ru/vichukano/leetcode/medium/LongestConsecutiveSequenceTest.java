package ru.vichukano.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {

    @Test
    void testTarget() {
        var testTarget = new LongestConsecutiveSequence();
        Assertions.assertEquals(4, testTarget.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        Assertions.assertEquals(9, testTarget.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        Assertions.assertEquals(7, testTarget.longestConsecutive(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}));
    }

}