package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _73矩阵置零 {
    public void setZeroes(int[][] matrix) {
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];
        Arrays.fill(rows, 1);
        Arrays.fill(cols, 1);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    rows[i] = 0;
                    cols[j] = 0;
                }
            }
        }
        for (int i = 0; i < rows.length; i++) {
            if (rows[i] == 0){
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < cols.length; i++) {
            if (cols[i] == 0){
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }


}
