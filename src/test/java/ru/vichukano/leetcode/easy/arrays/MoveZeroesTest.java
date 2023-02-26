package ru.vichukano.leetcode.easy.arrays;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * MoveZeroesTest
 */
public class MoveZeroesTest {
  private final MoveZeroes testTarget = new MoveZeroes();

  @Test
  void test() {
    int[] arr = { 0, 1, 0, 3, 12 };
    int[] expected = { 1, 3, 12, 0, 0 };
    testTarget.moveZeroes(arr);
    System.out.println(Arrays.toString(arr));
    Assertions.assertArrayEquals(expected, arr);
    int[] arr2 = { 0, 0, 1 };
    int[] expected2 = { 1, 0, 0 };
    testTarget.moveZeroes(arr2);
    System.out.println(Arrays.toString(arr2));
    Assertions.assertArrayEquals(expected2, arr2);
  }

}
