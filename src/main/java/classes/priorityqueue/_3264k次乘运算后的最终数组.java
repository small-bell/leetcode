package classes.priorityqueue;

public class _3264k次乘运算后的最终数组 {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int small = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[small] > nums[j]) {
                    small = j;
                }
            }
            nums[small] *= multiplier;
        }
        return nums;
    }

}
