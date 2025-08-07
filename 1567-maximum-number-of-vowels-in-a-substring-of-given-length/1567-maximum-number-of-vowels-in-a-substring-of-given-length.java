class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
        int start = 0;
        int cur = 0;
        int res = 0;
        for (int end = 0; end < s.length(); end++) {
            cur += set.contains(s.charAt(end)) ? 1 : 0;
            if (end - start + 1 == k) {
                res = Math.max(res, cur);
                cur -= set.contains(s.charAt(start)) ? 1 : 0;
                start++;
            }
        }
        return res;
    }
}