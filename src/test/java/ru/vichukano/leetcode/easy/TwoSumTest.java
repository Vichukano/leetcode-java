package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vichukano.leetcode.easy.TwoSum;

class TwoSumTest {

    @Test
    void toSumTest() {
        var testTarget = new TwoSum();
        int[] result = testTarget.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assertions.assertEquals(result[0], 0);
        Assertions.assertEquals(result[1], 1);
    }

}
