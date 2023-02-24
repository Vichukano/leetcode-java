package ru.vichukano.leetcode.easy.arrays;

/**
 * Given the array nums consisting of 2n elements in the form
 * [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * 
 * Example 1:
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is
 * [2,3,5,4,1,7].
 * 
 * Example 2:
 * Input: nums = [1,2,3,4,4,3,2,1], n = 4
 * Output: [1,4,2,3,3,2,4,1]
 * 
 * Example 3:
 * Input: nums = [1,1,2,2], n = 2
 * Output: [1,2,1,2]
 */
public class ShuffleTheArray {

  public int[] shuffle(int[] nums, int n) {
    if (nums == null) {
      return null;
    }
    if (n == 0) {
      return nums;
    }
    int inIdx = 0;
    int startIdx = 0;
    int midIdx = n;
    int[] shuffled = new int[nums.length];
    while (midIdx < nums.length || startIdx < n) {
      shuffled[startIdx++] = nums[inIdx++];
      shuffled[startIdx++] = nums[midIdx++];
    }
    return shuffled;
  }

}
