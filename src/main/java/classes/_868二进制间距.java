package classes;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _868二进制间距 {
    public int binaryGap(int n) {
        int pre = -1, bit = 0, ans = 0;
        while (n > 0) {
            bit ++;
            if ((n & 1) == 1) {
                if (pre == -1 ) {
                    pre = bit;
                } else {
                    ans = Math.max(ans, bit - pre);
                    pre = bit;
                }
            }
            n >>= 1;
        }
        return ans;
    }


}
