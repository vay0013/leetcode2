class Solution {
    public String longestPalindrome(String s) {
        int[] res = new int[2];
        for (int i = 0; i < s.length(); i++) {
            int oddLen = expand(s, i, i);
            if (oddLen > res[1] - res[0] + 1) {
                int dist = oddLen / 2;
                res[0] = i - dist;
                res[1] = i + dist;
            }
            int evenLen = expand(s, i, i+1);
            if (evenLen > res[1] - res[0] + 1) {
                int dist = evenLen / 2 - 1;
                res[0] = i - dist;
                res[1] = i + 1 + dist;
            }
        }
        return s.substring(res[0], res[1]+1);
    }
    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}