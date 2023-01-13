package ru.vichukano.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vichukano.leetcode.medium.AddTwoNumbers;
import ru.vichukano.leetcode.medium.AddTwoNumbers.ListNode;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbersTest() {
        var testTarget = new AddTwoNumbers();
        var first = new ListNode(2);
        first.next = new ListNode(4);
        first.next.next = new ListNode(3);
        var second = new ListNode(5);
        second.next = new ListNode(6);
        second.next.next = new ListNode(4);
        final ListNode result = testTarget.addTwoNumbers(first, second);
        Assertions.assertEquals(7, result.val);
        Assertions.assertEquals(0, result.next.val);
        Assertions.assertEquals(8, result.next.next.val);
        Assertions.assertNull(result.next.next.next);
    }
}
