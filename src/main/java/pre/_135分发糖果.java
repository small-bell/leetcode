package pre;

import java.util.Arrays;

public class _135分发糖果 {

    public int candy(int[] ratings) {
        int[] nums = new int[ratings.length];
        Arrays.fill(nums, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                nums[i] =  nums[i - 1] + 1;
            }
        }

        for (int i = ratings.length - 2; i >= 0 ; i--) {
            if (ratings[i] > ratings[i + 1] ) {
                nums[i] = Math.max(nums[i], nums[i + 1] + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }

}
