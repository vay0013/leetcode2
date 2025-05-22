class Solution {
    public int characterReplacement(String s, int k) {
        // end - start + 1
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int res = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            int maxFreq = 0;
            for (char key : map.keySet()) {
                maxFreq = Math.max(map.get(key), maxFreq);
            }
            if (i - start + 1 - maxFreq > k) {
                char cur = s.charAt(start++);
                map.put(cur, map.get(cur) - 1);
            }
            res = Math.max(i - start + 1, res);
        }
        return res;
    }
}