package dealed;

public class _34在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int right = binarySearchRight(nums, target);
        if (right == -1 || nums[right] != target) return new int[] {-1, -1};
        int left = binarySearchLeft(nums, target);
        return  new int[] {left, right};
    }
    private static int binarySearchLeft(int[] nums, int i) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= i) r = mid - 1;
            else l = mid + 1;
        }
        return l;
    }

    private static int binarySearchRight(int[] nums, int i) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= i) l = mid + 1;
            else if (nums[mid] > i) r = mid - 1;
        }
        return l - 1;

        // return r;也可以，统一写法就l-1吧
    }
}
