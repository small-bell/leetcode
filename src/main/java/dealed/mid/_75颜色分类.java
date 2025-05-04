package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _75颜色分类 {


    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1;
        for (int i = 0; i <= r; i++) {
            if (nums[i] == 0) {
                swap(nums, l++, i);
            } else if (nums[i] == 2) {
                swap(nums, r --, i);
                i --;
            }
            System.out.println(i + " " + l + " " + r);
            System.out.println(Arrays.toString(nums));
        }
    }


    private void swap(int[] nums, int l, int r) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }

    public static void main(String[] args) {
        new _75颜色分类().sortColors(new int[] {
                2,0,2,1,1,0
        });
    }
}
