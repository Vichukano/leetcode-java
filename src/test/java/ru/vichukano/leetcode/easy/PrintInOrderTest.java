package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Test;

class PrintInOrderTest {

    @Test
    void test() {
        var testTarget = new PrintInOrder();
        new Thread(() -> {
            try {
                testTarget.first(() -> System.out.println("first"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                testTarget.second(() -> System.out.println("second"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                testTarget.third(() -> System.out.println("third"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

}