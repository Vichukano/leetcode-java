package ru.vichukano.leetcode.easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * RunningSummOfArrayTest
 */
public class RunningSummOfArrayTest {
  private final RunningSummOfArray testTarget = new RunningSummOfArray();

  @Test
  void test() {
    int[] arr1 = { 1, 2, 3, 4 };
    int[] arr2 = { 1, 1, 1, 1, 1 };
    int[] arr3 = { 3, 1, 2, 10, 1 };

    Assertions.assertArrayEquals(new int[] { 1, 3, 6, 10 }, testTarget.runningSum(arr1));
    Assertions.assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, testTarget.runningSum(arr2));
    Assertions.assertArrayEquals(new int[] { 3, 4, 6, 16, 17 }, testTarget.runningSum(arr3));
  }

}
