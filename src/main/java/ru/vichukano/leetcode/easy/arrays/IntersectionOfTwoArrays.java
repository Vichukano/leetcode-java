package ru.vichukano.leetcode.easy.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two integer arrays nums1 and nums2, return an array of their
 * intersection. Each element in the result must be unique and you may return
 * the result in any order.
 * 
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * 
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 */
public class IntersectionOfTwoArrays {

  public int[] intersection(int[] nums1, int[] nums2) {
    if (nums1 == null || nums2 == null) {
      return null;
    }
    int[] min = nums1.length > nums2.length ? nums2 : nums1;
    int[] max = nums1.length > nums2.length ? nums1 : nums2;
    Set<Integer> minSet = new HashSet<>(min.length);
    Set<Integer> maxSet = new HashSet<>(max.length);
    for (int i = 0; i < max.length; i++) {
      maxSet.add(max[i]);
    }
    for (int i = 0; i < min.length; i++) {
      minSet.add(min[i]);
    }
    List<Integer> resultList = new ArrayList<>(min.length);
    for (Integer val : minSet) {
      if (maxSet.contains(val)) {
        resultList.add(val);
      }
    }
    int[] result = new int[resultList.size()];
    int count = 0;
    for (Integer i : resultList) {
      result[count++] = i;
    }
    return result;
  }

}
