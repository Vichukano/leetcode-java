package ru.vichukano.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumInputArrayIsSortedTest {

    @Test
    void test() {
        var testTarget = new TwoSumInputArrayIsSorted();
        Assertions.assertArrayEquals(new int[]{1, 2}, testTarget.twoSum(new int[]{2, 7, 11, 15}, 9));
        Assertions.assertArrayEquals(new int[]{1, 3}, testTarget.twoSum(new int[]{2, 3, 4}, 6));
        Assertions.assertArrayEquals(new int[]{1, 2}, testTarget.twoSum(new int[]{-1, 0}, -1));
    }

}