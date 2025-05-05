package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _97交错字符串 {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        boolean[][] f = new boolean[s1.length() +1][s2.length() + 1];
        f[0][0] = true;
        for (int i = 1; i <= s1.length(); i++) {
            if (s1.charAt(i - 1) == s3.charAt(i - 1)) f[i][0] = true;
            else break;
        }

        for (int i = 1; i <= s2.length() ; i++) {
            if (s2.charAt(i - 1) == s3.charAt(i - 1)) f[0][i] = true;
            else break;
        }
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                f[i][j] = (f[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1))
                        || (f[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }
        return f[s1.length()][s2.length()];
    }


}
