class Solution {
    public String removeStars(String s) {
        int skip = 0;
        StringBuilder res = new StringBuilder();
        for (int i = s.length()-1; i > -1; i--) {
            if (s.charAt(i) == '*') {
                skip++;
            } else if (skip > 0) {
                skip--;
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.reverse().toString();
    }
}