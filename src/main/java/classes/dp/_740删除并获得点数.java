package classes.dp;

public class _740删除并获得点数 {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        int[] map = new int[max + 1];
        for (int x : nums) {
            map[x] += x;
        }
        int[] f = new int[max + 1];
        f[0] = map[0];
        f[1] = Math.max(map[0], map[1]);
        for (int i = 2; i < f.length; i++) {
            f[i] = Math.max(f[i - 2] + map[i], f[i - 1]);
        }

        return f[f.length - 1];
    }
}
