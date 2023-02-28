package ru.vichukano.leetcode.easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * MaximumNumberOfWordsFoundInSentencesTest
 */
public class MaximumNumberOfWordsFoundInSentencesTest {
  private final MaximumNumberOfWordsFoundInSentences testTarget = new MaximumNumberOfWordsFoundInSentences();

  @Test
  void test() {
    String[] arr = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };

    Assertions.assertEquals(6, testTarget.mostWordsFound(arr));

    String[] arr2 = {"rjtrogrmvpzm vezxyl irqufo"};
    Assertions.assertEquals(3, testTarget.mostWordsFound(arr2));
  }

}
