package dealed;

public class _55跳跃游戏 {
    class Solution {
        public boolean canJump(int[] nums) {
            int n = nums.length;
            int rightmost = 0;
            for (int i = 0; i < n; ++i) {
                if (i <= rightmost) {
                    rightmost = Math.max(rightmost, i + nums[i]);
                    if (rightmost >= n - 1) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
            return false;
        }
    }
}
