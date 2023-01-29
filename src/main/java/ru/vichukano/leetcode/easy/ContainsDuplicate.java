package ru.vichukano.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums==null || nums.length==0 || nums.length==1) {
            return false;
        }
        int originLen = nums.length;
        final HashSet<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));
        return originLen != set.size();
    }
}
