package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _45跳跃游戏ii {
    public int jump(int[] nums) {
        int ans = 0, mx = 0, l = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == l) {
                ans ++;
                l = mx;
            }
            mx = Math.max(mx, nums[i] + i);
        }
        return ans;
    }

}
