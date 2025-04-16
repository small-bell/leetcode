package dealed.mid;

// 这long转换的真煎熬
public class _29两数相除 {
    public int divide(int dividend, int divisor) {
        int flag = 1;
        long div = (long)dividend, dor = (long)divisor;
        if (div < 0) {
            div = -div;
            flag = -flag;
        }
        if (divisor < 0) {
            dor = (long)-dor;
            flag = -flag;
        }
        if (div < dor) return 0;

        long l = 1, r = div;
        while (l <= r) {
            long mid = (l + r) / 2;
            if (mid * dor > div) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        r = r * flag;
        if (r > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (r < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)r;
    }

    public static void main(String[] args) {
        int divide = new _29两数相除().divide(-1010369383, -2147483648);
        System.out.println(divide);
//        System.out.println(-((long)-2147483648));
    }
}
