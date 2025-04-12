package dealed.easy;

public class _27移除元素 {
    public int removeElement(int[] nums, int val) {
        int l = 0, r = 0, ans = 0;
        while (r < nums.length) {
            if (nums[r] != val) {
                nums[l++] = nums[r];
                ans ++;
            }
            r ++;
        }
        return ans;
    }
}
