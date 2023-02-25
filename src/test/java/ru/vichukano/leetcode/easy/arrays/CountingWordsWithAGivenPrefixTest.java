package ru.vichukano.leetcode.easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * CountingWordsWithAGivenPrefixTest
 */
public class CountingWordsWithAGivenPrefixTest {
  private final CountingWordsWithAGivenPrefix testTarget = new CountingWordsWithAGivenPrefix();

  @Test
  void test() {
    Assertions.assertEquals(2, testTarget.prefixCount(
        new String[] { "pay", "attention", "practice", "attend" }, "at"));
    Assertions.assertEquals(0, testTarget.prefixCount(
        new String[] { "leetcode", "win", "loops", "success" }, "code"));
  }

}
