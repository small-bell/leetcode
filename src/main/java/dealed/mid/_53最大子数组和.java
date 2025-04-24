package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _53最大子数组和 {
    public int maxSubArray(int[] nums) {
        int ans = nums[0], sum = ans;

        for (int i = 1; i < nums.length; i++) {
            if (sum < 0 ) sum = 0;
            sum += nums[i];
            ans = Math.max(sum, ans);
        }
        return ans;
    }


    public int maxSubArray1(int[] nums) {
        int[] f = new int[nums.length];
        f[0] = nums[0];
        int ans = nums[0];
        for (int i = 1; i < f.length; i++) {
            if (f[i - 1] < 0) f[i] = nums[i];
            else f[i] = f[i - 1] + nums[i];
            ans = Math.max(ans, f[i]);
        }
        return ans;
    }



}
