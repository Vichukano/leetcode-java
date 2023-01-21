package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vichukano.leetcode.easy.MergeTwoSortedLists.ListNode;

class MergeTwoSortedListsTest {

    @Test
    void test() {
        var testTarget = new MergeTwoSortedLists();
        var one = new ListNode(1, new ListNode(2, new ListNode(4)));
        var two = new ListNode(1, new ListNode(3, new ListNode(4)));
        var merge = testTarget.mergeTwoLists(one, two);
        Assertions.assertEquals(1, merge.val);
        Assertions.assertEquals(1, merge.next.val);
        Assertions.assertEquals(2, merge.next.next.val);
        Assertions.assertEquals(3, merge.next.next.next.val);
        Assertions.assertEquals(4, merge.next.next.next.next.val);
        Assertions.assertEquals(4, merge.next.next.next.next.next.val);
    }

}