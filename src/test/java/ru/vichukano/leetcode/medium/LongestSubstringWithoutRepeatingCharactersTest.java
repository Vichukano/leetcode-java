package ru.vichukano.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstringTest() {
        var testTarget = new LongestSubstringWithoutRepeatingCharacters();
        Assertions.assertEquals(3, testTarget.lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(1, testTarget.lengthOfLongestSubstring("bbbbb"));
        Assertions.assertEquals(3, testTarget.lengthOfLongestSubstring("pwwkew"));
        Assertions.assertEquals(2, testTarget.lengthOfLongestSubstring("aab"));
    }

}
