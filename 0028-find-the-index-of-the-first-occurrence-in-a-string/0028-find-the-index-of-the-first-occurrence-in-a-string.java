class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length()+1; i++) {
            int p = 0;
            while (p < needle.length() && 
            haystack.charAt(i+p) == needle.charAt(p)) {
                p++;
            }
            if (p == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}