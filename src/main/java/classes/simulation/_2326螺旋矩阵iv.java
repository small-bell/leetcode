package classes.simulation;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _2326螺旋矩阵iv {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        int l = 0,  r = n - 1, u = 0, d = m - 1;
        while (l <= r && u <= d) {
            for (int i = l; i <= r; i++) {
                if (head == null) {
                    ans[u][i] = -1;
                } else {
                    ans[u][i] = head.val;
                    head = head.next;
                }
            }
            u ++;

            for (int i = u; i <= d; i++) {
                if (head == null) {
                    ans[i][r] = -1;
                } else {
                    ans[i][r] = head.val;
                    head = head.next;
                }
            }
            r --;
            if (m > n && l > r) return ans;
            if (m < n && u > d) return ans;

            for (int i = r; i >= l; i--) {
                if (head == null) {
                    ans[d][i] = -1;
                } else {
                    ans[d][i] = head.val;
                    head = head.next;
                }
            }
            d --;
            for (int i = d; i >= u; i--) {
                if (head == null) {
                    ans[i][l] = -1;
                } else {
                    ans[i][l] = head.val;
                    head = head.next;
                }
            }
            l ++;

        }
        return ans;
    }


}
