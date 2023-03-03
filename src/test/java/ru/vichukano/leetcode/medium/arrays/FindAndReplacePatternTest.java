package ru.vichukano.leetcode.medium.arrays;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * FindAndReplacePatternTest
 */
public class FindAndReplacePatternTest {
  private final FindAndReplacePattern testTarget = new FindAndReplacePattern();

  @Test
  void test() {
    Assertions.assertEquals(List.of("mee", "aqq"),
        testTarget.findAndReplacePattern(new String[] { "abc", "deq", "mee", "aqq", "dkd", "ccc" }, "abb"));
    Assertions.assertEquals(List.of("a","b","c"),
        testTarget.findAndReplacePattern(new String[] { "a","b","c" }, "b"));
    Assertions.assertEquals(List.of("abc","cba"),
        testTarget.findAndReplacePattern(new String[] { "abc","cba","xyx","yxx","yyx" }, "abc"));
  }

}
