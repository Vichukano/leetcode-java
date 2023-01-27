package ru.vichukano.leetcode.easy;

public class BinarySearch {
    public int search(int[] nums, int target) {
        if (nums==null || nums.length==0) {
            return -1;
        }
        int lowIdx = 0;
        int highIdx = nums.length - 1;
        while (lowIdx <= highIdx) {
            int midIdx = lowIdx + ((highIdx - lowIdx) / 2);
            int testVal = nums[midIdx];
            if (testVal > target) {
                highIdx = midIdx - 1;
            } else if (testVal < target) {
                lowIdx = midIdx + 1;
            } else {
                return midIdx;
            }
        }
        return -1;
    }

}
