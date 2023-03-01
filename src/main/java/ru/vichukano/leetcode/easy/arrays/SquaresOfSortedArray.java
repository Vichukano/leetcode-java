package ru.vichukano.leetcode.easy.arrays;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array
 * of the squares of each number sorted in non-decreasing order.
 * 
 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * 
 * Example 2:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class SquaresOfSortedArray {

  public int[] sortedSquares(int[] nums) {
    if (nums == null || nums.length == 0) {
      return nums;
    }
    int start = 0;
    int end = nums.length - 1;
    int[] result = new int[nums.length];
    for (int i = nums.length - 1; i >= 0; i--) {
      int first = Math.abs(nums[start]);
      int last = Math.abs(nums[end]);
      if (first >= last) {
        result[i] = first * first;
        start++;
      } else{
        result[i] = last * last;
        end--;
      }
    }
    return result;
  }

}
