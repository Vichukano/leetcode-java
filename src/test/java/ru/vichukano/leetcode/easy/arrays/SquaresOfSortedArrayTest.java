package ru.vichukano.leetcode.easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * SquaresOfSortedArrayTest
 */
public class SquaresOfSortedArrayTest {
  private final SquaresOfSortedArray testTarget = new SquaresOfSortedArray();

  @Test
  void test() {
    Assertions.assertArrayEquals(new int[] { 0, 1, 9, 16, 100 },
        testTarget.sortedSquares(new int[] { -4, -1, 0, 3, 10 }));
  }

}
