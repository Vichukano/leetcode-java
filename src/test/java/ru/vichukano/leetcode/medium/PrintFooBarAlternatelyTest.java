package ru.vichukano.leetcode.medium;

import org.junit.jupiter.api.Test;

class PrintFooBarAlternatelyTest {

    @Test
    void test() {
        var testTarget = new PrintFooBarAlternately.FooBar(5);
        new Thread(() -> {
            try {
                testTarget.foo(() -> System.out.println("foo"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                testTarget.bar(() -> System.out.println("bar"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

    }

}