package ru.vichukano.leetcode.medium;

import java.util.concurrent.Semaphore;

public class PrintFooBarAlternately {

    static class FooBar {
        private final Semaphore fooSemaphore = new Semaphore(0);
        private final Semaphore barSemaphore = new Semaphore(0);
        private int n;

        public FooBar(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                barSemaphore.release();
                fooSemaphore.acquire();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                barSemaphore.acquire();
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                fooSemaphore.release();
            }
        }
    }

}
