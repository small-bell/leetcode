package dealed;

public class _152乘积最大子数组 {
    public int maxProduct(int[] nums) {
//        fi = fi-1*Ni fi-1
        int[] max = new int[nums.length + 1];
        int[] min = new int[nums.length + 1];
        max[0] = Integer.MIN_VALUE;
        max[1] = nums[0];
        min[0] = Integer.MIN_VALUE;
        min[1] = nums[0];
        for (int i = 2; i < nums.length + 1; i++) {
            max[i] = Math.max(Math.max(max[i - 1 ] * nums[i - 1], min[i - 1] * nums[i - 1]), nums[i - 1]);
            min[i] = Math.min(Math.min(min[i - 1 ] * nums[i - 1], max[i - 1] * nums[i - 1]), nums[i - 1]);
        }
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < max.length; i++) {
            res = Math.max( max[i], res);
        }
        return res;
    }
}
