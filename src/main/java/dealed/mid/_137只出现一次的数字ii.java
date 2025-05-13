package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _137只出现一次的数字ii {
    public int singleNumber1(int[] nums) {
        int ones = 0, twos = 0;
        for(int num : nums){
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int cur = 0;
            for (int j = 0; j < nums.length; j++) {
                cur += nums[j] >> i & 1;
            }
            ans |= cur % 3 << i;
        }
        return ans;
    }


}
