package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {

    @Test
    void test() {
        var testTarget = new PlusOne();
        Assertions.assertArrayEquals(new int[]{1, 2, 4}, testTarget.plusOne(new int[]{1, 2, 3}));
        Assertions.assertArrayEquals(new int[]{4, 3, 2, 2}, testTarget.plusOne(new int[]{4, 3, 2, 1}));
        Assertions.assertArrayEquals(new int[]{1, 0}, testTarget.plusOne(new int[]{9}));
    }

}