package classes.bit;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _476数字的补数 {
    public int findComplement(int num) {
        int zeros = 31 - Integer.numberOfLeadingZeros(num);
        num = ~num;
        for (int i = zeros; i < 32; i++) {
            num = num & ~(1<<i);
        }
        return num;
    }


}
