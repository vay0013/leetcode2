class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] h = new int[cols+1];
        int res = 0;
        for (char[] row : matrix) {
            for (int i = 0; i < cols; i++) {
                h[i] = (row[i] == '1') ? h[i] + 1 : 0;
            }
            int n = h.length;
            for (int i = 0; i < n; i++) {
                for (int j = i, minH = Integer.MAX_VALUE; j < n; j++) {
                    minH = Math.min(minH, h[j]);
                    int area = minH * (j - i + 1);
                    res = Math.max(res, area);
                }
            }
        }
        return res;
    }
}