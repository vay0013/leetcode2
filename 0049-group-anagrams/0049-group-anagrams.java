class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            byte[] arr = new byte[26];
            for (char c : word.toCharArray()) {
                arr[c - 'a']++;
            }
            String key = new String(arr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}