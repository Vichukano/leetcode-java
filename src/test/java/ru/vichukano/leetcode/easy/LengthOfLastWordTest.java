package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthOfLastWordTest {

    @Test
    void test() {
        var testTarget = new LengthOfLastWord();
        Assertions.assertEquals(5, testTarget.lengthOfLastWord("Hello World"));
        Assertions.assertEquals(4, testTarget.lengthOfLastWord("   fly me   to   the moon  "));
        Assertions.assertEquals(6, testTarget.lengthOfLastWord("luffy is still joyboy"));
    }

}