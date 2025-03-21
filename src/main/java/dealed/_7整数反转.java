package dealed;

public class _7整数反转 {
    public int reverse(int x) {
        int res = 0;
        while ( x != 0) {
            if (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            res = res * 10 + digit;
        }
        return res ;
    }

    public static void main(String[] args) {
        int reverse = new _7整数反转().reverse(123);
        System.out.println(reverse);
    }

}
