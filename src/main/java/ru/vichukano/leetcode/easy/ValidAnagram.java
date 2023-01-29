package ru.vichukano.leetcode.easy;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s==null || s.isBlank() || s.isEmpty()) {
            return false;
        }
        if (t==null || t.isBlank() || t.isEmpty()) {
            return false;
        }
        if (s.length()!=t.length()) {
            return false;
        }
        int sumS = s.chars().sum();
        int sumT = t.chars().sum();
        if (sumS!=sumT) {
            return false;
        }
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        for (int i = 0; i < charS.length; i++) {
            if (charS[i]!=charT[i]) {
                return false;
            }
        }
        return true;
    }

}
