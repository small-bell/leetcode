package dealed;

public class _48旋转图像 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int r1 = 0, r2 = 0, r3 = n - 1, r4 = n - 1;
        int c1 = 0, c2 = n - 1, c3 = 0, c4 = n - 1;
        int op = n - 1;
        while (r1 < r3) {
            for (int i = 0; i < op; i++) {
                int tmp = matrix[r1][c1 + i];
                matrix[r1][c1 + i] = matrix[r3 - i][c3];
                matrix[r3 - i][c3] = matrix[r4][c4 - i];
                matrix[r4][c4 - i] = matrix[r2 + i][c2];
                matrix[r2 + i][c2] = tmp;
            }
            op -= 2;
            r1 ++;
            c1++;

            r2 ++;
            c2 --;

            r3 --;
            c3 ++;

            r4 --;
            c4--;
        }
    }


    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < (n + 1) / 2; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[n - 1 - j][i];
                    matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                    matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                    matrix[j][n - 1 - i] = tmp;
                }
            }
        }
    }
}
