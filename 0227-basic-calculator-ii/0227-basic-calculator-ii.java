class Solution {
    public int calculate(String s) {
        int res = 0, last = 0, cur = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                cur = (cur * 10) + (c - '0');
            }
            if (!Character.isDigit(c) && !Character.isWhitespace(c) || i == s.length()-1) {
                if (sign == '+' || sign == '-') {
                    res += last;
                    last = sign == '+' ? cur : -cur;
                } else if (sign == '*') {
                    last *= cur;
                } else if (sign == '/') {
                    last /= cur;
                }
                sign = c;
                cur = 0;
            }
        }
        return res + last;
    }
}