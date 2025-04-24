package dealed.mid;

public class _36有效的数独 {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[board.length][11];
        int[][] cols = new int[board.length][11];
        int[][][] grids = new int[3][3][11];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') continue;
                int c = board[i][j] - '0';
                if (rows[i][c] > 0 || cols[j][c] > 0 || grids[i / 3][j / 3][c] > 0) {
                    return false;
                }
                rows[i][c]++;
                cols[j][c]++;
                grids[i / 3][j / 3][c]++;
            }
        }
        return true;
    }
}
