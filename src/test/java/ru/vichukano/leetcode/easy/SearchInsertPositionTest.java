package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {

    @Test
    void test() {
        var testTarget = new SearchInsertPosition();
        Assertions.assertEquals(1, testTarget.searchInsert(new int[]{1, 2, 3, 4, 6}, 2));
        Assertions.assertEquals(2, testTarget.searchInsert(new int[]{1, 2, 3, 4}, 3));
        Assertions.assertEquals(1, testTarget.searchInsert(new int[]{1, 3, 4, 5, 6, 7}, 2));
    }

}
