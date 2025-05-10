class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        if (grid[0][0] == 1) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        int[] dp = new int[col];
        dp[0] = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    dp[j] = 0;
                } else {
                    if (j > 0) {
                        dp[j] += dp[j - 1];
                    }
                }
            }
        }
        // 1 2 3
        // - 0 0
        // - 1 2
        return dp[col-1];
    }
}