package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _80删除有序数组中的重复项ii {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, j = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] == nums[j - 2]) {
                continue;
            }
            nums[j++] = nums[i];
        }
        return j;
    }
}
