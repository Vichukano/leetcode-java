package ru.vichukano.leetcode.medium;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Five silent philosophers sit at a round table with bowls of spaghetti. Forks are placed between each pair of adjacent philosophers.
 * <p>
 * Each philosopher must alternately think and eat.
 * However, a philosopher can only eat spaghetti when they have both left and right forks.
 * Each fork can be held by only one philosopher and so a philosopher can use the fork only if it is not being used by another philosopher.
 * After an individual philosopher finishes eating, they need to put down both forks so that the forks become available to others.
 * A philosopher can take the fork on their right or the one on their left as they become available, but cannot start eating before getting both forks.
 * <p>
 * Eating is not limited by the remaining amounts of spaghetti or stomach space; an infinite supply and an infinite demand are assumed.
 * <p>
 * Design a discipline of behaviour (a concurrent algorithm) such that no philosopher will starve;
 * i.e., each can forever continue to alternate between eating and thinking, assuming that no philosopher can know when others may want to eat or think.
 */
public class TheDiningPhilosophers {
    private final Lock leftForkLock = new ReentrantLock();
    private final Lock rightForkLock = new ReentrantLock();

    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        if (leftForkLock.tryLock(1, TimeUnit.SECONDS)
                && rightForkLock.tryLock(1, TimeUnit.SECONDS)) {
            pickLeftFork.run();
            pickRightFork.run();
            eat.run();
            putLeftFork.run();
            putRightFork.run();
            leftForkLock.unlock();
            rightForkLock.unlock();
        }
    }

}
