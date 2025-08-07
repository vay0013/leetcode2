class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder sb = new StringBuilder();
        int p1 = 0;
        int p2 = 0;
        while (p1 < w1.length() || p2 < w2.length()) {
            if (p1 < w1.length()) {
                sb.append(w1.charAt(p1));
                p1++;
            }
            if (p2 < w2.length()) {
                sb.append(w2.charAt(p2));
                p2++;
            }
        }
        return sb.toString();
    }
}