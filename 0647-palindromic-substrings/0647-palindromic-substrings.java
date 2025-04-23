class Solution {
    public int countSubstrings(String s) {
        int res = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            res += findPalindrom(chars, i, i);
            res += findPalindrom(chars, i, i+1);
        }
        return res;
    }
    private int findPalindrom(char[] chars, int left, int right) {
        int count = 0;
        while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}