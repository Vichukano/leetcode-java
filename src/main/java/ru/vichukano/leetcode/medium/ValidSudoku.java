package ru.vichukano.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        if (board==null) {
            return false;
        }
        List<Character> seg1 = new ArrayList<>(board.length);
        List<Character> seg2 = new ArrayList<>(board.length);
        List<Character> seg3 = new ArrayList<>(board.length);
        List<Character> seg4 = new ArrayList<>(board.length);
        List<Character> seg5 = new ArrayList<>(board.length);
        List<Character> seg6 = new ArrayList<>(board.length);
        List<Character> seg7 = new ArrayList<>(board.length);
        List<Character> seg8 = new ArrayList<>(board.length);
        List<Character> seg9 = new ArrayList<>(board.length);
        List<List<Character>> vertical = new ArrayList<>(board.length);
        List<List<Character>> horizon = new ArrayList<>(board.length);
        List<List<Character>> segAll = List.of(seg1, seg2, seg3, seg4, seg5, seg6, seg7, seg8, seg9);
        for (int i = 0; i < board.length; i++) {
            List<Character> vertic = new ArrayList<>(board.length);
            List<Character> horiz = new ArrayList<>(board.length);
            for (int j = 0; j < board.length; j++) {
                char hor = board[i][j];
                char vert = board[j][i];
                if (i <= 2 && j <= 2) {
                    seg1.add(board[i][j]);
                }
                if ((i <= 5 && i > 2) && j <= 2) {
                    seg2.add(board[i][j]);
                }
                if ((i > 5 && i <= 8) && j <= 2) {
                    seg3.add(board[i][j]);
                }
                if (i <= 2 && (j > 2 && j <= 5)) {
                    seg4.add(board[i][j]);
                }
                if (i <= 2 && (j > 5 && j <= 8)) {
                    seg5.add(board[i][j]);
                }
                if ((i <= 5 && i > 2) && (j > 2 && j <= 5)) {
                    seg6.add(board[i][j]);
                }
                if ((i <= 5 && i > 2) && (j > 5 && j <= 8)) {
                    seg7.add(board[i][j]);
                }
                if ((i <= 8 && i > 5) && (j > 2 && j <= 5)) {
                    seg8.add(board[i][j]);
                }
                if ((i <= 8 && i > 5) && (j > 5 && j <= 8)) {
                    seg9.add(board[i][j]);
                }
                horiz.add(hor);
                vertic.add(vert);
            }
            vertical.add(vertic);
            horizon.add(horiz);
        }
        final List<List<Character>> validVert = vertical.stream().map(list -> list.stream().filter(Character::isDigit).toList()).toList();
        final List<List<Character>> validHor = horizon.stream().map(list -> list.stream().filter(Character::isDigit).toList()).toList();
        final List<List<Character>> validSeg = segAll.stream().map(list -> list.stream().filter(Character::isDigit).toList()).toList();
        boolean result = true;
        for (var list : validVert) {
            var set = new HashSet<>(list);
            if (list.size()!=set.size()) {
                return false;
            }
        }
        for (var list : validHor) {
            var set = new HashSet<>(list);
            if (list.size()!=set.size()) {
                return false;
            }
        }
        for (var list : validSeg) {
            var set = new HashSet<>(list);
            if (list.size()!=set.size()) {
                return false;
            }
        }
        return true;
    }

}
