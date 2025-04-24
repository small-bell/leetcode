package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _50Powwn {
    public double myPow(double x, int N) {
        double ans = 1.0;
        long n = N;
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        while (n != 0) {
            if (n % 2 == 1) {
                ans *= x;
            }
            x *= x;
            n /= 2;
        }
        return ans;
    }
}
