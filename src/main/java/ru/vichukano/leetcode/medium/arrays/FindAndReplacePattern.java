package ru.vichukano.leetcode.medium.arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Given a list of strings words and a string pattern, return a list of words[i]
 * that match pattern. You may return the answer in any order.
 * A word matches the pattern if there exists a permutation of letters p so that
 * after replacing every letter x in the pattern with p(x), we get the desired
 * word.
 * every letter maps to another letter, and no two letters map to the same
 * letter.
 * 
 * Example 1:
 * Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
 * Output: ["mee","aqq"]
 * Explanation: "mee" matches the pattern because there is a permutation {a ->
 * m, b -> e, ...}.
 * "ccc" does not match the pattern because {a -> c, b -> c, ...} is not a
 * permutation, since a and b map to the same letter.
 * 
 * Example 2:
 * Input: words = ["a","b","c"], pattern = "a"
 * Output: ["a","b","c"]
 */
public class FindAndReplacePattern {

  public List<String> findAndReplacePattern(String[] words, String pattern) {
    if (words == null || pattern == null) {
      return null;
    }
    String compiledPatter = compile(pattern);
    List<String> result = new LinkedList<>();
    for (String s : words) {
      if (s.length() != pattern.length()) {
        continue;
      }
      if (s.equals(pattern)) {
        result.add(s);
        continue;
      }
      String compiledString = compile(s);
      if (compiledPatter.equals(compiledString)) {
        result.add(s);
      }
    }
    return result;
  }

  private String compile(String raw) {
    StringBuilder sb = new StringBuilder();
    char count = 'a';
    Map<Character, Character> map = new HashMap<>();
    for (int index = 0; index < raw.length(); index++) {
      if (index == 0) {
        sb.append(count);
        map.put(raw.charAt(index), count);
      } else {
        char next = raw.charAt(index);
        if (map.containsKey(next)) {
          sb.append(map.get(next));
        } else {
          map.put(next, ++count);
          sb.append(count);
        }
      }
    }
    return sb.toString();
  }

}
