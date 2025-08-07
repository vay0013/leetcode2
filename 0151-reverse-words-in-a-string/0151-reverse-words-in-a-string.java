class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i > -1; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }
}