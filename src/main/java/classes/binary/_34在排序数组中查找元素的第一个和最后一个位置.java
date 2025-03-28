package classes.binary;

public class _34在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {

        int left = binarySearch(target, nums);
        if (left == nums.length || nums[left] != target) return new int[] {-1, -1};

        int right = binarySearch(target + 1, nums);
        return  new int[] {left, right - 1};
    }

//    private int binarySearch(int target, int[] nums) {
//        int l = 0, r = nums.length - 1;
//        while (l <= r) {
//            int mid = (l + r) / 2;
//            if (nums[mid] == target) r  = mid - 1;
//            else if (nums[mid] > target) r = mid - 1;
//            else l = mid + 1;
//        }
//        return l;
//    }

//    private int binarySearch(int target, int[] nums) {
//        int l = 0, r = nums.length;
//        while (l < r) {
//            int mid = (l + r) / 2;
//            if (nums[mid] >= target) r = mid;
//            else l = mid + 1;
//        }
//        return l;
//    }

    private int binarySearch(int target, int[] nums) {
        int l = -1, r = nums.length;
        while (l + 1 < r) {
            int mid = (l + r) / 2;
            if (nums[mid] >= target) r = mid;
            else l = mid;
        }
        return r;
    }
}
