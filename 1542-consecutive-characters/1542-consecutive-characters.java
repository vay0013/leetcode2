class Solution {
    public int maxPower(String s) {
        int res = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(start) != s.charAt(i)) {
                start = i;
            }
            res = Math.max(res, i - start);
        }
        return res+1;
    }
}