class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int prev = -1;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (groups[i] != prev) {
                prev = groups[i];
                res.add(words[i]);
            }
        }
        return res;
    }
}