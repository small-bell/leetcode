package dealed;

public class _74搜索二维矩阵 {
    public boolean searchMatrix(int[][] m, int target) {

        int l = 0, r = m.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (m[mid][0] == target) return true;
            else if (m[mid][0] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        int row = r;
        if (row < 0) return false;
        l = 0;
        r = m[0].length - 1;
        while (l <= r ) {
            int mid = (l + r) / 2;
            if (m[row][mid] == target) return true;
            else if (m[row][mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            int n = matrix[0].length;
            int left = -1;
            int right = m * n;
            while (left + 1 < right) {
                int mid = (left + right) >>> 1;
                int x = matrix[mid / n][mid % n];
                if (x == target) {
                    return true;
                }
                if (x < target) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
            return false;
        }
    }


    class Solution1 {
        public boolean searchMatrix(int[][] matrix, int target) {
            int i = 0;
            int j = matrix[0].length - 1;
            while (i < matrix.length && j >= 0) { // 还有剩余元素
                if (matrix[i][j] == target) {
                    return true; // 找到 target
                }
                if (matrix[i][j] < target) {
                    i++; // 这一行剩余元素全部小于 target，排除
                } else {
                    j--; // 这一列剩余元素全部大于 target，排除
                }
            }
            return false;
        }
    }
}
