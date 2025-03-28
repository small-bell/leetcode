public class BinarySearchRight {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3 , 4, 4, 4, 4, 4,5};
        int res = binarySearchLeft(nums, 4);
        System.out.println(res);
        res = binarySearchRight(nums, 4);
        System.out.println(res);
    }

    private static int binarySearchLeft(int[] nums, int target) {
        int l = 0, r = nums.length, result = -1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {

                r = mid;
            } else {
                result = mid;
                l = mid + 1;
            }
        }
        return result;
    }

    private static int binarySearchRight(int[] nums, int target) {
        int l = 0, r = nums.length, result = -1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {

                l = mid + 1;
            }
            else {
                result = mid;
                r = mid;
            }
        }
        return result;
    }



}
