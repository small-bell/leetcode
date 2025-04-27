package classes.bit;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _461汉明距离 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }


}
