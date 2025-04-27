package classes;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _1009十进制整数的反码 {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int zeros = 31 - Integer.numberOfLeadingZeros(n);
        n = ~n;
        for (int i = zeros; i < 32; i++) {
            n = n & ~(1 << i);
        }
        return n;
    }


}
