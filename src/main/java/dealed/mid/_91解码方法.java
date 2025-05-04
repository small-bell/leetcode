package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _91解码方法 {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int[] f = new int[s.length() +1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= s.length(); i++) {
            int num = Integer.parseInt(s.substring(i - 1, i));
            if ( num > 0 && num < 10) {
                f[i] = f[i - 1];
            }
            num = Integer.parseInt(s.substring(i - 2, i));
            if (num > 9 && num < 27 ) {
                f[i] += f[i - 2];
            }
        }
        return f[s.length()];
    }
}
