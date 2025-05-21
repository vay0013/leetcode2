class Solution {
    public void setZeroes(int[][] matrix) {
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    list.add(new Pair(i, j));
                }
            }
        } 
        for (Pair<Integer, Integer> pair : list) {
            for (int i = 0; i < n; i++) {
                matrix[i][pair.getValue()] = 0;
            }
            for (int i = 0; i < m; i++) {
                matrix[pair.getKey()][i] = 0;
            }
        }
    }
}