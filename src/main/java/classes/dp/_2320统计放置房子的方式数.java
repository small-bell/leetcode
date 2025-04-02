package classes.dp;

public class _2320统计放置房子的方式数 {
    static final int MOD = (int) 1e9 + 7, MX = (int) 1e4 + 1;
    public int countHousePlacements(int n) {
        int[] f = new int[n + 1] ;
        f[0] = 1;
        f[1] = 2;
        for (int i = 2; i <= n; i++) {
            f[i] = (f[i - 2] + f[i - 1]) % MOD;
        }
        return (int) ((long) f[n] * f[n] % MOD);
    }
}
