package ru.vichukano.leetcode.easy;


/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * Example 1:
 * <p>
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int lastIndx = digits.length - 1;
        int res = plus(digits, lastIndx, 1);
        while (res==0) {
            res = plus(digits, --lastIndx, 1);
        }
        if (digits[0] == 0) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = 1;
            System.arraycopy(digits, 0, newArr, 1, digits.length);
            digits = newArr;
        }
        return digits;
    }

    private int plus(int[] arr, int pos, int x) {
        if (pos < 0) {
            return -1;
        }
        int res = arr[pos] + x;
        if (res==10) {
            res = 0;
        }
        arr[pos] = res;
        return res;
    }

}
