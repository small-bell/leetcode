package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _43字符串相乘 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }


        int[] ans = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            int curr = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int jcurr = num2.charAt(j) - '0';
                int mul = jcurr * curr + ans[i + j + 1];
                ans[i + j + 1] = mul % 10;
                ans[i + j] += mul / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ans.length; i++) {
            if (i == 0 && ans[i] == 0) continue;
            sb.append(ans[i]);
        }
        return sb.toString();
    }
}
