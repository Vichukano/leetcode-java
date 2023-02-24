package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * ConcatenationOfArrayTest
 */
public class ConcatenationOfArrayTest {
  private final ConcatenationOfArray testTarget = new ConcatenationOfArray();

  @Test
  void test() {
    int[] arr1 = { 1, 2, 3, 4 };
    int[] arr2 = { 5, 4, 3, 2, 1 };

    Assertions.assertArrayEquals(new int[] { 1, 2, 3, 4, 1, 2, 3, 4 }, testTarget.getConcatenation(arr1));
    Assertions.assertArrayEquals(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 1 }, testTarget.getConcatenation(arr2));
  }

}
