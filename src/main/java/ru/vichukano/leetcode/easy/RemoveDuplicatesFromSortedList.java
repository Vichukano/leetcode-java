package ru.vichukano.leetcode.easy;

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next==null) {
            return head;
        }
        ListNode newHead = head;
        while (newHead.next!=null) {
            if (newHead.val==newHead.next.val) {
                newHead.next = newHead.next.next;
            } else {
                newHead = newHead.next;
            }
        }
        return head;
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
