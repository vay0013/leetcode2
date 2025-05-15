class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(List.of(1));
        for (int i = 0; i < rowIndex; i++) {
            List<Integer> cur = new ArrayList<>();
            List<Integer> prev = res.get(i);
            int size = prev.size();
            cur.add(1);
            for (int j = 1; j < size; j++) {
                cur.add(prev.get(j-1) + prev.get(j));
            }
            cur.add(1);
            res.add(cur);
        }
        return res.get(rowIndex);
    }
}