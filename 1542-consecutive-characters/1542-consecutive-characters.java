class Solution {
    public int maxPower(String s) {
        int res = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            if (s.charAt(end) != s.charAt(start)) {
                start = end;
            }
            res = Math.max(end - start + 1, res);
        }
        return res;
    }
}