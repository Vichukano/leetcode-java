package ru.vichukano.leetcode.medium;

import java.util.Set;
import java.util.TreeSet;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 * <p>
 * Example 1:
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * Example 2:
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 * 9,1,4,7,3,-1,0,5,8,-1,6
 * -1,-1,0,1,3,4,5,6,7,8,9
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums==null || nums.length==0) {
            return 0;
        }
        if (nums.length==1) {
            return 1;
        }
        Set<Integer> set = new TreeSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int count = 1;
        int best = count;
        for (Integer s : set) {
            int next = s + 1;
            if (set.contains(next)) {
                count++;
            } else {
                best = Math.max(best, count);
                count = 1;
            }
        }
        return best;
    }

}
