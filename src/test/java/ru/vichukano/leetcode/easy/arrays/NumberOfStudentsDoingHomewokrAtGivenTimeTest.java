package ru.vichukano.leetcode.easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * NumberOfStudentsDoingHomewokrAtGivenTimeTest
 */
public class NumberOfStudentsDoingHomewokrAtGivenTimeTest {
  private final NumberOfStudentsDoingHomewokrAtGivenTime testTarget = new NumberOfStudentsDoingHomewokrAtGivenTime();

  @Test
  void test() {
    Assertions.assertEquals(1, testTarget.busyStudent(new int[] { 1, 2, 3 }, new int[] { 3, 2, 7 }, 4));
    Assertions.assertEquals(1, testTarget.busyStudent(new int[] { 4 }, new int[] { 4 }, 4));
  }

}
