package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _48旋转图像 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < (matrix[0].length + 1) / 2; j++) {
                // 3 3   3 3
                // 0 0 | 0 1
                int tmp =                       matrix[i][j];
                // 2 0 | 1 0
                matrix[i][j] =                  matrix[n - j - 1][i];
                matrix[n - j - 1][i] =          matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] =  matrix[j][n - i - 1];
                matrix[j][n - i - 1] =  tmp;
            }
        }
    }
}
