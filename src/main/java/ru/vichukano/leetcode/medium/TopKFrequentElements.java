package ru.vichukano.leetcode.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 347. Top K Frequent Elements
 * Medium
 * 12.5K
 * 462
 * Companies
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * <p>
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        if (nums==null) {
            return null;
        }
        if (nums.length==1) {
            return nums;
        }
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        final List<Entry<Integer, Integer>> entries = map.entrySet().stream()
                .sorted((f, s) -> Comparator.<Integer>reverseOrder().compare(f.getValue(), s.getValue()))
                .toList();
        int[] result = new int[k];
        while (k!=0) {
            result[k - 1] = entries.get(k - 1).getKey();
            k--;
        }
        return result;
    }

}
