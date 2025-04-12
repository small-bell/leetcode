package dealed.easy;

public class _169多数元素 {
    public int majorityElement(int[] nums) {
        int val = nums[0];
        int size = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == val) size ++;
            else {
                size --;
                if (size == -1) {
                    size = 1;
                    val = nums[i];
                }
            }
        }
        return val;
    }
}
