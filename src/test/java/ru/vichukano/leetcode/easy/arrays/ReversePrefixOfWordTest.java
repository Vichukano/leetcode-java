package ru.vichukano.leetcode.easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * ReversePrefixOfWordTest
 */
public class ReversePrefixOfWordTest {
  private final ReversePrefixOfWord testTraget = new ReversePrefixOfWord();

  @Test
  void test() {
    Assertions.assertEquals("dcbaefd", testTraget.reversePrefix("abcdefd", 'd'));
    Assertions.assertEquals("zxyxxe", testTraget.reversePrefix("xyxzxe", 'z'));
  }

}
