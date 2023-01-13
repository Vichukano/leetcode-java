package ru.vichukano.leetcode.medium;


import java.math.BigInteger;
import java.util.Arrays;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example 1:
 * <p>
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 * <p>
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 * <p>
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */
class AddTwoNumbers {

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var first = listToInt(l1);
        var second = listToInt(l2);
        BigInteger sum = first.add(second);
        return intToList(sum);
    }

    private ListNode intToList(BigInteger i) {
        if (i.compareTo(BigInteger.TEN) < 0) {
            return new ListNode(i.intValue());
        }
        var digits = Arrays.stream(String.valueOf(i).split("")).map(Integer::valueOf).toList();
        var node = new ListNode();
        var head = node;
        for (int j = digits.size() - 1; j >= 0; j--) {
            node.val = digits.get(j);
            if (j!=0) {
                node.next = new ListNode();
                node = node.next;
            }
        }
        return head;
    }

    private BigInteger listToInt(ListNode head) {
        if (head.next==null) {
            return BigInteger.valueOf(head.val);
        }
        var sb = new StringBuilder();
        sb.append(head.val);
        var next = head.next;
        while (next!=null) {
            sb.append(next.val);
            next = next.next;
        }
        return new BigInteger(sb.reverse().toString());
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


