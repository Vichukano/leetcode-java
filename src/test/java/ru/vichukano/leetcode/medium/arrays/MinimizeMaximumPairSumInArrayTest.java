package ru.vichukano.leetcode.medium.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * MinimizeMaximumPairSumInArrayTest
 */
public class MinimizeMaximumPairSumInArrayTest {
  private final MinimizeMaximumPairSumInArray testTarget = new MinimizeMaximumPairSumInArray();

  @Test
  void test() {
    Assertions.assertEquals(7, testTarget.minPairSum(new int[] { 3, 5, 2, 3 }));
  }

}
