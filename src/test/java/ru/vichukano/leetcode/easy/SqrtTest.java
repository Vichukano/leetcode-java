package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SqrtTest {

    @Test
    void test() {
        var testTarget = new Sqrt();
        Assertions.assertEquals(2, testTarget.mySqrt(4));
        Assertions.assertEquals(2, testTarget.mySqrt(5));
        Assertions.assertEquals(2, testTarget.mySqrt(8));
        Assertions.assertEquals(46340, testTarget.mySqrt(2147395600));
    }

}
