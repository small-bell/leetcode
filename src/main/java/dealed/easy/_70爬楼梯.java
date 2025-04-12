package dealed.easy;

public class _70爬楼梯 {
    public int climbStairs(int n) {
        int f1 = 1, f2 = 2;
        if (n == 1 ) return f1;
        if (n == 2) return f2;
        int ans = 0;
        for (int i = 3; i <= n; i++) {
            ans = f1 + f2;
            f1 = f2;
            f2 = ans;
        }
        return ans;
    }
}
