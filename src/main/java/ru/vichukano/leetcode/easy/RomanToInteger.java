package ru.vichukano.leetcode.easy;

import java.util.ArrayList;
import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> DIC = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        if (s==null || s.isEmpty() || s.isBlank()) {
            return -1;
        }
        var list = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            Integer res = switch (c) {
                case 'I' -> {
                    Integer r;
                    boolean hasNext = i - (s.length() - 1)!=0;
                    if (hasNext) {
                        int n = i + 1;
                        var nextC = s.charAt(n);
                        if (nextC=='V') {
                            r = 4;
                            i++;
                        } else if (nextC=='X') {
                            r = 9;
                            i++;
                        } else {
                            r = DIC.get(c);
                        }
                    } else {
                        r = DIC.get(c);
                    }
                    yield r;
                }
                case 'X' -> {
                    Integer r;
                    boolean hasNext = i - (s.length() - 1)!=0;
                    if (hasNext) {
                        int n = i + 1;
                        var nextC = s.charAt(n);
                        if (nextC=='L') {
                            r = 40;
                            i++;
                        } else if (nextC=='C') {
                            i++;
                            r = 90;
                        } else {
                            r = DIC.get(c);
                        }
                    } else {
                        r = DIC.get(c);
                    }
                    yield r;
                }
                case 'C' -> {
                    Integer r;
                    boolean hasNext = i - (s.length() - 1)!=0;
                    if (hasNext) {
                        int n = i + 1;
                        var nextC = s.charAt(n);
                        if (nextC=='D') {
                            r = 400;
                            i++;
                        } else if (nextC=='M') {
                            r = 900;
                            i++;
                        } else {
                            r = DIC.get(c);
                        }
                    } else {
                        r = DIC.get(c);
                    }
                    yield r;
                }
                default -> DIC.get(c);
            };
            list.add(res);
        }
        return list.stream().reduce(Integer::sum).orElseThrow();
    }

}
