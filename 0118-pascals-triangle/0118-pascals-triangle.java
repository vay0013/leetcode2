class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(List.of(1));
        for (int i = 0; i < numRows-1; i++) {
            List<Integer> cur = new ArrayList<>();
            int len = res.get(i).size();
            var prev = res.get(i);
            cur.add(1);
            for (int j = 1; j < len; j++) {
                cur.add(prev.get(j-1) + prev.get(j));
            }
            cur.add(1);
            res.add(cur);
        }
        return res;
    }
}