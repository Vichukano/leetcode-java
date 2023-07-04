package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddBinaryTest {

    @Test
    void shouldAddBinary() {
        var testTarget = new AddBinary();
        Assertions.assertEquals("111", testTarget.addBinary("110", "1"));
    }

}