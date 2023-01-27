package ru.vichukano.leetcode.easy;


/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (nums==null || nums.length==0) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        int resultIdx = -1;
        int nearestIdx = -1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            int testValue = nums[mid];
            if (testValue < target) {
                low = mid + 1;
            } else if (testValue > target) {
                high = mid - 1;
            } else {
                resultIdx = mid;
                break;
            }
            if (testValue - target >= 1) {
                nearestIdx = mid;
            } else if (testValue - target <= -1) {
                nearestIdx = mid + 1;
            }
        }
        return resultIdx==-1 ? nearestIdx:resultIdx;
    }

}
