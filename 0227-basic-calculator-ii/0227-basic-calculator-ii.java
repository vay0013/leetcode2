class Solution {
    public int calculate(String s) {
        int last = 0, cur = 0, result = 0;
        char sign = '+';
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                cur = (cur * 10) + (c - '0');
            }
            if (!Character.isDigit(c) && !Character.isWhitespace(c) || i == len-1) {
                if (sign == '+' || sign == '-') {
                    result += last;
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
        result += last;
        return result;
    }
}