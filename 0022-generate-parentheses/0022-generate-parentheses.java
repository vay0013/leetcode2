class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        bt("", 0, 0, n);
        return res;
    }
    private void bt(String s, int op, int cl, int n) {
        if (s.length() == n*2) {
            res.add(s);
            return;
        }
        if (op < n) {
            bt(s+"(", op+1, cl, n);
        }
        if (cl < op) {
            bt(s+")", op, cl+1, n);
        }
    }
}