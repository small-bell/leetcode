package dealed.mid;

public class _33搜索旋转排序数组 {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) return mid;
            // 判断mid和target都落在哪个部分
            if (nums[mid] >= nums[0]) {
                if (target >= nums[0]) {
                    if (nums[mid] > target) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                } else {
                    l = mid + 1;
                }
            } else {
                if (target >= nums[0]) {
                    r = mid -1;
                } else {
                    if (nums[mid] > target) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
