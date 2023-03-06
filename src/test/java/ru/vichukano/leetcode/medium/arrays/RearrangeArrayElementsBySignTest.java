package ru.vichukano.leetcode.medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * RearrangeArrayElementsBySignTest
 */
public class RearrangeArrayElementsBySignTest {
  private final RearrangeArrayElementsBySign testTarget = new RearrangeArrayElementsBySign();

  @Test
  void test() {
    Assertions.assertArrayEquals(new int[] { 3, -2, 1, -5, 2, -4 },
        testTarget.rearrangeArray(new int[] { 3, 1, -2, -5, 2, -4 }));
    Assertions.assertArrayEquals(new int[] { 1, -1 },
        testTarget.rearrangeArray(new int[] { -1, 1 }));
  }

}
