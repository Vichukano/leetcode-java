package ru.vichukano.leetcode.easy.arrays;

/**
 * You are given an array of strings words and a string pref.
 * Return the number of strings in words that contain pref as a prefix.
 * A prefix of a string s is any leading contiguous substring of s.
 * 
 * Example 1:
 * Input: words = ["pay","attention","practice","attend"], pref = "at"
 * Output: 2
 * Explanation: The 2 strings that contain "at" as a prefix are: "attention" and
 * "attend".
 * 
 * Example 2:
 * Input: words = ["leetcode","win","loops","success"], pref = "code"
 * Output: 0
 * Explanation: There are no strings that contain "code" as a prefix.
 */
public class CountingWordsWithAGivenPrefix {

  public int prefixCount(String[] words, String pref) {
    if (words == null || words.length == 0) {
      return -1;
    }
    int count = 0;
    for (var s : words) {
      if (isPrefix(pref, s)) {
        count++;
      }
    }
    return count;
  }

  private boolean isPrefix(String pref, String test) {
    if (test.length() < pref.length()) {
      return false;
    }
    int idx = 0;
    while (idx < pref.length()) {
      char c = pref.charAt(idx);
      if (c != test.charAt(idx)) {
        return false;
      }
      idx++;
    }
    return true;
  }

}
