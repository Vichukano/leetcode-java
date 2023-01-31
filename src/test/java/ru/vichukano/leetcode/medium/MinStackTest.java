package ru.vichukano.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinStackTest {

    @Test
    void test() {
        var testTarget = new MinStack();
        testTarget.push(-2);
        testTarget.push(0);
        testTarget.push(-3);
        Assertions.assertEquals(-3, testTarget.top());
        testTarget.pop();
        Assertions.assertEquals(0, testTarget.top());
        Assertions.assertEquals(-2, testTarget.getMin());
    }

}