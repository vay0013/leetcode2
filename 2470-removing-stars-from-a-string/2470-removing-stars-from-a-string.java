class Solution {
    public String removeStars(String s) {
        int skip = 0;
        StringBuilder st = new StringBuilder();
        for (int i = s.length()-1; i > -1; --i) {
            char c = s.charAt(i);
            if (c == '*') {
                skip++;
            } else if (skip > 0) {
                skip--;
            } else {
                st.append(c);
            }
        }
        return st.reverse().toString();
    }
}