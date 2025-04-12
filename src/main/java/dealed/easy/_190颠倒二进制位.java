package dealed.easy;

public class _190颠倒二进制位 {
    public int reverseBits(int n) {
        int ans = 0;
        int cnt = 32;
        while (cnt-- > 0) {
            ans <<= 1;
            ans += (n & 1);
            n >>= 1;
        }
        return ans;
    }

    public int reverseBits1(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int t = (n >> i) & 1;
            if (t == 1) {
                ans |= (1 << (31 - i));
            }
        }
        return ans;
    }
}
