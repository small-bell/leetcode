package dealed.mid;

public class _34在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int left = searchLeft(nums, target);
        if (left == nums.length || nums[left ] != target) return new int[]{-1, -1};
        int right = searchRight(nums, target);;
        return new int[] {left, right};
    }

    private int searchRight(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = l + 1;
            }
        }
        return r;
    }

    private int searchLeft(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
}
