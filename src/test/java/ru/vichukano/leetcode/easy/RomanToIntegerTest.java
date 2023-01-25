package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

    @Test
    void test() {
        var testTarget = new RomanToInteger();
        Assertions.assertEquals(3, testTarget.romanToInt("III"));
        Assertions.assertEquals(5, testTarget.romanToInt("V"));
        Assertions.assertEquals(4, testTarget.romanToInt("IV"));
        Assertions.assertEquals(58, testTarget.romanToInt("LVIII"));
        Assertions.assertEquals(1994, testTarget.romanToInt("MCMXCIV"));
    }

}
