package ru.vichukano.leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        var stringList = Arrays.stream(s.split("")).toList();
        var set = new HashSet<String>(stringList.size());
        int counter = 0;
        int max = counter;
        for (var str : stringList) {
            int currSizer = set.size();
            set.add(str);
            if (currSizer < set.size()) {
                counter++;
                if (counter > max) {
                    max = counter;
                }
            } else {
                set.clear();
                set.add(str);
                counter = 1;
            }
        }
        return max;
    }

}
