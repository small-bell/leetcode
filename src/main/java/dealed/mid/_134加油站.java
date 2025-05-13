package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _134加油站 {
    // 暴力超时了
//    public int canCompleteCircuit(int[] gas, int[] cost) {
//        for (int i = 0; i < gas.length; i++) {
//            int cur = i, lft = 0;
//            while (lft >= 0) {
//                lft += gas[cur] - cost[cur];
//                if (lft < 0) break;
//                cur = (cur +1) % gas.length;
//                if (cur == i) return i;
//            }
//        }
//        return -1;
//    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int minId = 0, min = Integer.MAX_VALUE, sum = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < min) {
                min = sum;
                minId = i;
            }
        }
        return sum >= 0 ? (minId + 1) % gas.length : -1;
    }

}
