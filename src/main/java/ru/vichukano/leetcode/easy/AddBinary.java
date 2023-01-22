package ru.vichukano.leetcode.easy;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 * <p>
 * Example 1:
 * <p>
 * Input: a = "11", b = "1"
 * Output: "100"
 * <p>
 * Example 2:
 * <p>
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        var result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sum += carry;
            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }

}
