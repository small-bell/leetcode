package dealed.easy;

public class _9回文数 {
    public boolean isPalindrome(int x) {
        // 如果<0或者末尾是0就直接返回
        if (x < 0 || (x > 0 && x % 10 == 0)) return false;
        int c = 0;
        // 折半
        while (x > c) {
            c = c * 10 + x % 10;
            x /= 10;
        }
        return x == c || x == c / 10;
    }
}
