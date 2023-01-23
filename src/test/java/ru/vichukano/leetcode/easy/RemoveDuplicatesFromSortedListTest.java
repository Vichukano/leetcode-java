package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vichukano.leetcode.easy.RemoveDuplicatesFromSortedList.ListNode;

class RemoveDuplicatesFromSortedListTest {

    @Test
    void test() {
        var testTarget = new RemoveDuplicatesFromSortedList();
        var list = new ListNode(1, new ListNode(1, new ListNode(2)));
        Assertions.assertEquals(1, testTarget.deleteDuplicates(list).val);
        Assertions.assertEquals(2, testTarget.deleteDuplicates(list).next.val);
        Assertions.assertNull(testTarget.deleteDuplicates(list).next.next);
    }

}
