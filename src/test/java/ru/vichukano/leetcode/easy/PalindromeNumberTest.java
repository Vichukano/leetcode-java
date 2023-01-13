package ru.vichukano.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import ru.vichukano.leetcode.easy.PalindromeNumber;

class PalindromeNumberTest {

    @Test
    void isPalindromeTest() {
        var testTarget = new PalindromeNumber();
        assertTrue(testTarget.isPalindrome(121));
        assertFalse(testTarget.isPalindrome(1121));
    }

}
