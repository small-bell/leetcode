package classes.bit;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _3226使两个整数相等的位更改次数 {
    public int minChanges(int n, int k) {
        return (n & k) == k ? Integer.bitCount(n ^ k): -1;
    }


}
