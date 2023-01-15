package ru.vichukano.leetcode.medium;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class PrintZeroEvenOdd {

    static class ZeroEvenOdd {
        private final AtomicInteger evenNum = new AtomicInteger(2);
        private final AtomicInteger oddNum = new AtomicInteger(1);
        private final Semaphore zeroSema = new Semaphore(0);
        private final Semaphore evenSema = new Semaphore(0);
        private final Semaphore oddSema = new Semaphore(0);
        private final AtomicBoolean evenOddSwitch = new AtomicBoolean(false);
        private int n;

        public ZeroEvenOdd(int n) {
            this.n = n;
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                printNumber.accept(0);
                if (evenOddSwitch.get()) {
                    evenSema.release();
                    evenOddSwitch.set(false);
                } else {
                    oddSema.release();
                    evenOddSwitch.set(true);
                }
                zeroSema.acquire();
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                evenSema.acquire();
                printNumber.accept(evenNum.getAndAdd(2));
                zeroSema.release();
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                oddSema.acquire();
                printNumber.accept(oddNum.getAndAdd(2));
                zeroSema.release();
            }
        }
    }

}
