package dealed.mid;

public class _31下一个排列 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        for (; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) break;
        }

        if (i == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int j = nums.length - 1;
        for (; j >= 0; j --) {
            if (nums[j] > nums[i]) {
                break;
            }
        }
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

        reverse(nums, i + 1, nums.length - 1);

    }
    void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l ++;
            r --;
        }
    }



    public void nextPermutation1(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
