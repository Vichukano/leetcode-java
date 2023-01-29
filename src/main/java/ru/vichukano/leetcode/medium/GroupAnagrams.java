package ru.vichukano.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * <p>
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs==null || strs.length==0) {
            return List.of();
        }
        if (strs.length==1) {
            return List.of(List.of(strs[0]));
        }
        Map<String, List<String>> anaMap = new HashMap<>(strs.length);
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = String.valueOf(arr);
            if (anaMap.containsKey(sorted)) {
                anaMap.get(sorted).add(s);
            } else {
                var list = new LinkedList<String>();
                list.add(s);
                anaMap.put(sorted, list);
            }
        }
        return anaMap.values().stream().toList();
    }

}
