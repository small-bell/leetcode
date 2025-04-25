package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _56合并区间 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int[] cur = intervals[i];
            int l = cur[0], r = cur[1];
            int j = i + 1;
            for (; j < intervals.length && intervals[j][0] <= r ; j++) {
                r = Math.max(intervals[j][1], r);
            }

            ans.add(new int[] {l, r});
            i = j - 1;
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}
