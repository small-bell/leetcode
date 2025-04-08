package dealed;

public class _50Pow_x_n {


    class Solution {
        public double myPow(double x, int n) {
            return n >= 0 ? quickMulty(x, n) : 1.0 / quickMulty(x, -n);
        }

        private double quickMulty(double x, int n) {
            if (n == 0) {
                return 1.0;
            }
            double v = quickMulty(x, n / 2);
            if (n % 2 == 0) {
                return v * v;
            } else {
                return v * v * x;
            }
        }
    }
}
