package ru.vichukano.leetcode.easy;

public class Sqrt {

    public int mySqrt(int x) {
        if (x==0) {
            return 0;
        }
        if (x==1 || x==2 || x==3) {
            return 1;
        }
        long res = 0;
        for (long i = 1; i <= x; i++) {
            if (i * i <= x) {
                res = i;
            } else {
                break;
            }
        }
        return (int) res;
    }

}
