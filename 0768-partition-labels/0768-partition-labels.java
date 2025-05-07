class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] = i;
        }
        int farthest = 0;
        int start = 0;
        List<Integer> res = new ArrayList<>();
        for (int end = 0; end < s.length(); end++) {
            farthest = Math.max(farthest, arr[s.charAt(end) - 'a']);
            if (end == farthest) {
                res.add(end - start + 1);
                start = end + 1;
            }
        }
        return res;
    }
}