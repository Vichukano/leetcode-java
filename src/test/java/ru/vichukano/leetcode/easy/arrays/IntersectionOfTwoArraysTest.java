package ru.vichukano.leetcode.easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * IntersectionOfTwoArraysTest
 */
public class IntersectionOfTwoArraysTest {
  private final IntersectionOfTwoArrays testTarget = new IntersectionOfTwoArrays();

  @Test
  void test() {
    Assertions.assertArrayEquals(new int[] { 2 },
        testTarget.intersection(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }));
    Assertions.assertArrayEquals(new int[] { 4, 9 },
        testTarget.intersection(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 }));
  }

}
