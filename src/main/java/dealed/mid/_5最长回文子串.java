package dealed.mid;

import java.util.Arrays;

public class _5最长回文子串 {
    // 中心扩散
    int max = 0;
    int low = 0;
    public String longestPalindrome1(String s) {
        for (int i = 0; i < s.length(); i++) {
            check(s, i, i);
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) check(s, i, i + 1);
        }
        return s.substring(low, low + max);
    }

    private int check(String s, int i, int j) {
        int l = i - 1, r = j + 1;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l --;
            r ++;
        }
        int len = r - l - 1;
        if (len > max) {
            max = len;
            low = l + 1;
        }
        return len;
    }

    // dp1倒序按行
    public String longestPalindrome2(String s) {
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            dp[i][i] = 1;
        }

        int max = 1;
        int low = 0;
        for (int i = s.length(); i > 0; i--) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (s.charAt(i - 1) == s.charAt(j - 1)) dp[i][j] = dp[i + 1][j - 1] > 0 || j - i <= 2 ? 1 : 0;
                if(dp[i][j] > 0 && j - i + 1 > max ) {
                    max = j - i + 1;
                    low = i - 1;
                }
            }
        }

        return s.substring(low, low + max);
    }


    // dp2按列dp
    public String longestPalindrome(String s) {
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            dp[i][i] = 1;
        }

        int max = 1;
        int low = 0;
        for (int j = 1; j <= s.length(); j++) {
            for (int i = 1; i < j; i++) {
                if (s.charAt(i - 1) == s.charAt(j - 1) && (j - i <= 2 || dp[i + 1][j - 1] > 0)) {
                    dp[i][j] = 1;
                    if (j - i + 1 > max) {
                        max = j - i + 1;
                        low = i - 1;
                    }
                }
            }
        }
        return s.substring(low, low + max);
    }

    public static void main(String[] args) {
        String babad = new _5最长回文子串().longestPalindrome("babad");
        System.out.println(babad);
    }

}
