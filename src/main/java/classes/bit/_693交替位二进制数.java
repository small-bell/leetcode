package classes.bit;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _693交替位二进制数 {
    public boolean hasAlternatingBits(int n) {
        return ((n ^ (n >> 1) + 1) & n) == 0;
    }

}
