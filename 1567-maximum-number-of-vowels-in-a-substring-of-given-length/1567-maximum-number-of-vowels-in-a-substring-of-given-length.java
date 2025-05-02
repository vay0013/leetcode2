class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
        int start = 0;
        int window = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                window++;
            }
            if (i - start + 1 == k) {
                res = Math.max(res, window);
                if (set.contains(s.charAt(start))) {
                    window--;
                }
                start++;
            }
        }
        return res;
    }
}