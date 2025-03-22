package dealed;

public class _45跳跃游戏ii {
    public int jump(int[] nums) {
        int ans = 0, max = 0, target = nums.length - 1, last = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, nums[i] + i);
            if (last == i) {
                last = max;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int jump = new _45跳跃游戏ii().jump(new int[]{2, 3, 1, 1, 4});
        System.out.println(jump);
    }
}
