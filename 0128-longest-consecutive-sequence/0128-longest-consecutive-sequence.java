class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 0;
        for (int num : set) {
            int count = 1;
            while (set.contains(num + count)) {
                count++;
            }
            res = Math.max(res, count);
        }
        return res;
    }
}