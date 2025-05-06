class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += mat[i][i] + mat[n-i-1][i];
        }
        if (n % 2 != 0) {
            res -= mat[n/2][n/2];
        }
        return res;
    }
}