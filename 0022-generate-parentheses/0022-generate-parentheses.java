class Solution {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        bt("", 0, 0, n);
        return res;
    }
    private void bt(String acc, int op, int cl, int n) {
        if (op + cl == n * 2) {
            res.add(acc);
            return;
        }
        if (op < n) {
            bt(acc+"(", op+1, cl, n);
        } 
        if (cl < op) {
            bt(acc+")", op, cl+1, n);
        }
    }
}