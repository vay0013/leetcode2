class Solution {
    public String makeFancyString(String s) {
        int count = 1;
        char prev = s.charAt(0);
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == prev) {
                if(count < 3) {
                    result.append(c);
                    count++;
                }
            } else {
                result.append(c);
                count = 2;
                prev = c;
            }
        }
        return result.toString();
    }
}