package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _57插入区间 {
    public int[][] insert(int[][] is, int[] nis) {
        if (is.length == 0) return new int[][] {nis};
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        for (; i < is.length; i++) {
            if (is[i][1] >= nis[0]) {
                break;
            }
            ans.add(is[i]);
        }

        int l = nis[0], r = nis[1];
        for (; i < is.length; i++) {
            if (is[i][0] > r) break;
            l = Math.min(is[i][0], l);
            r = Math.max(is[i][1], r);
        }
        ans.add(new int[] {l, r});

        for (; i < is.length; i++) {
            ans.add(is[i]);
        }

        if (nis[0] > ans.get(ans.size() - 1)[1]) {
            ans.add(nis);
        }
        return ans.toArray(new int[ans.size()][2]);
    }


}
