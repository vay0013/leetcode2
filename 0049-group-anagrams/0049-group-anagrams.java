class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] nums = new int[26];
            for (char c : s.toCharArray()) {
                nums[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i : nums) {
                sb.append(i).append('#');
            }
            map.putIfAbsent(sb.toString(), new ArrayList<>());
            map.get(sb.toString()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}