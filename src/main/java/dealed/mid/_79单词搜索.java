package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _79单词搜索 {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(i, j, word, 0, board)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, String word, int idx, char[][] board) {
        if (idx == word.length()) {
            return true;
        }
        if (i < 0 || i == board.length || j < 0 || j == board[0].length) return false;
        if (word.charAt(idx) != board[i][j]) return false;

        int[][] dirs = new int[][] {
                {1, 0}, {-1, 0}, {0, 1},{0, -1}
        };

        char tmp = board[i][j];
        board[i][j] = '0';
        for (int k = 0; k < dirs.length; k++) {
            if (dfs(i + dirs[k][0], j + dirs[k][1], word, idx +1, board)) {
                return true;
            }
        }
        board[i][j] = tmp;
        return false;
    }


}
