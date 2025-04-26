package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _72编辑距离 {
    public int minDistance(String ss, String tt) {
        int[][] dp = new int[ss.length() + 1][tt.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= ss.length(); i ++){
            for(int j = 1; j <= tt.length(); j++){
                if(ss.charAt(i - 1) == tt.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
            }
        }
        return dp[ss.length()][tt.length()];
    }


}
