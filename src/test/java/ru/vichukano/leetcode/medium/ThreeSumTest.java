package ru.vichukano.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ThreeSumTest {

    @Test
    void test() {
        var testTarget = new ThreeSum();
        Assertions.assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), testTarget.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        Assertions.assertEquals(List.of(List.of(0, 0, 0)), testTarget.threeSum(new int[]{0, 0, 0}));
    }

}