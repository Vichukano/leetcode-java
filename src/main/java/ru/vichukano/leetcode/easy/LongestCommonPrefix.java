package ru.vichukano.leetcode.easy;

import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs==null || strs.length==0) {
            return "";
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int counter = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i)==last.charAt(i)) {
                counter++;
            } else {
                break;
            }
        }
        return counter==0 ? "":first.substring(0, counter);
    }

}
