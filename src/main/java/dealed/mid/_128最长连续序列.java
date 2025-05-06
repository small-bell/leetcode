package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _128最长连续序列 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int ans = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
            st.add(nums[i]);
        }

        for (int c : st) {
            if (st.contains(c - 1)) continue;
            int curr =  0;
            while (st.contains(c++)) {
                curr ++;
            }
            ans = Math.max(ans, curr);
        }
        return ans;
    }

}
