package dealed;

public class _36有效的数独 {

    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][10];
        int[][] cols = new int[9][10];
        int[][][] xs = new int[3][3][10];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') continue;
                int num = board[i][j] - '0';
                if (rows[i][num] != 0 || cols[j][num] != 0 || xs[i/3][j/3][num] != 0) {
                    return false;
                } else {
                    rows[i][num] ++;
                    cols[j][num] ++;
                    xs[i/3][j/3][num] ++;
                }
            }
        }
        return true;
    }
}
