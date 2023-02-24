package ru.vichukano.leetcode.easy.arrays;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] =
 * sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * 
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * 
 * Example 2:
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1,
 * 1+1+1+1+1].
 * 
 * Example 3:
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 */
public class RunningSummOfArray {

  public int[] runningSum(int[] nums) {
    if (nums == null || nums.length == 1) {
      return nums;
    }
    for (int i = nums.length - 1; i >= 0; i--) {
      nums[i] = sum(nums, i);
    }
    return nums;
  }

  private int sum(int[] arr, int idx) {
    if (idx == 0) {
      return arr[idx];
    }
    return arr[idx] + sum(arr, --idx);
  }

}
