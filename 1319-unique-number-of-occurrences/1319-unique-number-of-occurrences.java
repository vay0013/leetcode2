class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> seen = new HashSet<>();
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (seen.contains(m.getValue())) {
                return false;
            }
            seen.add(m.getValue());
        }
        return true;
    }
}