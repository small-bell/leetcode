package classes.binary;

import java.util.Arrays;

public class _2389和有限的最长子序列 {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = binarySearch(nums, queries[i]);// 找<= q的最右值
        }
        return ans;
    }

    private int binarySearch(int[] nums, int q) {
        int l = 0, r = nums.length - 1, res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] <= q) {
                res = mid;
                l = mid + 1;
            } else if (nums[mid ] > q) {
                r = mid - 1;
            }
        }
        return res + 1; //因为是索引，要变成数量
    }
}
