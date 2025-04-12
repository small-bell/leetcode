package dealed.easy;

public class _69x的平方根 {
    public int mySqrt(int x) {
        long l = 1, r = x;
        while (l <= r) {
            long mid = (l + r) / 2;
            if (mid * mid > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int)r;
    }
}
