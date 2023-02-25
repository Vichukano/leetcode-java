package ru.vichukano.leetcode.easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * BuildArrayFromPermutationTest
 */
public class BuildArrayFromPermutationTest {
  private final BuildArrayFromPermutation testTarget = new BuildArrayFromPermutation();

  @Test
  void test() {
    int[] arr1 = { 0, 2, 1, 5, 3, 4 };
    int[] arr2 = { 5, 0, 1, 2, 3, 4 };

    Assertions.assertArrayEquals(new int[] { 0, 1, 2, 4, 5, 3 }, testTarget.buildArray(arr1));
    Assertions.assertArrayEquals(new int[] { 4, 5, 0, 1, 2, 3 }, testTarget.buildArray(arr2));
  }

}
