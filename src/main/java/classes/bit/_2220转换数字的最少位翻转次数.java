package classes.bit;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _2220转换数字的最少位翻转次数 {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start^goal);
    }


}
