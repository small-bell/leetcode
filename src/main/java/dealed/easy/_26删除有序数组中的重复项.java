package dealed.easy;

public class _26删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int l = 0, r = 0;
        while (r < nums.length) {
            int cur = nums[r];
            nums[l++] = cur;
            while (++r < nums.length && nums[r] == cur);
        }
        return l;
    }

    public int removeDuplicates1(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }

}
