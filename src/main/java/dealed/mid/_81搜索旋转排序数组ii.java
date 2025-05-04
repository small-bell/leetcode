package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _81搜索旋转排序数组ii {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (r >= 1 && nums[r] == nums[l]) r --;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) return true;
            if (nums[mid] >= nums[0]) {
                if (target >= nums[0]) {
                    if (target >= nums[mid]) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                } else {
                    l = mid + 1;
                }
            } else {
                if (target >= nums[0]) {
                    r = mid - 1;
                } else {
                    if (target >= nums[mid]) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
            }
        }
        return  target == nums[nums.length - 1];
    }


}
