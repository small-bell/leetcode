package dealed;

public class _31下一个排列 {
    // 纯纯一个找规律题先找最后一个转弯值，再从右面找比他大的第一个数字进行反转，把cur后面的所有的进行反转
    public void nextPermutation(int[] nums) {
        int cur = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                cur = i;
                break;
            }
        }
        if (cur >= 0) {
            int swp = 0;
            for (int i = nums.length - 1; i >= 0 ; i--) {
                if (nums[i] > nums[cur]) {
                    swp = i;
                    break;
                }
            }
            swap(nums, cur, swp);
        }

        reverse(nums, cur + 1);
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void reverse(int[] nums, int start) {
        int l = start, r = nums.length - 1;
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        new _31下一个排列().nextPermutation(new int[] {3, 2, 1});
    }

/**
 *
 *
 * 123
 * 132
 * 213
 * 231
 * 312
 * 321
 */
}
