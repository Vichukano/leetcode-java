package ru.vichukano.leetcode.easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * ShuffleTheArrayTest
 */
public class ShuffleTheArrayTest {
  private final ShuffleTheArray testTarget = new ShuffleTheArray();

  @Test
  void test() {
    int[] arr1 = { 2, 5, 1, 3, 4, 7 };
    int[] arr2 = { 1, 2, 3, 4, 4, 3, 2, 1 };
    int[] arr3 = { 1, 1, 2, 2 };

    Assertions.assertArrayEquals(new int[] { 2, 3, 5, 4, 1, 7 }, testTarget.shuffle(arr1, 3));
    Assertions.assertArrayEquals(new int[] { 1, 4, 2, 3, 3, 2, 4, 1 }, testTarget.shuffle(arr2, 4));
    Assertions.assertArrayEquals(new int[] { 1, 2, 1, 2 }, testTarget.shuffle(arr3, 2));
  }

}
