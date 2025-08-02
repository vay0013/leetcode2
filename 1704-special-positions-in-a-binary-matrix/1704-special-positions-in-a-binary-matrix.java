class Solution {
    public int numSpecial(int[][] mat) {
        int res = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && isValid(mat, i, j)) {
                    res++;
                }
            }
        }
        return res;
    }

    private boolean isValid(int[][] mat, int x, int y) {
        int dx = 0;
        int dy = 0;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][y] == 1) {
                dy++;
            }
        }
        for (int i = 0; i < mat[0].length; i++) {
            if (mat[x][i] == 1) {
                dx++;
            }
        }
        return dx == 1 && dy == 1;
    }
}