package ru.vichukano.leetcode.medium;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrintZeroEvenOddTest {

    @Test
    void test() {
        var testTarget = new PrintZeroEvenOdd.ZeroEvenOdd(10);
        new Thread(() -> {
            try {
                testTarget.zero(System.out::print);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                testTarget.even(System.out::print);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                testTarget.odd(System.out::print);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

}