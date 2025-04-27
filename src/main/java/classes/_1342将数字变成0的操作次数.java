package classes;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _1342将数字变成0的操作次数 {
    public int numberOfSteps(int num) {
        int size = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num >>= 1;
                size ++;
            } else {
                num -= num & 1;
                size ++;
            }
        }
        return size;
    }

}
