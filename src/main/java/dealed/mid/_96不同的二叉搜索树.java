package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _96不同的二叉搜索树 {
    public int numTrees(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int[] f = new int[n + 1];
        f[0] = 1;
        f[1] = 1;
        f[2] = 2;
        for (int i = 3; i <= n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                f[i] += f[j] * f[i - j - 1];
            }
        }
        return f[n];
    }   


}
