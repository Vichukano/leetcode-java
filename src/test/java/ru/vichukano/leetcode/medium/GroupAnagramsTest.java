package ru.vichukano.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GroupAnagramsTest {

    @Test
    void test() {
        var testTarget = new GroupAnagrams();
        Assertions.assertEquals(3, testTarget.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).size());
    }

}