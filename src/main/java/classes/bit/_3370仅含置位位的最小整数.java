package classes.bit;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _3370仅含置位位的最小整数 {
    public int smallestNumber(int n) {
        int cnt =31 - Integer.numberOfLeadingZeros(n);
        int num = 1;
        for (int i = 0; i < cnt; i++) {
            num <<= 1;
            num |= 1;
        }
        return num;
    }

    public int smallestNumber1(int n) {
        int m = 32 - Integer.numberOfLeadingZeros(n);
        return (1 << m) - 1;
    }


}
