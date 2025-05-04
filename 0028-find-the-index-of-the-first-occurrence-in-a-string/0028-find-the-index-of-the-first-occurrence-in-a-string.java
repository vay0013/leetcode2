class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        int n = haystack.length();
        if (len > n) {
            return -1;
        }
        for (int i = 0; i < n - len + 1; i++) {
            int p = 0;
            while (p < len && haystack.charAt(i+p) == needle.charAt(p)) {
                p++;
            }
            if (p == len) {
                return i;
            }
        }
        return -1;
    }
}