class Solution {
    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        int[][] output = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1)
                    output[i][j] = status_one(board, i, j, m, n);
                else output[i][j] = status_zero(board, i, j, m, n);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                board[i][j] = output[i][j];
        }
    }

    public int status_zero(int[][] board, int x, int y, int m, int n) {
        // if exactly three neighbours --> 1
        int count = 0;

        if (x + 1 < m && y + 1 < n && board[x + 1][y + 1] == 1)
            count += 1;
        if (x - 1 >= 0 && y - 1 >= 0 && board[x - 1][y - 1] == 1)
            count += 1;
        if (y + 1 < n && board[x][y + 1] == 1)
            count += 1;
        if (y - 1 >= 0 && board[x][y - 1] == 1)
            count += 1;
        if (x + 1 < m && board[x + 1][y] == 1)
            count += 1;
        if (x - 1 >= 0 && board[x - 1][y] == 1)
            count += 1;
        if (x - 1 >= 0 && y + 1 < n && board[x - 1][y + 1] == 1)
            count += 1;
        if (x + 1 < m && y - 1 >= 0 && board[x + 1][y - 1] == 1)
            count += 1;

        if (count == 3)
            return 1;
        return 0;
    }

    public int status_one(int[][] board, int x, int y, int m, int n) {
        // if exactly three neighbours --> 1
        int count = 0;

        if (x + 1 < m && y + 1 < n && board[x + 1][y + 1] == 1)
            count += 1;
        if (x - 1 >= 0 && y - 1 >= 0 && board[x - 1][y - 1] == 1)
            count += 1;
        if (y + 1 < n && board[x][y + 1] == 1)
            count += 1;
        if (y - 1 >= 0 && board[x][y - 1] == 1)
            count += 1;
        if (x + 1 < m && board[x + 1][y] == 1)
            count += 1;
        if (x - 1 >= 0 && board[x - 1][y] == 1)
            count += 1;
        if (x - 1 >= 0 && y + 1 < n && board[x - 1][y + 1] == 1)
            count += 1;
        if (x + 1 < m && y - 1 >= 0 && board[x + 1][y - 1] == 1)
            count += 1;

        if (count == 2 || count == 3)
            return 1;
        return 0;
    }
}
