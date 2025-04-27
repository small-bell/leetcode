package classes.bit;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _1356根据数字二进制下1的数目排序 {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] - b[0] != 0) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        for (int i = 0; i < arr.length; i++) {
            pq.offer(new int[] {
                    Integer.bitCount(arr[i]),
                    arr[i]
            });
        }
        int[] ans = new int[arr.length];
        int i = 0;
        while (!pq.isEmpty()) {
            ans[i++] = pq.poll()[1];
        }
        return ans;
    }

}
