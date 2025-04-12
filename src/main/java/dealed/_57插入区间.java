package dealed;

import java.util.ArrayList;

public class _57插入区间 {

    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            ArrayList<int[]> res = new ArrayList<>();
            int len = intervals.length;
            int i = 0;
            // 判断左边不重合
            while (i < len && intervals[i][1] < newInterval[0]) {
                res.add(intervals[i]);
                i++;
            }
            // 判断重合
            while (i < len && intervals[i][0] <= newInterval[1]) {
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
                i++;
            }
            res.add(newInterval);
            // 判断右边不重合
            while (i < len && intervals[i][0] > newInterval[1]) {
                res.add(intervals[i]);
                i++;
            }
            return res.toArray(new int[0][]);
        }
    }
}
