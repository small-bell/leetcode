package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _74搜索二维矩阵 {
    public boolean searchMatrix(int[][] m, int target) {
        int l = 0, r = m.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (m[mid][0] == target){
                return true;
            }
            if (m[mid][0] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (r == -1) {
            return false;
        }
        int[] arr = m[r];
        l = 0; r = arr.length - 1;
        while (l <= r ) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                l = mid + 1;

            } else {
                r = mid - 1;
            }
        }
        return false;
    }

}
