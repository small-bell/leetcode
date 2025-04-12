package dealed.easy;

public class _88合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r = m + n - 1;
        m--;n--;
        while (m >= 0 || n >= 0) {
            if (m < 0) {
                while (n >= 0) {
                    nums1[r --] = nums2[n --];
                }
                return;
            }
            if (n < 0) {
                while (m >= 0) {
                    nums1[r--] = nums1[m--];
                }
                return;
            }
            if (nums1[m] > nums2[n]) {
                nums1[r--] = nums1[m--];
            } else {
                nums1[r--] = nums2[n--];
            }
        }
    }
}
