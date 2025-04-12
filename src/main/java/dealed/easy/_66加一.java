package dealed.easy;

public class _66加一 {
    public int[] plusOne(int[] digits) {
        int curry = 0;
        int cur = 0;
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (i == digits.length - 1) {
                cur = digits[i] + 1;
            } else {
                cur = digits[i] + curry;
            }
            curry = cur / 10;
            digits[i] = cur % 10;
        }
        if (curry == 0) return digits;
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public int[] plusOne1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
